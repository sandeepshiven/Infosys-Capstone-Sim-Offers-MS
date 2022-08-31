package com.infytel.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "sim_offers")
public class SimOffers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "offer_id")
	private Long offerId;

	@Column(name = "call_qty")
	private Long callQty;

	@Column(name = "cost")
	private Long cost;

	@Column(name = "data_qty")
	private Long dataQty;

	@Column(name = "duration")
	private Long duration;

	@Column(name = "offer_name")
	private String offerName;
	
	@Column(name = "sim_id")
	private Long simId;
	
	
	public SimOffers(Long offerId, Long callQty, Long cost, Long dataQty, Long duration, String offerName, Long simId) {
		this.offerId = offerId;
		this.callQty = callQty;
		this.cost = cost;
		this.dataQty = dataQty;
		this.duration = duration;
		this.offerName = offerName;
		this.simId = simId;
	}

	public SimOffers() {
	}

	public Long getOfferId() {
		return offerId;
	}

	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}

	public Long getCallQty() {
		return callQty;
	}

	public void setCallQty(Long callQty) {
		this.callQty = callQty;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Long getDataQty() {
		return dataQty;
	}

	public void setDataQty(Long dataQty) {
		this.dataQty = dataQty;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public Long getSimId() {
		return simId;
	}

	public void setSimId(Long simId) {
		this.simId = simId;
	}

	
}
