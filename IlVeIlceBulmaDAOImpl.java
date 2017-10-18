package com.bilgeadam.dao;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.bilgeadam.hibernateutil.HibernateUtil;
import com.bilgeadam.models.Il;
import com.bilgeadam.models.Ilce;
@Repository
public class IlVeIlceBulmaDAOImpl implements IlVeIlceBulmaDAO {

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Il> butunIlleriGetir() {
		Session session = HibernateUtil.getSession();
		List<Il> iller = session.createQuery("from Il").getResultList();
		Collections.sort(iller);
		return iller;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ilce> butunIlceleriBul(String ilAdi) {
		Session session = HibernateUtil.getSession();
		List<Il> iller = butunIlleriGetir();
		for(int i=0;i<iller.size();i++)
		{
			Il il = iller.get(i);
			if(il.getIlAdi().equals(ilAdi))
			{
				List<Ilce> ilceler = session.createQuery("FROM Ilce where il_id="+il.getId()).getResultList();
				Collections.sort(ilceler);
				return ilceler;
			}
		}
		return null;
	}

	

}
