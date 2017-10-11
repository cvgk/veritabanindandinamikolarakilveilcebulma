package com.bilgeadam.service;

import java.util.List;

import com.bilgeadam.models.Il;
import com.bilgeadam.models.Ilce;

public interface IlVeIlceBulmaService {
      public List<Il> butunIlleriGetir();
      public List<Ilce> butunIlceleriBul(String ilAdi);
}
