package activity1;

public class Bank {
    public double cashCheck(Check theCheck, CheckingAccount account) {
        double amount = theCheck.getAmount();

        double balance = account.getBalance();

    if (balance < amount) {
        double something = account.addInsufficientFundsFee();
        String somethingAgain = account.noteReturnedCheck(theCheck);
        }

    account.addDebitTransaction(CheckNumber, amount);

    account.storeCheckPhoto(theCheck);

    return cash;
    }

    private void returnCheck(Check theCheck){
        ///
    }



}
/*
checkingaccount no object for account
getcheck number is missing
getter setter for getchecknumber
*/