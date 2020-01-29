package de.byteinspace.retrocomputerdatabase.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany(mappedBy = "company")
	private List<Computer> computers;
	
	private String thumb;
	
	protected Company() { }
	
	public Company(String name) {
		this.name = name;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	
	
	
	
	
}
