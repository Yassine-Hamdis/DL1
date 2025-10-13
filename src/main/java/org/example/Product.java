package org.example;

public class Product {

    private String ref;
    private double price;
    private Category category;

    public Product(String ref, double price, Category category) {
        this.ref = ref;
        this.price = price;
        this.category = category;
    }

    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }



}
