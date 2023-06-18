package com.project.cmart.CmartModel;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cmart123")
public class DressDbEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getClothtype() {
		return clothtype;
	}
	public void setClothtype(String clothtype) {
		this.clothtype = clothtype;
	}
	public String getDressname() {
		return dressname;
	}
	public void setDressname(String dressname) {
		this.dressname = dressname;
	}
	public int getQuantity() {
		return quantity;
	}
	public DressDbEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	String category;
	String clothtype;
	String dressname;
	int quantity;
	}