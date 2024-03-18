package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clientID;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String phone;

	@ManyToOne
	@JoinColumn(name = "advisorID")
	private Advisor advisor;

	@OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
	private Portfolio portfolio;

	protected Client() {

	}

	public Client(String name, String email, String phone) {
		this.namee = name;
		this.phone = phone;
		this.email = email;
	}

	// Constructors, getters, setters, and other methods

	public Long getClientID() {
		return clientID;
	}

	public void setClientID(Long clientID) {
		this.clientID = clientID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
