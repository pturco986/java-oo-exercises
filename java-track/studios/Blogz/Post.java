package Blogz;
import java.util.Date;

public class Post extends Entity {
	private String body;
	private String title;
	private String author;
	private final Date created;
	private Date modified;
	
	public Post(String body, String title, String author, Date created) {
		super();
		this.body = body;
		this.title = title;
		this.author = author;
		this.created = created;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
		modified = new Date();
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		modified = new Date();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreated() {
		return created;
	}
	
	

}
