package com.bilgeadam.startup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

import com.bilgeadam.models.Il;
import com.bilgeadam.models.Ilce;
public class StartUp1 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Il il1 = new Il("Ankara","06");
		Il il2 = new Il("Istanbul","34");
		Il il3 = new Il("Izmir","35");
		Ilce ilce1 = new Ilce("Mamak",il1);
        Ilce ilce2 = new Ilce("Besiktas",il2);
        Ilce ilce3 = new Ilce("Kadikoy",il2);
        Ilce ilce4 = new Ilce("Konak",il3);
        Ilce ilce5 = new Ilce("Cankaya",il1);
        Ilce ilce6 = new Ilce("Esenler",il2);
        Ilce ilce7 = new Ilce("Gaziemir",il3);
        Ilce ilce8 = new Ilce("Altindag",il1);
        Ilce ilce9 = new Ilce("Sultanbeyli",il2);
        Ilce ilce10 = new Ilce("Karsiyaka",il3);
        session.save(il1);
        session.save(il2);
        session.save(il3);
        session.save(ilce1);
        session.save(ilce2);
        session.save(ilce3);
        session.save(ilce4);
        session.save(ilce5);
        session.save(ilce6);
        session.save(ilce7);
        session.save(ilce8);
        session.save(ilce9);
        session.save(ilce10);
        session.getTransaction().commit();
        session.close();
	}

}
