package com.cg.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="comments")
public class Comment {

    @Id
    private Integer commentID;
    private String commentText;
    private LocalDateTime timestamp;

    // Many comments → one user
    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    // Many comments → one post
    @ManyToOne
    @JoinColumn(name = "postID")
    private Post post;

	public Integer getCommentID() {
		return commentID;
	}

	public void setCommentID(Integer commentID) {
		this.commentID = commentID;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
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