package com.cg.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @Column(name = "notificationID")
    int notificationID;

    @Column(name = "content")
    String content;

    @Column(name = "timestamp")
    Timestamp timestamp;

    @ManyToOne
    @JoinColumn(name = "userID")
    User user;

    public Notification(int notificationID, String content, Timestamp timestamp, User user) {
        this.notificationID = notificationID;
        this.content = content;
        this.timestamp = timestamp;
        this.user = user;
    }

    public Notification() {}

	public int getNotificationID() {
		return notificationID;
	}

	public void setNotificationID(int notificationID) {
		this.notificationID = notificationID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


    
}
