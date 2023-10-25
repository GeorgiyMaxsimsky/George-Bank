package OnlineBank;

public class Account {
    private String idOfAccount;
    private String passOfAccount;
    private Card accountCard1;
    private Card accountCard2;
    private Card accountCard3;
    private Card accountCard4;
    private Card accountCard5;


    public Account(String idOfAccount, String passOfAccount, Card accountCard1, Card accountCard2, Card accountCard3, Card accountCard4, Card accountCard5) {
        this.idOfAccount = idOfAccount;
        this.passOfAccount = passOfAccount;
        this.accountCard1 = accountCard1;
        this.accountCard2 = null;
        this.accountCard3 = null;
        this.accountCard4 = null;
        this.accountCard5 = null;
    }

    public String getIdOfAccount() {
        return idOfAccount;
    }

    public void setIdOfAccount(String idOfAccount) {
        this.idOfAccount = idOfAccount;
    }

    public String getPassOfAccount() {
        return passOfAccount;
    }

    public void setPassOfAccount(String passOfAccount) {
        this.passOfAccount = passOfAccount;
    }

    public Card getAccountCard1() {
        return accountCard1;
    }

    public void setAccountCard1(Card accountCard1) {
        this.accountCard1 = accountCard1;
    }

    public Card getAccountCard2() {
        return accountCard2;
    }

    public void setAccountCard2(Card accountCard2) {
        this.accountCard2 = accountCard2;
    }

    public Card getAccountCard3() {
        return accountCard3;
    }

    public void setAccountCard3(Card accountCard3) {
        this.accountCard3 = accountCard3;
    }

    public Card getAccountCard4() {
        return accountCard4;
    }

    public void setAccountCard4(Card accountCard4) {
        this.accountCard4 = accountCard4;
    }

    public Card getAccountCard5() {
        return accountCard5;
    }

    public void setAccountCard5(Card accountCard5) {
        this.accountCard5 = accountCard5;
    }
}
