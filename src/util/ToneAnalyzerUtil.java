package util;

import com.ibm.watson.developer_cloud.tone_analyzer.v3.ToneAnalyzer;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;

public class ToneAnalyzerUtil {
	private static ToneAnalyzerUtil instance;

	private static final String USERNAME = "90d693e1-6af1-4951-9651-7b5af91db989";
	private static final String PASSWORD = "lj3zcNhBMhPk";
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
