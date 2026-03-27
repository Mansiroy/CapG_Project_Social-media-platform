package com.cg.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="posts")
public class Post {

    @Id
    private Integer postID;
    private String content;
    private LocalDateTime timestamp;

    // Many posts → one user
    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    // One post → many comments
    @OneToMany(mappedBy = "post")
    private List<Comment> comments;    

    // One post → many comments
    @OneToMany(mappedBy = "post")
    private List<Likes> likes;

	public Integer getPostID() {
		return postID;
	}

	public void setPostID(Integer postID) {
		this.postID = postID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
    
    
    
    
}
