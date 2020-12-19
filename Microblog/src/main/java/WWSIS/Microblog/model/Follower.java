package WWSIS.Microblog.model; 

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="follower")
public class Follower {
	@Id
	@GeneratedValue()
	@Column(name="FollowerID", nullable=false)
	private int followerID;
	public int followerID() {
		return followerID;
	}
	@JoinColumn(name="userId")
	@Column(name="UserId", nullable=false)
	private int userId;

	@Column(name="FollowedUserId", nullable=false)
	private int followedUserId;
	public int getFollowedUserId() {
		return followedUserId;
	}
	public void setFollowedUserId(int followedUserId) {
		this.followedUserId = followedUserId;
	}
}