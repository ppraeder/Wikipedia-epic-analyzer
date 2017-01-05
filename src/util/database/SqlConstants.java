package util.database;

public class SqlConstants {

	public static final String PAGE_INSERT = "INSERT INTO pages (pageId,title,ns,lang) VALUES (?,?,?,?);";
	public static final String PERSON_INSERT = "INSERT INTO person (parentPage,title,ns,lang) VALUES (?,?,?,?);";
	public static final String PAGE_CONTENT_INSERT = "INSERT INTO pagecontent (pageId,content) VALUES (?,?);";
	public static final String PAGE_EXTRACT_INSERT = "INSERT INTO pageextract (pageId,heading,content,position) VALUES (?,?,?,?);";

	public static final String PAGE_EXTRACT_IBM_TONE_UPDATE = "UPDATE pageextract SET ibmTone=? WHERE pageId=? AND heading=?";
	public static final String PAGE_EXTRACT_GET = "SELECT * FROM pageextract WHERE pageId=?";
}
