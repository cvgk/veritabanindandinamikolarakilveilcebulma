package com.bilgeadam.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Il implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String ilAdi;
    private String ilKodu;
    public Il() {
		super();
	}
	
	public Il(String ilAdi, String ilKodu) {
		super();
		this.ilAdi = ilAdi;
		this.ilKodu = ilKodu;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIlAdi() {
		return ilAdi;
	}
	public void setIlAdi(String ilAdi) {
		this.ilAdi = ilAdi;
	}
	public String getIlKodu() {
		return ilKodu;
	}
	public void setIlKodu(String ilKodu) {
		this.ilKodu = ilKodu;
	}
	@Override
	public String toString() {
		return ilAdi ;
	}
}
