package dao;

import models.User;

import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DaoImpl implements DAO {

    private static final String Persist = "web4";
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(Persist);
    EntityManager em;

    public User userId(int id) {

        em = factory.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        em.getTransaction().commit();
        em.close();
        return user;
    }

    public void saveUser(User user) {

        em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public void update(User user) {
        em = factory.createEntityManager();
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(int id) {
        em = factory.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(User.class, id));
        em.getTransaction().commit();
        em.close();
    }

    public List<User> findAll() {
        em = factory.createEntityManager();
        em.getTransaction().begin();
        List<User> user = em.createNativeQuery("select * from user", User.class).getResultList();
        em.getTransaction().commit();
        em.close();

        return user;
    }

    public User showUser(String login, String password) {
        em = factory.createEntityManager();
        em.getTransaction().begin();
        Query query = (Query) em.createNativeQuery("select * from user WHERE login= :login and password= :password", User.class);
        query.setParameter("login", login);
        query.setParameter("password", password);
        User user = (User) query.uniqueResult();
        em.getTransaction().commit();
        em.close();
        return user;

    }

    public boolean checkLogin(String login) {
        em = factory.createEntityManager();
        Query query = (Query) em.createNativeQuery("select * from user WHERE login= :login", User.class);
        query.setParameter("login", login);
        try{
            query.getSingleResult();
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
