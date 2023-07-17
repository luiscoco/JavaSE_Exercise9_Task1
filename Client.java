public class Client {
    private String name;
    private Account account;

    public Client(String name, double initialBalance) {
        this.name = name;
        this.account = new Account(1, initialBalance);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
