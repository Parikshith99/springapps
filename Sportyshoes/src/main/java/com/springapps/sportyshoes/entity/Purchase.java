package com.springapps.sportyshoes.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseid;
	private String date;
	private int catid;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product products;

	public int getPurchaseid() {
		return purchaseid;
	}

	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}

	

	public Purchase(String date, int catid, Product products) {
		this.date = date;
		this.catid = catid;
		this.products = products;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseid=" + purchaseid + ", date=" + date + ", catid=" + catid + ", products=" + products
				+ "]";
	}

	public Purchase() {
		super();
	}

}
