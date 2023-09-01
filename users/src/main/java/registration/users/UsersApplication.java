package registration.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import registration.users.models.User;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}
	//Método nativo
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	User user = new User("Jéssica", "lady_jessie", "jessica@gmail.com");

    // Listar todos os usuários
    @GetMapping("/users")
    public String readAll() {
        return "Usuários no banco de dados";
    }

    // Listar um usuário por ID
    @GetMapping("/users/{id}")
    public String readOne(@PathVariable Long id) {
        return "Detalhes do usuário com ID: " + id;
    }

    // Criar um usuário
    @PostMapping("/users")
    public String create(@RequestBody User user) {
        return "Usuário criado: " + user.getUsername();
    }

    // Atualizar um usuário por ID
    @PutMapping("/users/{id}")
    public String update(@PathVariable Long id, @RequestBody User user) {
        return "Usuário atualizado com ID: " + id;
    }

    // Deletar um usuário por ID
    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable Long id) {
        return "Usuário deletado com ID: " + id;
    }
}
