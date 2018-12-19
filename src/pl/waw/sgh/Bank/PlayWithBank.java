package pl.waw.sgh.Bank;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer c1 = bank.newCustomer("John", "Doe", "dkashdjka@asjkldj.com");
        Customer c2 = bank.newCustomer("Jsadn", "Dafe", "dkashdjka@asjkldj.com");
        Account a1 = bank.newAccount(c1, "Debit");
        Account a2 = bank.newAccount(c1, "Savings");
        Account a3 = bank.newAccount(c1, "Null");
        Account a4 = bank.newAccount(c2, "Debit");
        Account a5 = bank.newAccount(c2, "Savings");

        a1.deposit(100.0);

        try {
            a1.deposit(150.0);
            a1.deposit(100.0);
            a1.charge(200.0);
            bank.transfer(1, 2, 50.0);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
            ;
        }

        System.out.println(bank);

    }
}
