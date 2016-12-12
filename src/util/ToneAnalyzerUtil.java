package util;

import com.ibm.watson.developer_cloud.tone_analyzer.v3.ToneAnalyzer;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;

public class ToneAnalyzerUtil {
	private static ToneAnalyzerUtil instance;

	private static final String USERNAME = "b1d6021e-f60e-4dbb-9d7d-5570221c9c3b";
	private static final String PASSWORD = "p1EGnbRuz2VH";
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
