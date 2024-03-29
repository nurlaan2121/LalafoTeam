package models;

import java.util.ArrayList;
import java.util.List;

public class Favorite {
    private Long id;
    private List<User> userList = new ArrayList<>();

    public Favorite() {
    }

    public Favorite(Long id, List<User> userList) {
        this.id = id;
        this.userList = userList;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(User userList) {

        this.userList.add(userList);
    }

    @Override
    public String toString() {
        return "Favorite{" +"\n"+
                "id=" + id +"\n"+
                "userList=" + userList +"\n"+
                '}';
    }
}
