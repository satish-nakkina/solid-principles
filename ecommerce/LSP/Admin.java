package ecommerce.LSP;


import ecommerce.SRP.User;

public class Admin extends User {
    private  boolean isAdmin;

    public Admin(String name, String email, String address, boolean isAdmin) {
        super(name, email, address);
        this.isAdmin=isAdmin;
    }

}
