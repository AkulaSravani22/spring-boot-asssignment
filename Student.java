package com.gloify.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Student")
public class Student {
	@Id
	private String name;
	private String fathername;
	private String mothername;
	private String classname;
	private String section;
	private int id;
	private boolean craetedat;
	private boolean updatedat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public boolean isCraetedat() {
		return craetedat;
	}
	public void setCraetedat(boolean craetedat) {
		this.craetedat = craetedat;
	}
	public boolean isUpdatedat() {
		return updatedat;
	}
	public void setUpdatedat(boolean updatedat) {
		this.updatedat = updatedat;
	}

}
