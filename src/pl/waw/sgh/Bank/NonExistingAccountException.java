package pl.waw.sgh.Bank;

public class NonExistingAccountException extends BankException {
    public NonExistingAccountException(String message) {
        super(message);
    }

    private Integer accountID;

    public NonExistingAccountException(Integer accountID) {
        super("No such account exists, requested account ID: " + accountID);
        this.accountID = accountID;
    }
}
