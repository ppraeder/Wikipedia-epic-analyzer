package util.database;

public class SqlConstants {

	public static final String PAGE_INSERT = "INSERT INTO pages (pageId,title,ns,lang) VALUES (?,?,?,?);";
	public static final String PAGE_CONTENT_INSERT = "INSERT INTO pagecontent (pageId,content) VALUES (?,?);";
}
