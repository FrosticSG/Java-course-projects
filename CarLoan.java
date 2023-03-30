import java.util.Scanner;

public class CarLoan {
    
    public static void main(String[] args) {
        
        int carLoan;
        int loanLength;
        int interestRate;
        int downPayment;
        char Continue;

        Scanner scan = new Scanner(System.in);

        do {

            int i = 0;

            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();

            do {
                if (i > 0) {
                    System.out.println("Error! Loans less or equal to 0 are not processable.");
                }
                System.out.print("Enter car loan: ");
                carLoan = scan.nextInt();
                i++;
            } while (carLoan <= 0);

            System.out.println();
            System.out.println("Car loan: " + carLoan);
            System.out.println();

            i = 0;

            do {
                if (i > 0) {
                    System.out.println("Error! You must take out a valid car loan.");
                }
                System.out.print("Enter loan length (in years): ");
                loanLength = scan.nextInt();
                System.out.print("Enter interest rate: ");
                interestRate = scan.nextInt();
                i++;
            } while (loanLength <= 0 || interestRate <= 0);

            System.out.println();
            System.out.println("Loan length: " + loanLength + "\n" + "Interest rate: " + interestRate);
            System.out.println();

            System.out.print("Enter down payment: ");
            downPayment = scan.nextInt();

            if (downPayment >= carLoan ) {
                System.out.println("The car can be paid in full.");
            } else {

                System.out.println();
                System.out.println("down payment: " + downPayment);
                System.out.println();

                int remainingBalance = carLoan - downPayment;
                int months = loanLength * 12;
                int monthlyBalance = remainingBalance / months;
                int interest = (monthlyBalance * interestRate) / 100;
                int monthlyPayment = monthlyBalance + interest;
                System.out.println(monthlyPayment);
            }
            
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();

            System.out.print("Do you want to continue (y/n): ");
            Continue = scan.next().charAt(0);

        } while (Continue == 'y');

        System.exit(0);
    }
}
