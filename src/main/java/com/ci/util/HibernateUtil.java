package com.ci.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil
{
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    static
    {
        try
        {
        	if(sessionFactory==null){
        	  Configuration conf = new Configuration().configure();
        	  //Configuration conf = new Configuration().configure();
        	 // serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        	  sessionFactory = conf.buildSessionFactory();
        	}
        }
        catch (HibernateException he)
        {
            System.err.println("Error creating Session: " + he);
            throw new ExceptionInInitializerError(he);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    
    public static void shutdown() {
    	
        // Close caches and connection pools
        getSessionFactory().close();
    }
}