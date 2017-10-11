package com.bilgeadam.dao;
import java.util.*;

import com.bilgeadam.models.Il;
import com.bilgeadam.models.Ilce;
public interface IlVeIlceBulmaDAO {
    public List<Il> butunIlleriGetir();
    public List<Ilce> butunIlceleriBul(String ilAdi);
}
