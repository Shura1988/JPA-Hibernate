package util;

import models.Adress;
import models.Role;
import models.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HiberUtil {

////    private static final String Persist = "web4";
////    private static EntityManagerFactory factory;
//
//          private static SessionFactory sessionFactory;
//
//        public static SessionFactory getSessionFactory() {
//            if (sessionFactory == null) {
//                try {
//                    Configuration configuration = new Configuration();
//                    Properties setting = new Properties();
//                    setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//                    setting.put(Environment.URL, "jdbc:mysql://localhost/web5?AutoReconnect=true&serverTimezone=UTC&useSSL=False");
//                    setting.put(Environment.USER, "root");
//                    setting.put(Environment.PASS, "SCN932hdu");
//                    setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
//                    setting.put(Environment.SHOW_SQL, "true");
//                    setting.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
//                    setting.put(Environment.HBM2DDL_AUTO, "update");
//                    configuration.setProperties(setting);
//                    configuration.addAnnotatedClass(User.class);
//                    configuration.addAnnotatedClass(Role.class);
//                    configuration.addAnnotatedClass(Adress.class);
//                    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//                    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//                } catch (Exception e) {
//                    System.out.println("Ошибка" + e);
//                }
//            }
//            return sessionFactory;
//        }
//    public static void main(String[] args) {
//SessionFactory sessionFactory = HiberUtil.getSessionFactory();
//
//            //        factory = Persistence.createEntityManagerFactory(Persist);
////        EntityManager em = factory.createEntityManager();
//////    EntityManager em = HiberUtil.getEntityManagerFactory().createEntityManager();
////    em.getTransaction().begin();
//
////HiberUtil one = new HiberUtil();
////        Adress adress = new Adress("sss","sss","22");
////        Role role = new Role("Admin");
////        User user = new User("shura", "123", 30, "sss","ss", adress, role);
////        user.setLogin("shura");
////        user.setPassword("123");
////        user.setAge(30);
////        user.setName("aaa");
////        user.setDescription("aaa");
////        user.getAdress().setTown("sss");
////        user.getAdress().setStreet("sss");
////        user.getAdress().setHouse("22");
////        user.getRole().setTitle("Admin");
////        em.persist(user);
////        em.getTransaction().commit();
////        em.close();
//
//    }
}

















    /*private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties setting = new Properties();
                setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                setting.put(Environment.URL, "jdbc:mysql://localhost/web5?AutoReconnect=true&serverTimezone=UTC&useSSL=False");
                setting.put(Environment.USER, "root");
                setting.put(Environment.PASS, "SCN932hdu");
                setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
                setting.put(Environment.SHOW_SQL, "true");
                setting.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                setting.put(Environment.HBM2DDL_AUTO, "create-drop");
                configuration.setProperties(setting);
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(Role.class);
                configuration.addAnnotatedClass(Adress.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                System.out.println("Ошибка" + e);
            }
        }
        return sessionFactory;
    }

    public static void main(String[] args) {
        SessionFactory sessionFactory = HiberUtil.getSessionFactory();
    }
}*/


