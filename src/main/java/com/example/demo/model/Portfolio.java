package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Portfolio {

	@Id
	@GeneratedValue
	private Long idx;

	private String title;

	private String content;

	private String image;

	public Portfolio() {
		super();
	}

	public Portfolio(String image) {
		super();
		this.image = image;
	}

	public Portfolio(Long idx, String title, String content, String image) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.image = image;
	}

	public Long getIdx() {
		return idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
