package service;

import dao.DAO;
import dao.DaoImpl;
import models.User;

import java.util.List;

public class ServiceDaoImpl implements DAO {
    DAO use = new DaoImpl();

    @Override
    public User userId(int id) {
        return use.userId(id);
    }

    @Override
    public void saveUser(User user) {
        use.saveUser(user);
    }

    @Override
    public void update(User user) {
        use.update(user);
    }

    @Override
    public void delete(int id) {
        use.delete(id);
    }

    @Override
    public List<User> findAll() {
        return use.findAll();
    }

    @Override
    public Integer showId(String login, String password) {
        return use.showId(login, password);
    }
}
