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
	public int getPostId() {
		return postId;
	}
	
	@JoinColumn(name="userId")
	@Column(name="UserId", nullable=false)
	private int userId;
	

	@Column(name="PostText", nullable=false, length=300)
	private String postText;
	public String getPostText() {
		return postText;
	}
	public void setPostText(String text) {
		this.postText = text;
	}
	
	@Column(name="Public", nullable=false)
	private Boolean isPublic;
	public Boolean getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}
	
	@Column(name="PostedDate", nullable=false)
	private Date date;
	public Date getDate() {
		return this.date;
	}
}