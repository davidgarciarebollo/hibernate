package test.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class PruebaHibernateAPelo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session s = null;
		Configuration conf = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder()
				.applySettings(conf.getProperties()).build();
		SessionFactory sf=conf.buildSessionFactory(sr);
		s=sf.openSession();

		//==================================
		Transaction t=s.beginTransaction();
		List<Pojo> listaPojos = s.createQuery("from Pojo").list();
		Pojo miPojo=listaPojos.get(1);
		System.out.println(miPojo.getNombre());
		t.commit();
	}
}
