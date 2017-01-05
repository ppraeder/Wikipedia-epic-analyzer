package entity;

import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;

public class PageExtract {

	private String heading;
	private String content;
	private ToneAnalysis ibmTone;

	public PageExtract(String heading, String content, ToneAnalysis ibmTone) {
		this.heading = heading;
		this.ibmTone = ibmTone;
		this.content = content;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public ToneAnalysis getIbmTone() {
		return ibmTone;
	}

	public void setIbmTone(ToneAnalysis ibmTone) {
		this.ibmTone = ibmTone;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}