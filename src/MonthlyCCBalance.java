public class MonthlyCCBalance {
    public static void main(String[] args) {

        //Variables
        double intialBalance = 5000.00;
        double interestRate = 0.17;
        double firstMonthInterest = intialBalance * (interestRate / 12);
        double secondMonthInterest = (intialBalance + firstMonthInterest) * (interestRate / 12);

        //Outputs
        System.out.println("Interest after one month: $" + firstMonthInterest);
        System.out.println("Interest after two months: $" + secondMonthInterest);
    }
}
