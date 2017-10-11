package com.bilgeadam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.dao.IlVeIlceBulmaDAO;
import com.bilgeadam.models.Il;
import com.bilgeadam.models.Ilce;
@Service
public class IlVeIlceBulmaServiceImpl implements IlVeIlceBulmaService{
	@Autowired
    private IlVeIlceBulmaDAO ilveilcebul;
	public void setIlveilcebul(IlVeIlceBulmaDAO ilveilcebul) {
		this.ilveilcebul = ilveilcebul;
	}
	@Override
	public List<Il> butunIlleriGetir() {
		return ilveilcebul.butunIlleriGetir();
	}
	@Override
	public List<Ilce> butunIlceleriBul(String ilAdi) {
		
		return ilveilcebul.butunIlceleriBul(ilAdi);
	}

}
