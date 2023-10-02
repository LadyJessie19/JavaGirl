# Layers

Model, Repository, Service e Controller

### 1. Camada Model

A camada Model contém as classes que representam os objetos de dados do seu aplicativo. Use o Lombok para simplificar a criação de classes POJO (Plain Old Java Objects).

```java
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private double price;
    
    // Construtores, getters e setters gerados automaticamente pelo Lombok
}
```

### 2. Camada Repository

A camada Repository é responsável pela interação com o banco de dados. Use o Spring Data JPA com o Lombok para criar repositórios de forma concisa.

```java
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Você pode adicionar métodos personalizados de consulta aqui, se necessário
}
```

### 3. Camada Service

A camada Service contém a lógica de negócios da sua aplicação. Use o Lombok para injetar dependências e criar métodos de serviço.

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
```

### 4. Camada Controller

A camada Controller lida com as requisições HTTP e interage com a camada de serviço. Use o Lombok para simplificar a criação de controladores.

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
```

### 5. Banco de dados

No arquivo application.properties

```
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.h2.console.settings.trace=false
spring.h2.console.settings.web-allow-others=false
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=123456
spring.datasource.driver-class=org.h2.driver
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.jpa.defer-datasource-initialization=true
```