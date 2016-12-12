package entity;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	private Map<String, String> extractMap;

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

	public Map<String, String> getExtractMap() {
		return extractMap;
	}

	public void setExtractMap(Map<String, String> extractMap) {
		this.extractMap = extractMap;
	}

	public void shortenExtract() {
		String ex = this.getExtract();
		// System.out.println(ex.replaceAll("={4}(.*?)={4}", "YYYY"));
		Matcher m = Pattern.compile("\\={2}(.*?)={2}").matcher(ex); // \\={2}(.*?)={2}
		this.setExtractMap(getExtractMap(m, ex));
	}

	private Map<String, String> getExtractMap(Matcher m, String extract) {
		int start = 0;
		Map<String, String> extractMap = new HashMap<String, String>();
		String caption = "Abstract";
		int end = 0;
		String content = "";
		if (m.find()) {
			end = m.start();
			content = extract.substring(start, end).trim();
			extractMap.put(caption, content);
			start = m.end();
			caption = m.group(1).trim();
		}
		while (m.find()) {
			end = m.start();
			content = extract.substring(start, end).trim();
			extractMap.put(caption, content);
			start = m.end();
			caption = m.group(1).trim();
		}
		content = extract.substring(start, extract.length()).trim();
		extractMap.put(caption, content);
		return extractMap;
	}
}
