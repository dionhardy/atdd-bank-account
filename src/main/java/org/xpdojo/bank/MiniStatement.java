package org.xpdojo.bank;

public class MiniStatement {
    private final Account account;

    public MiniStatement(Account account, String datetime) {
        this.account=account;
    }

    public String isCurrentBalance(long amount){
        Money value=Money.amountOf(amount);
        return value.equals(account.balance())?"correctly":("incorrectly (" + account.balance() + " vs " + value+")");
    }

    public Money getCurrentBalance(){
        return account.balance();
    }
}
