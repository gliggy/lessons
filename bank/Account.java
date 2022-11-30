public class Account {
    private double money;
    private String username;
    private String password;
    private Account(double money, String username, String password) {
        this.money = money;
        this.username = username;
        this.password = password;
    }
    public void deposit (double amount) {
        money += amount;
    }
    public double withdraw(double amount) {
        money -= amount;
        return amount;
    }
    public double getMoney() {
        return money;
    }
}
