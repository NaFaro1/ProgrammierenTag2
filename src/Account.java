public class Account {
    public static void main(String[] args) {
        int years = 10;
        double investment = 2000;
        double interestRate = 0.025;

        calculateAccountBalance(years, investment, interestRate);
    }


    public static double calculateAccountBalance(int years, double investments, double interestRate) {

        double accountBalance = investments;

        for (int i = 1; i <= years; i++)
        {
            accountBalance = accountBalance + (accountBalance * interestRate);
            System.out.println(accountBalance + "Euros in Year" + i);

        }
        return accountBalance;
    }


}

