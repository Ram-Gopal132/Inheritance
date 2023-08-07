package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.result.Output;

import com.app.entity.Card;
import com.app.entity.Check;
import com.app.entity.Payment;
import com.app.util.HibernateUtil;

public class App
{
	public static void main(String[] args) 
	{
		Transaction transaction=null;
		
		try (Session session=HibernateUtil.getSessionFactory().openSession())
		{
			Payment p=new Payment();
			p.setAmount(80000);
			
			
			Card card=new Card();
			card.setAmount(70000);
			card.setCardNo(1008);
			card.setCardtype("Rupay");
			
			
			Check chk=new Check();
			chk.setAmount(40000);
			
			chk.setChequeNo(6007);
			
			transaction=session.beginTransaction();
			
			session.persist(p);
			session.persist(chk);
			session.persist(card);
			
			transaction.commit();
			
			System.out.println("Record Inserted");
		} catch (Exception e) {
			// TODO: handle exception
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
}