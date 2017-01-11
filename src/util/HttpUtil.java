/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
/**
 * 
 * The class contains a method to build a connection to a http web page and to read its contents.
 *
 */
public class HttpUtil {
/**
 * A method to build a connection to a http web page and to read its contents.
 * @param url an URL of the web page
 * @return contents of the web page in text form
 * 
 */
	public String sendGet(String url) throws IOException {
		RequestConfig globalConfig = RequestConfig.custom()
                .setCookieSpec(CookieSpecs.DEFAULT)
                .build();
		HttpClient client = null;
		HttpGet request = null;
		HttpResponse response = null;
		RequestConfig localConfig = RequestConfig.copy(globalConfig)
                .setCookieSpec(CookieSpecs.STANDARD)
                .build();

		while (response == null) {
			try {
				client = HttpClients.custom()
		                .setDefaultRequestConfig(globalConfig)
		                .build();
				request = new HttpGet(url);
				request.setConfig(localConfig); 
				response = client.execute(request);
			} catch (ClientProtocolException e) {
				e.printStackTrace();
				System.out.println("Try again");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
					System.out.println("Thread sleep interrupted");
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Try again");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
					System.out.println("Thread sleep interrupted");
				}
			}
		}

		BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String inputLine = "";
		StringBuffer stringBuffer = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			stringBuffer.append(inputLine);
		}
		in.close();
		return stringBuffer.toString();

	}

}