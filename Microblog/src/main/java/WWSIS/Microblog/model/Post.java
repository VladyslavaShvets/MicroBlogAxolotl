package WWSIS.Microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="post")
public class Post {
	@Id
	@GeneratedValue()
	@Column(name="PostId")
	private int postId;
	
	//TODO @OneToMany(mappedBy = "post") - add to user table
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="userId")
	@Column(name="UserId")
	private int userId;
	
	@Column(name="PostText")
	private String PostText;
	
	@Column(name="Public")
	private Boolean isPublic;
	
	@Column(name="PostedDate")
	private String date;
	
	
}