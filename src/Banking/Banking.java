package Banking;

public class Banking {
  private String  firstName;
  private String lastName;
  private double balance;

  public Banking(String firstName, String lastName, double balance) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
  }

  // if the person  perform transaction from banker it returns true if not if person uses ATM or anything it
  // it returns false
  public double deposit( double amount, boolean branch){
    balance += amount;
    return balance;
  }

  // if the person  perform transaction from banker it returns true if not if person uses ATM or anything it
  // it returns false
  public double withdraw( double amount, boolean branch){
    balance -= amount;
    return balance;
  }

  public double getBalance() {
    return balance;
  }
}
