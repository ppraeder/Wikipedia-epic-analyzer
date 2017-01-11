/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentSentiment;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;

import entity.receptiviti.ReceptivitiAnalysis;

/**
 * The Class Page.
 */
public class Page {

	/** The title. */
	private String title;

	/** The ns. */
	private int ns;

	/** The pageid. */
	private int pageid;

	/** The earliest year. */
	private int earliestYear;

	/** The latest year. */
	private int latestYear;

	/** The extract. */
	private String extract;

	/** The extract map. */
	private LinkedHashMap<String, LinkedHashMap<String, String>> extractMap;

	/** The tone map. */
	private LinkedHashMap<String, ToneAnalysis> toneMap;

	/** The ibm tone. */
	private ToneAnalysis ibmTone;

	/** The liwc tone. */
	private ReceptivitiAnalysis liwcTone;

	/** The document sentiment. */
	private DocumentSentiment documentSentiment;

	/** The page extracts. */
	private List<PageExtract> pageExtracts;

	/**
	 * Instantiates a new page.
	 *
	 * @param pageId
	 *            the page id
	 * @param title
	 *            the title
	 */
	public Page(int pageId, String title) {
		this.pageid = pageId;
		this.title = title;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title
	 *            the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the ns.
	 *
	 * @return the ns
	 */
	public int getNs() {
		return ns;
	}

	/**
	 * Sets the ns.
	 *
	 * @param ns
	 *            the new ns
	 */
	public void setNs(int ns) {
		this.ns = ns;
	}

	/**
	 * Gets the pageid.
	 *
	 * @return the pageid
	 */
	public int getPageId() {
		return pageid;
	}

	/**
	 * Sets the pageid.
	 *
	 * @param pageid
	 *            the new pageid
	 */
	public void setPageId(int pageid) {
		this.pageid = pageid;
	}

	/**
	 * Gets the extract.
	 *
	 * @return the extract
	 */
	public String getExtract() {
		return extract;
	}

	/**
	 * Sets the extract.
	 *
	 * @param extract
	 *            the new extract
	 */
	public void setExtract(String extract) {
		this.extract = extract;
	}

	/**
	 * Gets the extract map.
	 *
	 * @return the extract map
	 */
	public LinkedHashMap<String, LinkedHashMap<String, String>> getExtractMap() {
		return extractMap;
	}

	/**
	 * Sets the extract map.
	 *
	 * @param extractMap
	 *            the extract map
	 */
	public void setExtractMap(LinkedHashMap<String, LinkedHashMap<String, String>> extractMap) {
		this.extractMap = extractMap;
	}

	/**
	 * Find headlines in wikitext format and split the whole content into parts.
	 */
	public void groupExtract() {
		String ex = this.getExtract();
		Matcher m = Pattern.compile("\\={2}(.*?)={2}").matcher(ex);
		this.setExtractMap(getExtractMap(m, ex));
	}

	/**
	 * Gets the extract map.
	 *
	 * @param m
	 *            the m
	 * @param extract
	 *            the extract
	 * @return A map with the headlines as key and the contents below as value
	 */
	private LinkedHashMap<String, LinkedHashMap<String, String>> getExtractMap(Matcher m, String extract) {
		int start = 0;
		LinkedHashMap<String, LinkedHashMap<String, String>> extractMap = new LinkedHashMap<String, LinkedHashMap<String, String>>();

		// Define headline for text at the beginning which has no headline
		String caption = "Abstract";
		int end = 0;
		String content = "";
		if (m.find()) {
			end = m.start();
			content = getTrimmedSubString(extract, start, end);
			extractMap.put(caption, getInnerExtractMap(content));
			start = m.end();
			caption = m.group(1).trim();
		}
		while (m.find()) {
			// Wrong headline collected
			if (m.group(1).startsWith("=")) {
				continue;
			}
			end = m.start();
			content = getTrimmedSubString(extract, start, end);
			extractMap.put(caption, getInnerExtractMap(content));
			start = m.end();
			caption = m.group(1).trim();
		}
		content = getTrimmedSubString(extract, start, extract.length());
		extractMap.put(caption, getInnerExtractMap(content));
		return extractMap;
	}

	/**
	 * Returns the trimmed substring.
	 *
	 * @param string
	 *            the String to be trimmed and cutted
	 * @param start
	 *            the start position
	 * @param end
	 *            the end position
	 * @return the trimmed sub string
	 */
	private String getTrimmedSubString(String string, int start, int end) {
		return string.substring(start, end).trim();
	}

	/**
	 * Gets the inner extract map.
	 *
	 * @param extract
	 *            the extract
	 * @return the inner extract map
	 */
	private LinkedHashMap<String, String> getInnerExtractMap(String extract) {
		Matcher m = Pattern.compile("\\={3}(.*?)={3}").matcher(extract);
		int start = 0;
		LinkedHashMap<String, String> extractMap = new LinkedHashMap<String, String>();
		String caption = "Abstract";
		int end = 0;
		String content = "";
		if (m.find()) {
			end = m.start();
			content = getTrimmedSubString(extract, start, end);
			extractMap.put(caption, content);
			start = m.end();
			caption = m.group(1).trim();
		}
		while (m.find()) {
			// Wrong headline collected
			if (m.group(1).startsWith("=")) {
				continue;
			}
			end = m.start();
			content = getTrimmedSubString(extract, start, end);
			extractMap.put(caption, content);
			start = m.end();
			caption = m.group(1).trim();
		}
		content = getTrimmedSubString(extract, start, extract.length());
		extractMap.put(caption, content);
		return extractMap;
	}

	/**
	 * Gets the tone map.
	 *
	 * @return the tone map
	 */
	public LinkedHashMap<String, ToneAnalysis> getToneMap() {
		if (this.toneMap == null) {
			this.toneMap = new LinkedHashMap<String, ToneAnalysis>();
		}
		return this.toneMap;
	}

	/**
	 * Sets the tone map.
	 *
	 * @param toneMap
	 *            the tone map
	 */
	public void setToneMap(LinkedHashMap<String, ToneAnalysis> toneMap) {
		this.toneMap = toneMap;
	}

	/**
	 * Gets the page extracts.
	 *
	 * @return the page extracts
	 */
	public List<PageExtract> getPageExtracts() {
		return pageExtracts;
	}

	/**
	 * Sets the page extracts.
	 *
	 * @param pageExtracts
	 *            the new page extracts
	 */
	public void setPageExtracts(List<PageExtract> pageExtracts) {
		this.pageExtracts = pageExtracts;
	}

	/**
	 * Adds the page extract.
	 *
	 * @param pageExtract
	 *            the page extract
	 */
	public void addPageExtract(PageExtract pageExtract) {
		if (this.pageExtracts == null) {
			this.pageExtracts = new ArrayList<>();
		}
		this.pageExtracts.add(pageExtract);
	}

	/**
	 * Gets the ibm tone.
	 *
	 * @return the ibm tone
	 */
	public ToneAnalysis getIbmTone() {
		return ibmTone;
	}

	/**
	 * Sets the ibm tone.
	 *
	 * @param ibmTone
	 *            the new ibm tone
	 */
	public void setIbmTone(ToneAnalysis ibmTone) {
		this.ibmTone = ibmTone;
	}

	/**
	 * Gets the liwc tone.
	 *
	 * @return the liwc tone
	 */
	public ReceptivitiAnalysis getLiwcTone() {
		return liwcTone;
	}

	/**
	 * Sets the liwc tone.
	 *
	 * @param liwcTone
	 *            the new liwc tone
	 */
	public void setLiwcTone(ReceptivitiAnalysis liwcTone) {
		this.liwcTone = liwcTone;
	}

	/**
	 * Gets the earliest year.
	 *
	 * @return the earliest year
	 */
	public int getEarliestYear() {
		return earliestYear;
	}

	/**
	 * Sets the earliest year.
	 *
	 * @param earliestYear
	 *            the new earliest year
	 */
	public void setEarliestYear(int earliestYear) {
		this.earliestYear = earliestYear;
	}

	/**
	 * Gets the latest year.
	 *
	 * @return the latest year
	 */
	public int getLatestYear() {
		return latestYear;
	}

	/**
	 * Sets the latest year.
	 *
	 * @param latestYear
	 *            the new latest year
	 */
	public void setLatestYear(int latestYear) {
		this.latestYear = latestYear;
	}

	/**
	 * Gets the document sentiment.
	 *
	 * @return the document sentiment
	 */
	public DocumentSentiment getDocumentSentiment() {
		return documentSentiment;
	}

	/**
	 * Sets the document sentiment.
	 *
	 * @param documentSentiment
	 *            the new document sentiment
	 */
	public void setDocumentSentiment(DocumentSentiment documentSentiment) {
		this.documentSentiment = documentSentiment;
	}

}
