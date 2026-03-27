package com.cg.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    private Integer userID;
    private String username;
    private String email;
    private String password;

    @Lob
    @Column(name = "profile_picture")
    private byte[] profilePicture;

    // One user → many posts
    @OneToMany(mappedBy = "user")
    private List<Post> posts;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(byte[] profilePicture) {
		this.profilePicture = profilePicture;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
    
    
}
