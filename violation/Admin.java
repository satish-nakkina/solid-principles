package violation;

public class Admin extends User {
    private boolean isAdmin;

    public Admin(String name, String email, String address, boolean isAdmin) {
        super(name, email, address);
        this.isAdmin = isAdmin;
    }

    public void paymentReceipt() {
        throw new UnsupportedOperationException("Admin do not have payment receipts.");
    }
}
