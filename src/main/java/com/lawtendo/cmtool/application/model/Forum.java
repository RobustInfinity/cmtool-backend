package com.lawtendo.cmtool.application.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "forum_table")
public class Forum {

	private String fuid;
	
	private String forumId;			//unique id for each forum
	
	private String forumCategory;     //"supreme court","high court"
	
	private String forumDir;			//"sc","dhc","bhc"
	
	private String forumGroup;			//"Supreme Court","Delhi High Court","Bombay High Court"
	
	private String fullName;			//"Bombay High Court at Nagpur","Bombay High Court at Aurangabad"
	
	private String shortName;			//"BOM HC-NGP","BOM HC-AWB"
	
	private Timestamp updatedAt;		
	
	private Timestamp createdAt;
	
	public String getFuid() {
		return fuid;
	}

	public void setFuid(String fuid) {
		this.fuid = fuid;
	}

	public String getForumId() {
		return forumId;
	}

	public void setForumId(String forumId) {
		this.forumId = forumId;
	}

	public String getForumCategory() {
		return forumCategory;
	}

	public void setForumCategory(String forumCategory) {
		this.forumCategory = forumCategory;
	}

	public String getForumDir() {
		return forumDir;
	}

	public void setForumDir(String forumDir) {
		this.forumDir = forumDir;
	}

	public String getForumGroup() {
		return forumGroup;
	}

	public void setForumGroup(String forumGroup) {
		this.forumGroup = forumGroup;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

}
