/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util.database;

/**
 * This class contains every sql strings which are used in the software 
 *
 */
public class SqlConstants {

	public static final String PAGE_INSERT = "INSERT INTO pages (pageId,title,ns,lang) VALUES (?,?,?,?);";
	public static final String CHARACTER_INSERT = "INSERT INTO characters (characterId,pageId,title,lang) VALUES (?,?,?,?);";
	public static final String CONNECTION_INSERT = "INSERT INTO connection (fromPageId,toPageId,lang) VALUES (?,?,?);";
	public static final String PERSON_INSERT = "INSERT INTO person (parentPage,title,ns,lang) VALUES (?,?,?,?);";
	public static final String PAGE_CONTENT_INSERT = "INSERT INTO pagecontent (pageId,content) VALUES (?,?);";
	public static final String PAGE_EXTRACT_INSERT = "INSERT INTO pageextract (pageId,heading,content,position) VALUES (?,?,?,?);";

	public static final String PAGE_EXTRACT_IBM_TONE_UPDATE = "UPDATE pageextract SET ibmTone=? WHERE pageId=? AND heading=?";
	public static final String PAGE_LIWC_TONE_UPDATE = "UPDATE pages SET liwcTone=? WHERE pageId=?";
	public static final String PAGE_IBM_TONE_UPDATE = "UPDATE pages SET ibmTone=? WHERE pageId=?";
	public static final String PAGE_ALCHEMY_TONE_UPDATE = "UPDATE pages SET alchemyTone=? WHERE pageId=?";
	public static final String PAGE_EXTRACT_GET = "SELECT * FROM pageextract WHERE pageId=?";
	public static final String PAGE_EXTRACT = "SELECT pageId,GROUP_CONCAT(content SEPARATOR ' ')as content FROM pageextract WHERE relevant=1 GROUP BY pageId";

	public static final String CHARACTER_EXISTS = "SELECT * FROM  characters WHERE characterId=? AND pageId=?";
	public static final String CONNECTION_INCREMENT = "UPDATE connection SET count=count+1 WHERE fromPageId=? AND toPageId=?";
	public static final String CONNECTION_EXISTS = "SELECT * FROM connection WHERE fromPageId=? AND toPageId=?";
	public static final String SET_MAX_CONCAT_LENGTH = "SET SESSION group_concat_max_len = 10000000;";

	public static final String GET_PAGES_WITH_CHARACTERS = "SELECT * FROM pages WHERE pageId IN (SELECT DISTINCT pageId FROM characters)";

	public static final String BASE_QUERY_FOR_DEGREE = "SELECT * FROM connection WHERE toPageId IN (SELECT characterId FROM characters WHERE pageId=?) AND fromPageId IN (SELECT characterId FROM characters WHERE pageId=?);";
	public static final String SELECT_CHARACTERS = "SELECT DISTINCT characterId as pageId,title FROM characters WHERE characterId NOT IN (SELECT fromPageId FROM connection)";
	public static final String UPDATE_OUTDEGREE = "UPDATE characters SET outDegree=? WHERE characterId=? AND pageId=?";
	public static final String UPDATE_INDEGREE = "UPDATE characters SET inDegree=? WHERE characterId=? AND pageId=?";
	public static final String GET_PAGES = "SELECT * FROM pages";
}
