/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util.database;

public class SqlConstants {

	public static final String PAGE_INSERT = "INSERT INTO pages (pageId,title,ns,lang) VALUES (?,?,?,?);";
	public static final String PERSON_INSERT = "INSERT INTO person (parentPage,title,ns,lang) VALUES (?,?,?,?);";
	public static final String PAGE_CONTENT_INSERT = "INSERT INTO pagecontent (pageId,content) VALUES (?,?);";
	public static final String PAGE_EXTRACT_INSERT = "INSERT INTO pageextract (pageId,heading,content,position) VALUES (?,?,?,?);";

	public static final String PAGE_EXTRACT_IBM_TONE_UPDATE = "UPDATE pageextract SET ibmTone=? WHERE pageId=? AND heading=?";
	public static final String PAGE_LIWC_TONE_UPDATE = "UPDATE pages SET liwcTone=? WHERE pageId=?";
	public static final String PAGE_IBM_TONE_UPDATE = "UPDATE pages SET ibmTone=? WHERE pageId=?";
	public static final String PAGE_EXTRACT_GET = "SELECT * FROM pageextract WHERE pageId=?";
	public static final String PAGE_EXTRACT = "SELECT pageId,GROUP_CONCAT(content SEPARATOR ' ')as content FROM pageextract WHERE relevant=1 GROUP BY pageId";

	public static final String SET_MAX_CONCAT_LENGTH = "SET SESSION group_concat_max_len = 10000000;";
}
