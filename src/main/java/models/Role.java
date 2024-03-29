package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "role")
    private List<User> user = new ArrayList<User>();

    public Role() {

    }

    public Role(String title) {
        this.title = title;
    }

    public Role(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUsers(List<User> user) {
        this.user = user;
    }

    public void addUsers(User users) {
        users.setRole(this);
        user.add(users);
    }

    public void removeUser(User users) {
        user.remove(users);
    }

    @Override
    public String toString() {
        return "Role{" +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id == role.id &&
                Objects.equals(title, role.title) &&
                Objects.equals(user, role.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, user);
    }
}
