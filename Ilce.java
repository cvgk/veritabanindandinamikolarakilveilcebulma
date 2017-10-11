package com.bilgeadam.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Ilce implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String ilceAdi;
    @ManyToOne
    private Il il;
	public Ilce() {
		super();
	}
	
	public Ilce(String ilceAdi, Il il) {
		super();
		this.ilceAdi = ilceAdi;
		this.il = il;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIlceAdi() {
		return ilceAdi;
	}
	public void setIlceAdi(String ilceAdi) {
		this.ilceAdi = ilceAdi;
	}
	public Il getIl() {
		return il;
	}
	public void setIl(Il il) {
		this.il = il;
	}
	@Override
	public String toString() {
		return ilceAdi ;
	}
}
