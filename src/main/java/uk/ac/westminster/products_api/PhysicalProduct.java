// A PhysicalProduct IS-A Product because it shares all essential product attributes (id, name, price) and represents a concrete, tangible item sold in the shop.
// Customer: A Customer interacts with or purchases products (a "has-a" / association relationship), but is not an item being sold.

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;


    public PhysicalProduct() {
    }

    public PhysicalProduct(int id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}