package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Ticket {
    private String date;
    private int num;
    private ArrayList<Product> products= new ArrayList<>();
    private Server server;


    public Ticket(String date, int num, ArrayList<Product> products, Server server) {
        this.date = date;
        this.num = num;
        this.products = products;
        this.server = server;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public Server getServer() {
        return server;
    }
    public void setServer(Server server) {
        this.server = server;
    }


    public void add_Product(Product product){
        products.add(product);
    }

    public double total_Price(){
        if(products == null) return 0;
        double sum = 0;
        for ( Product product:products){
            sum += product.getPrice();
        }
        return sum;
    }

    public void parseDate() throws DateInvalidException{
        String[] parts = date.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (date == null || !date.matches("\\d{2}-\\d{2}-\\d{4}")){
            throw new DateInvalidException(" Format doesn't match dd-mm-yyyy .");
        } else if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900 || year > 2100)
            throw new DateInvalidException("day, month or year doesnt match the pattern");
        else
            System.out.println("Valid date");
    }



}
