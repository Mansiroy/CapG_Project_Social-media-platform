package com.cg.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "`Groups`")
public class Group {

    @Id
    @Column(name = "groupID")
    int groupID;

    @Column(name = "groupName")
    String groupName;

    @ManyToOne
    @JoinColumn(name = "adminID")
    User admin;

    public Group(int groupID, String groupName, User admin) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.admin = admin;
    }

    public Group() {}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", admin=" + admin + "]";
	}

    
}
