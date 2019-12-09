package service;

import models.User;

import java.util.List;

public interface Service {
    User userId(int id);

    void saveUser(User user);

    void update(User user);

    void delete(int id);

    List<User> findAll();

    User showUser(String login, String password);

    boolean checkLogin(String login);
}
