/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util.external;

import java.util.Map;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentSentiment;

/**
 * This class contains the API keys and instance call for Watson AlchemyLanguage
 * see https://www.ibm.com/watson/developercloud/alchemy-language.html for
 * further information.
 *
 */
public class AlchemyLanguageUtil {
	private static AlchemyLanguageUtil instance;

	/**
	 * please generate you own API key.
	 */
	private static final String API_KEY = "428f68259980XXXXXXXXc148748abe263fa61d";

	private AlchemyLanguage service;

	private AlchemyLanguageUtil() {
		service = new AlchemyLanguage();
		service.setApiKey(API_KEY);
	}

	/**
	 *
	 * @return the singleton instance
	 */
	public static synchronized AlchemyLanguageUtil getInstance() {
		if (AlchemyLanguageUtil.instance == null) {
			AlchemyLanguageUtil.instance = new AlchemyLanguageUtil();
		}
		return AlchemyLanguageUtil.instance;
	}

	/**
	 * Get the document sentiment for a given string
	 * 
	 * @param params
	 * @return
	 */
	public DocumentSentiment getDocumentSentiment(Map<String, Object> params) {
		DocumentSentiment sentiment = service.getSentiment(params).execute();
		return sentiment;
	}

}
