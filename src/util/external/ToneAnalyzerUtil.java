/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util.external;

import com.ibm.watson.developer_cloud.tone_analyzer.v3.ToneAnalyzer;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;

/**
 * This class contains the API keys and instance call for Watson Tone Analyzer
 * see https://www.ibm.com/watson/developercloud/tone-analyzer.html for further
 * information.
 *
 */
public class ToneAnalyzerUtil {

	private static ToneAnalyzerUtil instance;

	/**
	 * please generate own API keys.
	 */
	private static final String USERNAME = "13b86776-XXXXXXXXX-bd64-47ac3d152250";
	private static final String PASSWORD = "137XXXXDOOgT";

	private ToneAnalyzer service;

	/**
	 * Private constructor. Initializes the service
	 */
	private ToneAnalyzerUtil() {
		service = new ToneAnalyzer(ToneAnalyzer.VERSION_DATE_2016_05_19);
		service.setUsernameAndPassword(USERNAME, PASSWORD);
	}

	/**
	 *
	 * @return the singleton instance
	 */
	public static synchronized ToneAnalyzerUtil getInstance() {
		if (ToneAnalyzerUtil.instance == null) {
			ToneAnalyzerUtil.instance = new ToneAnalyzerUtil();
		}
		return ToneAnalyzerUtil.instance;
	}

	public ToneAnalysis getTone(String input) {
		return this.service.getTone(input, null).execute();
	}

}
