package dao;

import models.User;

import javax.persistence.QueryHint;
import java.util.List;

public interface DAO {
    User userId(int id);
    void saveUser(User user);
    void update(User user);
    void delete(int id);
    List findAll();
    Integer showId(String login, String password);
}