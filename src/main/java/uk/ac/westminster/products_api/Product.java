package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {
    }

    // Handle int id by casting to Long
    public Product(int id, String name, double price) {
        this((long) id, name, price);
    }

    // Handle Long id
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // --- Getters ---
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // --- Setters ---
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}