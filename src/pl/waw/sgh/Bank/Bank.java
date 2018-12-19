package pl.waw.sgh.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> custList = new ArrayList<>();

    private List<Account> accList = new ArrayList<>();

    private Integer lastCustId = 0;

    private Integer lastAccID = 100;

    //Public API
    public Customer newCustomer(String firstName, String lastName, String email) {

        Customer cust = new Customer(lastCustId++, firstName, lastName, email);
        custList.add(cust);
        return cust;
    }

    public Account newAccount(Customer cust, String accType) {

        Account acc;

        switch (accType) {
            case "Savings":
                acc = new SavingsAccount(lastAccID++, 0.00, cust);
                break;
            case "Debit":
                acc = new DebitAccount(lastAccID++, 0.00, cust);
                break;
            default:
                acc = new CheckingAccount(lastAccID++, 0.00, cust);

        }
        accList.add(acc);
        return acc;
    }

    private Account findAccountByID(Integer accID) {
        for (Account acc : accList) {
            if (acc.getAccountID().equals(accID)) {
                return acc;
            }
        }
        return null;
    }

    public void transfer(Integer fromAccID, Integer toAccId, Double amount) throws NotEnoughMoneyException {
        Account fromAcc = findAccountByID(fromAccID);
        Account toAcc = findAccountByID(toAccId);
        fromAcc.charge(amount);
        toAcc.deposit(amount);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "custs=\n" + custList +
                ", \nacc=\n" + accList +
                '}';
    }


}
