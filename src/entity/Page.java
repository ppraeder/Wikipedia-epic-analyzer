package entity;

import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;

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

	private String extract;

	private LinkedHashMap<String, LinkedHashMap<String, String>> extractMap;
	private LinkedHashMap<String, ToneAnalysis> toneMap;

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
	public int getPageid() {
		return pageid;
	}

	/**
	 * Sets the pageid.
	 *
	 * @param pageid
	 *            the new pageid
	 */
	public void setPageid(int pageid) {
		this.pageid = pageid;
	}

	public String getExtract() {
		return extract;
	}

	public void setExtract(String extract) {
		this.extract = extract;
	}

	public LinkedHashMap<String, LinkedHashMap<String, String>> getExtractMap() {
		return extractMap;
	}

	public void setExtractMap(LinkedHashMap<String, LinkedHashMap<String, String>> extractMap) {
		this.extractMap = extractMap;
	}

	public void groupExtract() {
		String ex = this.getExtract();
		Matcher m = Pattern.compile("\\={2}(.*?)={2}").matcher(ex);
		this.setExtractMap(getExtractMap(m, ex));
		//this.setExtract(null);
	}

	private LinkedHashMap<String, LinkedHashMap<String, String>> getExtractMap(Matcher m, String extract) {
		int start = 0;
		LinkedHashMap<String, LinkedHashMap<String, String>> extractMap = new LinkedHashMap<String, LinkedHashMap<String, String>>();

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
			// Falsche Überschrift ausgewählt
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
	 * Returns the trimmed substring
	 * 
	 * @param string
	 *            the String to be trimmed and cutted
	 * @param start
	 *            the start position
	 * @param end
	 *            the end position
	 * @return
	 */
	private String getTrimmedSubString(String string, int start, int end) {
		return string.substring(start, end).trim();
	}

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
			// Falsche Überschrift ausgewählt
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

	public LinkedHashMap<String, ToneAnalysis> getToneMap() {
		if (this.toneMap == null) {
			this.toneMap = new LinkedHashMap<String, ToneAnalysis>();
		}
		return this.toneMap;
	}

	public void setToneMap(LinkedHashMap<String, ToneAnalysis> toneMap) {
		this.toneMap = toneMap;
	}

}
