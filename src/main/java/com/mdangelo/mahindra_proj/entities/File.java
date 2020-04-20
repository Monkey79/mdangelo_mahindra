package com.mdangelo.mahindra_proj.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="files")
public class File implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "file_name", nullable = false, length = 150)
	private String name;
	@Column(name = "file_decimal", nullable = false)
	private BigDecimal result;
	@Column(name = "file_creation", nullable = false)
	private LocalDateTime creationDate;
		
	
	public File() {	
	
	}

	public File(Long id, String name, BigDecimal result, LocalDateTime creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.result = result;
		this.creationDate = creationDate;
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


	public BigDecimal getResult() {
		return result;
	}


	public void setResult(BigDecimal result) {
		this.result = result;
	}


	public LocalDateTime getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	
}
