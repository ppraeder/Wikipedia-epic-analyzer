package util;

import com.ibm.watson.developer_cloud.tone_analyzer.v3.ToneAnalyzer;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;

public class ToneAnalyzerUtil {
	private static ToneAnalyzerUtil instance;

	private static final String USERNAME = "82d96a27-4719-4ee4-9bd6-93db0fc443ed";
	private static final String PASSWORD = "vI7Ow0hN1qS3";
	private ToneAnalyzer service;

	private ToneAnalyzerUtil() {
		service = new ToneAnalyzer(ToneAnalyzer.VERSION_DATE_2016_05_19);
		service.setUsernameAndPassword(USERNAME, PASSWORD);
	}

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
