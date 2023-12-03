package com.TNSProject.ShoppingMall.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Mall {
	
	@Id
	@GeneratedValue
	long id;
	String mallAdmin;
	String mallName;
	String location;
	int shopid;
	String category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMallAdmin() {
		return mallAdmin;
	}
	public void setMallAdmin(String mallAdmin) {
		this.mallAdmin = mallAdmin;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Mall(long id, String mallAdmin, String mallName, String location, int shopid, String category) {
		super();
		this.id = id;
		this.mallAdmin = mallAdmin;
		this.mallName = mallName;
		this.location = location;
		this.shopid = shopid;
		this.category = category;
	}
	public Mall() {
		super();
	}
	@Override
	public String toString() {
		return "Malls [id=" + id + ", mallAdmin=" + mallAdmin + ", mallName=" + mallName + ", location=" + location
				+ ", shopid=" + shopid + ", category=" + category + "]";
	}
}
