package packages;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private Integer id;
    private String login;
    private String email;
    private Boolean enabled;
    private List<Profile> profiles;
    private List<Task> tasks;

    public User(Integer id, String login, String email, Boolean enabled) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.enabled = enabled;
        this.profiles = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
        profile.getUsers().add(this);
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public List<Profile> getProfiles() {
        return profiles;
    }
    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("User{")
      .append("id=").append(id)
      .append(", login='").append(login).append('\'')
      .append(", email='").append(email).append('\'')
      .append(", enabled=").append(enabled)
      .append(", profiles=[");
    
    for (Profile profile : profiles) {
        sb.append(profile.getId()).append(", ");
    }
    if (!profiles.isEmpty()) {
        sb.delete(sb.length() - 2, sb.length()); // Removendo a vírgula extra
    }
    sb.append("]")
      .append(", tasks=[");
    
    for (Task task : tasks) {
        sb.append(task.getId()).append(", ");
    }
    if (!tasks.isEmpty()) {
        sb.delete(sb.length() - 2, sb.length()); // Removendo a vírgula extra
    }
    sb.append("]")
      .append('}');
      
    return sb.toString();
}
}
