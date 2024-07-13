import java.util.Scanner;

public class ATM {

    private int balance = 10000; 
    private Scanner scanner;

    public ATM() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the Bank ATM");
        System.out.println("1. Withdraw Funds");
        System.out.println("2. Deposit Funds");
        System.out.println("3. View Account Balance");
        System.out.println("4. Exit");
        System.out.println("================================");
    }


    public void withdrawMoney() {
        System.out.println("Enter the amount you wish to withdraw:");
        int amount = scanner.nextInt();

        if (amount > balance) {
            System.out.println("Sorry, you have insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Please collect your cash.");
        }
    }

    public void depositMoney() {
        System.out.println("Enter the amount you wish to deposit:");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("Deposit successful. Thank you.");
    }

    public void checkBalance() {
        System.out.println("Your current account balance is: $" + balance);
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdrawMoney();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM1. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }
}