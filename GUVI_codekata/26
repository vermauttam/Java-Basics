import java.util.Scanner;

// Custom Exception Class
class InsufficientFundsException extends Exception {
    //..... YOUR CODE STARTS HERE .....
    
    public InsufficientFundsException(String message) {
        super(message);
    }
    
    //..... YOUR CODE ENDS HERE .....
}

// BankAccount Class
class BankAccount {
    //..... YOUR CODE STARTS HERE .....
    
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal exceeds balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
    
    //..... YOUR CODE ENDS HERE .....
}

// Main Class
public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);
        
        // Input for initial balance and withdrawal amount
        double initialBalance = scanner.nextDouble();
        double withdrawalAmount = scanner.nextDouble();
        
        BankAccount account = new BankAccount(initialBalance);

        try {
            account.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds: " + e.getMessage());
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
