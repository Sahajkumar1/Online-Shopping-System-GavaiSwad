package com.softpro.GanwaiSwad.Model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="brand")
public class BrandEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int brand_id;
	private String brand_name;
	
	
	
	
	public BrandEntity() {
		super();
	
		// TODO Auto-generated constructor stub
	}
	public BrandEntity(String brand_name ,int  brand_id) {
		super();
		
		this.brand_name = brand_name;
		this.brand_id = brand_id;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	
	

}
