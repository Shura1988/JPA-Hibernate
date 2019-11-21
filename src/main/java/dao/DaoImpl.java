package dao;

import models.User;

import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DaoImpl implements DAO {

    private static final String Persist = "web4";
    private static EntityManagerFactory factory;

    public User userId(int id) {
        factory = Persistence.createEntityManagerFactory(Persist);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        em.getTransaction().commit();
        em.close();
        return user;
    }

    public void saveUser(User user) {
        factory = Persistence.createEntityManagerFactory(Persist);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public void update(User user) {
        factory = Persistence.createEntityManagerFactory(Persist);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
        em.close();

    }

    public void delete(int id) {
        factory = Persistence.createEntityManagerFactory(Persist);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(User.class, id));
        em.getTransaction().commit();
        em.close();
    }

    public List<User> findAll() {
        factory = Persistence.createEntityManagerFactory(Persist);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        List<User> user = em.createNativeQuery("select * from user", User.class).getResultList();
//        for (User users : user) {
//        }
        em.getTransaction().commit();
        em.close();

        return user;
    }

    public Integer showId(String login, String password) {
        factory = Persistence.createEntityManagerFactory(Persist);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Query query = (Query) em.createNativeQuery("select user.id from user WHERE user.login= :login and user.password= :password");
        query.setParameter("login", login);
        query.setParameter("password", password);
        Integer id = (Integer) query.uniqueResult();
        em.getTransaction().commit();
        em.close();
        return id;
    }
}
