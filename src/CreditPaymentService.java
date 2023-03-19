public class CreditPaymentService {

    public int calculate(double interestRate, double amountOfCredit, int loanTerms) {
        double resultOne = amountOfCredit * (interestRate / (12 * 100));
        double resultTwo = 1 - Math.pow (1 + (interestRate / (12 * 100)), -loanTerms);
        double monthlyPayment = resultOne / resultTwo;

        return (int) monthlyPayment;
    }
}
