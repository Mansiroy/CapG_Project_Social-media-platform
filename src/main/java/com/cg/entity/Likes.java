//package com.cg.entity;
//
//import jakarta.persistence.*;
//import java.sql.Timestamp;
//
//@Entity
//@Table(name = "likes")
//public class Likes {
//
//    @Id
//    @Column(name = "likeID")
//    int likeID;
//
//    @Column(name = "timestamp")
//    Timestamp timestamp;
//
//    @ManyToOne
//    @JoinColumn(name = "userID")
//    User user;
//
//    @ManyToOne
//    @JoinColumn(name = "postID")
//    Post post;
//    
//    
//
//    public Likes(int likeID, Timestamp timestamp, User user, Post post) {
//        this.likeID = likeID;
//        this.timestamp = timestamp;
//        this.user = user;
//        this.post = post;
//    }
//
//    public Likes() {}
//
//	public int getLikeID() {
//		return likeID;
//	}
//
//	public void setLikeID(int likeID) {
//		this.likeID = likeID;
//	}
//
//	public Timestamp getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(Timestamp timestamp) {
//		this.timestamp = timestamp;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Post getPost() {
//		return post;
//	}
//
//	public void setPost(Post post) {
//		this.post = post;
//	}
//
//    
//}

package com.cg.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "likes")
public class Likes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeID;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "postID")
    private Post post;

	public Integer getLikeID() {
		return likeID;
	}

	public void setLikeID(Integer likeID) {
		this.likeID = likeID;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

   
}