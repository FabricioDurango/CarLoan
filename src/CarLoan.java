public class CarLoan {
    public CarLoan(int carLoan, int loanLength, int downPayment, int interestRate) {
        if (loanLength <= 0) {
            System.out.println("Error! you must take out a valid car  loan");

        } else if (downPayment >= carLoan) {
            System.out.println("the car can be paid in full");

        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("your monthy payment is: $" + monthlyPayment);
        }
    }
}
