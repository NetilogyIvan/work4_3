public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double interestRate = 9.99;
        double amountOfCredit = 1_000_000;
        int loanTerms = 12;
        int monthlyPayment = service.calculate(interestRate, amountOfCredit, loanTerms);

        System.out.println("Ежемесячный платёж: " + monthlyPayment + " руб");
        System.out.println("Ежемесячный платёж: " + service.calculate(interestRate, amountOfCredit, 24) + " руб");
        System.out.println("Ежемесячный платёж: " + service.calculate(interestRate, amountOfCredit, 36) + " руб");
    }
}