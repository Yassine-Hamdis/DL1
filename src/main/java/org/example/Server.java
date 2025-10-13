package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class Server {
    private String matricule;
    private String server_name;
    private String email;
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public Server(String matricule, String server_name, String email, ArrayList<Ticket> tickets) {
        this.matricule = matricule;
        this.server_name = server_name;
        this.email = email;
        this.tickets = tickets;
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getServer_name() {
        return server_name;
    }
    public void setServer_name(String server_name) {
        this.server_name = server_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Server{" +
                "matricule = " + matricule + '\n' +
                ", server_name = " + server_name + '\n' +
                ", email = " + email + '\n' +
                ", number of tickets = "+ tickets.size() + '\n' +
                ", total_tickets_price = " + this.total_tickets_price() +'\n'+
                '}'+'\n';
    }


    public void add_Ticket(Ticket ticket){
        tickets.add(ticket);
    }

    public double total_tickets_price(){
        double sum=0 ;
        for( Ticket ticket: tickets){
            sum += ticket.total_Price();
        }
        return sum;
    }

}