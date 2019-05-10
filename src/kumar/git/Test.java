package kumar.git;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
public static void main(String[] args) {
	
Transaction tx =null;
	try(Session ses=HibernateUtil.getsf().openSession()){
		tx=ses.beginTransaction();
		
		Course c1=new Course();
		c1.setCrsId(14);
		c1.setCrsCode("125");
		c1.setCrsCost(999.99);
		
		Course c2=new Course();
		c2.setCrsId(24);
		c2.setCrsCode("126");
		c2.setCrsCost(888.99);
		
		Course c3=new Course();
		c3.setCrsId(34);
		c3.setCrsCode("127");
		c3.setCrsCost(777.99);
		
		Course c4=new Course();
		c4.setCrsId(44);
		c4.setCrsCode("128");
		c4.setCrsCost(666.99);
		
		Student s1=new Student();
		s1.setStdId(84);
		s1.setStdName("ravi");
		s1.getCobs().add(c1);
		s1.getCobs().add(c2);
		
		Student s2=new Student();
		s2.setStdId(94);
        s2.setStdName("siva");
		s2.getCobs().add(c3);
		s2.getCobs().add(c4);
		
		Student s3=new Student();
		s3.setStdId(54);
		s3.setStdName("raju");
		s3.getCobs().add(c1);
		s3.getCobs().add(c4);
		
		ses.save(c1);
		ses.save(c2);
		ses.save(c3);
		ses.save(c4);
		ses.save(s1);
		ses.save(s2);
		ses.save(s3);
		tx.commit();
	}catch(Exception ex)
	{
		tx.rollback();
		ex.printStackTrace();
		System.out.println(ex);

	}
	System.out.println("done");
}
}
