public class Account {
	private double money;
    private String username;
    private String password;
    private static Account(double money, String username, String password) {
        money = this.money;
    }
  public void deposit (double amount) {
      money += amount;
  }
  public double withdraw(double amount) {
      money -= amount;
  }
  public double getMoney() {
      return money;
  }
}
