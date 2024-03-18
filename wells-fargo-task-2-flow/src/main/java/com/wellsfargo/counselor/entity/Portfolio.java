package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Portfolio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long portfolioID;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private String createdDate;

	@OneToOne
	@JoinColumn(name = "clientID")
	private Client client;

	@OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
	private List<Security> securities;

	protected Portfolio() {

	}

	public Portfolio(String name, String description, String createdDate) {
		this.name = name;
		this.description = description;
		this.createdDate = createdDate;
	}

	// Constructors, getters, setters, and other methods (if needed)

	public Long getPortfolioID() {
		return portfolioID;
	}

	public void setPortfolioID(Long portfolioID) {
		this.portfolioID = portfolioID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

}
