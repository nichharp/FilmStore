package com.qa.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {

	@Id
	@GeneratedValue
	private Long id;
	private String director;
	private String name;
	private int releaseDate;
	private String age;
	private int runtime;
	private String desc;
	private String embedded;


	public Film(String name, String director, int releaseDate, String age, int runtime, String desc, String embedded) {
		this.director = director;
		this.name = name;
		this.releaseDate = releaseDate;
		this.age = age;
		this.runtime= runtime;
		this.desc = desc;
		this.embedded= embedded;
	}

	public String getDirector() { return director; }

	public void setDirector(String director) {
		this.director = director;
	}

	public String getAge() { return age; }

	public void setAge(String age) { this.age = age; }

	public int getRuntime() { return runtime; }

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String getDesc() { return desc; }

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public String getEmbedded() { return embedded; }

	public void setEmbedded(String embedded) {
		this.embedded = embedded;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
