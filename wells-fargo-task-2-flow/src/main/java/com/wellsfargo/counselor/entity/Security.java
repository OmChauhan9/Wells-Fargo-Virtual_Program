package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Security {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long securityID;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String category;

	@Column(nullable = false)
	private String purchaseDate;

	@Column(nullable = false)
	private double purchasePrice;

	@Column(nullable = false)
	private int quantity;

	@ManyToOne
	@JoinColumn(name = "portfolioID")
	private Portfolio portfolio;

	protected Security() {

	}

	public Security(String name, String category, String purchaseDate, double purchasePrice, int quantity) {
		this.name = name;
		this.category = category;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
	}

	// Constructors, getters, setters, and other methods (if needed)
	public Long getSecurityID() {
		return securityID;
	}

	public void setSecurityID(Long securityID) {
		this.securityID = securityID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
