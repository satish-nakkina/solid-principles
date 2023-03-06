package ecommerce.SRP;

import ecommerce.ISP.Receipt;

public class User {
    private String name;
    private String email;
    private String address;

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}