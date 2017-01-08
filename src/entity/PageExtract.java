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

public class PageExtract {

	private int pageId;
	private String heading;
	private String content;
	private ToneAnalysis ibmTone;
	private ReceptivitiAnalysis liwcTone;

	public PageExtract(String heading, String content) {
		this.heading = heading;
		this.content = content;
	}

	public PageExtract(int pageId, String heading, String content) {
		this.heading = heading;
		this.pageId = pageId;
		this.content = content;
	}
	public PageExtract(int pageId, String content) {
		this.pageId = pageId;
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

	public int getPageId() {
		return pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public ReceptivitiAnalysis getLiwcTone() {
		return liwcTone;
	}

	public void setLiwcTone(ReceptivitiAnalysis liwcTone) {
		this.liwcTone = liwcTone;
	}
	
	

}
