package com.bilgeadam.managedbeans;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.bilgeadam.models.Il;
import com.bilgeadam.models.Ilce;
import com.bilgeadam.service.IlVeIlceBulmaService;

@ManagedBean
@ViewScoped
public class ServisBean {
	private String il;
	private String ilce;
	private List<Il> iller;
	private List<Ilce> ilceler;
	@ManagedProperty(value="#{ilVeIlceBulmaServiceImpl}")
	private IlVeIlceBulmaService service;
	
	@PostConstruct
	public void init()
	{
		iller = service.butunIlleriGetir();
		   
	}
	public void onCountryChange()
	{
		ilceler = service.butunIlceleriBul(il);
	}
		
	public void displayLocation()
	{
		
		
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	public List<Il> getIller() {
		return iller;
	}
	
	public List<Ilce> getIlceler() {
		return ilceler;
	}
	public void setService(IlVeIlceBulmaService service) {
		this.service = service;
	}
}
