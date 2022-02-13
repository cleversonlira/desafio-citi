package br.com.desafio.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameOwner;
	private Long agency;
	private Long bankAccount;
	private Integer verificationDigital;
//	Card card;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAgency() {
		return agency;
	}

	public void setAgency(Long agency) {
		this.agency = agency;
	}

	public Long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(Long bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Integer getVerificationDigital() {
		return verificationDigital;
	}

	public void setVerificationDigital(Integer verificationDigital) {
		this.verificationDigital = verificationDigital;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}
	
	

//	public Card getCard() {
//		return card;
//	}
//
//	public void setCard(Card card) {
//		this.card = card;
//	}

}
