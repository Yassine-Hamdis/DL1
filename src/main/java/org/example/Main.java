package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    static void top_Server(ArrayList<Server> servers){
        servers.sort((Comparator.comparingDouble((Server s)->s.total_tickets_price()).reversed()));
        System.out.println("Descending :"+ servers);
    }

    public static void main(String[] args) throws DateInvalidException, InterruptedException {

        Promo promo1 = new Promo();

        Category category1 = new Category(promo1);

        Product product1 = new Product("123ABC",123.2,category1);
        Product product2 = new Product("X12CCC",100.8,category1);
        Product product3 = new Product("123AAA",123.2,category1);
        Product product4 = new Product("X12BBB",99.8,category1);
        Product product5 = new Product("123DDD",120.2,category1);
        Product product6 = new Product("X12EEE",10.8,category1);

        Server server1 = new Server("##12","serv1","email@y.com",new ArrayList<>());
        Server server2 = new Server("##34","serv2","Y@email.com",new ArrayList<>());

        Ticket ticket1 = new Ticket("21-10-2025",1,new ArrayList<>(),server1);
        Ticket ticket2 = new Ticket("22-10-2025",2,new ArrayList<>(),server2);


        ticket1.add_Product(product1);
        ticket1.add_Product(product2);
        ticket1.add_Product(product3);

        ticket2.add_Product(product4);
        ticket2.add_Product(product5);
        ticket2.add_Product(product6);

        server1.add_Ticket(ticket1);
        server2.add_Ticket(ticket2);


        System.out.println("---------------Total price for each server--------------");

        System.out.println("server1 : Total outputs = " + server1.total_tickets_price());
        System.out.println("server2 : Total outputs = " + server2.total_tickets_price());


        System.out.println("---------------Date validation--------------");
        ticket1.parseDate();

        ArrayList<Server> servers = new ArrayList<>();
        servers.add(server1);
        servers.add(server2);
        System.out.println("---------------Top server--------------");
        top_Server(servers);


        while (true){
            System.out.println("---------------Daily report--------------");
            for(Server server:servers)
                System.out.println(server1.toString());
            Thread.sleep(86_400_000);
        }

    }
}