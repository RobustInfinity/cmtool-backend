package com.lawtendo.cmtool.application.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "case_table")
public class Case {
	
	@Column
	private String cuid;
	
	@Column
	private String caseId;
	
	@Column
	private String caseType;
	
	@Column
	private Integer caseYear;
	
	@Column
	private String caseTitle;
	
	@Column
	private String forumId;
	
	@Column
	private String caseStatus;
	
	@Column
	private String applicant;
	
	@Column
	private String respondant;
	
	private List<Object> caseHistory;
			
	private List<Object> timeline;
	
	private List<Object> documents;
	
	private List<Object> notes;
	
	private List<Object> tasks;
	
	private List<Object> contacts;
	
	private List<Object> expenses;
	
	private List<Object> invoices;
	
	private List<Object> permissions;
	
	@Column
	private String createdBy;
	
	@Column
	private Timestamp createdAt;
	
	@Column
	private Timestamp updatedAt;

}
