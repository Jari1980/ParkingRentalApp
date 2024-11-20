package org.example.Model;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private String email;
    private Reservation reservation;

    public Customer(int id, String name, String phone, String email, Reservation reservation) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.reservation = reservation;
    }

    public Customer(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Reservation getReservation() {
        return reservation;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
}
