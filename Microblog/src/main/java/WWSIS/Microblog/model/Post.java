package WWSIS.Microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="post")
public class Post {
	@Id
	@GeneratedValue
	@Column(name="PostId")
	private int postId;
	@Column(name="UserId")
	private int userId;
	@Column(name="PostText")
	private String PostText;
	@Column(name="Public")
	private Boolean isPublic;
	@Column(name="PostedDate")
	private String date;
}