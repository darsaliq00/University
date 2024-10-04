class BankAccount {
    private String accountNumber;
    private double balance;
    private double interestRate;
  
    public BankAccount(String accountNumber, double balance, double interestRate) {
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.interestRate = interestRate;
    }
  
    public void deposit(double amount) {
      if (amount > 0) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New balance: " + balance);
      } else {
        System.out.println("Deposit amount must be positive.");
      }
    }
  
    public double getBalance() {
      return balance;
    }
  }
  
  class SavingsAccount extends BankAccount {
    private double minimumBalance;
  
    public SavingsAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
      super(accountNumber, balance, interestRate);
      this.minimumBalance = minimumBalance;
    }
  
    public void withdraw(double amount) {
      if (amount > 0 && getBalance() - amount >= minimumBalance) {
        double newBalance = getBalance() - amount;
      
        deposit(-amount);  
        System.out.println("Withdrew: " + amount);
        System.out.println("New balance: " + newBalance);
      } else {
        System.out.println("Withdrawal amount must be positive and not reduce balance below minimum balance.");
      }
    }
  }
  
  class mod {
        public static void main(String[] args) {
          BankAccount bankAccount = new BankAccount("BA12345", 1000.0, 0.05);
          bankAccount.deposit(500.0);
      
          SavingsAccount savingsAccount = new SavingsAccount("SA12345", 2000.0, 0.03, 500.0);
          savingsAccount.deposit(300.0);
          savingsAccount.withdraw(1000.0);
        
    }
}

