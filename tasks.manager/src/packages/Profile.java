package packages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Profile implements Serializable{
    private Integer id;
    private String name;
    private String description;
    private List<User> users;

    public Profile(Integer id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        user.getProfiles().add(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    // @Override
    // public String toString() {
    //     return "Profile{" +
    //             "id=" + id +
    //             ", name='" + name + '\'' +
    //             ", description='" + description + '\'' +
    //             ", users=" + users +
    //             '}';
    // }
}
