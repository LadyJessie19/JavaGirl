import java.util.ArrayList;
import java.util.List;

import packages.Profile;
import packages.User;
import packages.Task;
import packages.TaskStatus;

public class App {
    public static void main(String[] args) throws Exception {
        
        User user1 = new User(1, "Jéssica", "jessica@email.com", true);

        User user2 = new User(2, "Carlos", "carlos@email.com", true);

        Profile profile1 = new Profile(1, "Admin", "Administrador profile");

        Profile profile2 = new Profile(2, "User", "Regular user profile");

        user1.addProfile(profile1);
        user2.addProfile(profile2);
        
        Task task1 = new Task(1, "Task 1", "Description for task 1", TaskStatus.EM_ANDAMENTO, user1);

        Task task2 = new Task(2, "Task 2", "Description for task 2", TaskStatus.PENDENTE, user1);

        Task task3 = new Task(3, "Task 1", "Description for task 1", TaskStatus.CONCLUÍDA, user2);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        user1.setTasks(taskList);

        //Retorna o userList
        System.out.println(userList);

        //Retorna o primeiro usuário
        // System.out.println(userList.get(0));

        //Retorna o taskList
        // System.out.println(taskList);

        // Retorna a primeira tarefa
        // System.out.println(taskList.get(0));
    }
}
