package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // Constructor to seed both product types
    public ProductService(){
        products.add(new DigitalProduct(1, "E-Book", 9.99, "https://example.com/book.pdf", 14.5));
        products.add(new PhysicalProduct(2, "Mechanical Keyboard", 89.99, 0.85, "35x13x4 cm"));
        nextId = 3L;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName() != null && p.getName().contains(name))
                .toList();
    }
}