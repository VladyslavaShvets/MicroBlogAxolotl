package WWSIS.Microblog.model; 

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="post")
public class Post {
	@Id
	@GeneratedValue()
	@Column(name="PostId", nullable=false)
	private int postId;
	
	@JoinColumn(name="userId")
	@Column(name="UserId", nullable=false)
	private int userId;
	
	@Column(name="PostText", nullable=false, length=300)
	private String postText;
	
	@Column(name="Public", nullable=false)
	private Boolean isPublic;
	
	@Column(name="PostedDate", nullable=false)
	private Date date;
	
	public Post(int postId, int userId, String postText, Boolean isPublic, Date date) {
		this.postId = postId;
		this.userId = userId;
		this.postText = postText;
		this.isPublic = isPublic;
		this.date = date;
	}
	
	public int getPostId() {
		return postId;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getPostText() {
		return postText;
	}
	
	public void setPostText(String text) {
		this.postText = text;
	}
	
	public Boolean getIsPublic() {
		return isPublic;
	}
	
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}