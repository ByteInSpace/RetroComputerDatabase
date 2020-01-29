package de.byteinspace.retrocomputerdatabase.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Computer {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne
	private Company company;
	@ManyToOne
	private CPU cpu;
	private Integer Ram;
	private Integer Rom;
	private String graphicalModes;
	private String soundModes;
	private Integer year;
	private Integer price;
	private String ports;
	private String thumb;
	
	protected Computer() { }
	
	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public Computer(Company company, String name)
	{
		this.company = company;
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Integer getRam() {
		return Ram;
	}

	public void setRam(Integer ram) {
		Ram = ram;
	}

	public Integer getRom() {
		return Rom;
	}

	public void setRom(Integer rom) {
		Rom = rom;
	}

	public String getGraphicalModes() {
		return graphicalModes;
	}

	public void setGraphicalModes(String graphicalModes) {
		this.graphicalModes = graphicalModes;
	}

	public String getSoundModes() {
		return soundModes;
	}

	public void setSoundModes(String soundModes) {
		this.soundModes = soundModes;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPorts() {
		return ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}
	
	
	
}
