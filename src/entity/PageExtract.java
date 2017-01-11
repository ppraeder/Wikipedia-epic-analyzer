/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package entity;

import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;

import entity.receptiviti.ReceptivitiAnalysis;

/**
 * 
 * This class contains for each page the text for each subline. Optional it can
 * contain the analysis from IBM Watson tone analyzer and/or Receptivity(LIWC)
 *
 */
public class PageExtract {

	/** The page id. */
	private int pageId;

	/** The heading. */
	private String heading;

	/** The content. */
	private String content;

	/** The ibm tone. */
	private ToneAnalysis ibmTone;

	/** The liwc tone. */
	private ReceptivitiAnalysis liwcTone;

	/**
	 * Instantiates a new page extract.
	 *
	 * @param heading
	 *            the heading
	 * @param content
	 *            the content
	 */
	public PageExtract(String heading, String content) {
		this.heading = heading;
		this.content = content;
	}

	/**
	 * Instantiates a new page extract.
	 *
	 * @param pageId
	 *            the page id
	 * @param heading
	 *            the heading
	 * @param content
	 *            the content
	 */
	public PageExtract(int pageId, String heading, String content) {
		this.heading = heading;
		this.pageId = pageId;
		this.content = content;
	}

	/**
	 * Instantiates a new page extract.
	 *
	 * @param pageId
	 *            the page id
	 * @param content
	 *            the content
	 */
	public PageExtract(int pageId, String content) {
		this.pageId = pageId;
		this.content = content;
	}

	/**
	 * Gets the heading.
	 *
	 * @return the heading
	 */
	public String getHeading() {
		return heading;
	}

	/**
	 * Sets the heading.
	 *
	 * @param heading
	 *            the new heading
	 */
	public void setHeading(String heading) {
		this.heading = heading;
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
	 * Gets the content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the content.
	 *
	 * @param content
	 *            the new content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Gets the page id.
	 *
	 * @return the page id
	 */
	public int getPageId() {
		return pageId;
	}

	/**
	 * Sets the page id.
	 *
	 * @param pageId
	 *            the new page id
	 */
	public void setPageId(int pageId) {
		this.pageId = pageId;
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

}
