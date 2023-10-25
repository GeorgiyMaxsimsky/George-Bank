package OnlineBank;

public class User {
    private String Name;
    private String Surname;
    private int id;
    private String passWord;
    private String keyWord;
    private Pasport pasport;
    private Account userAccount1;
    private Account userAccount2;
    private Account userAccount3;
    private Account userAccount4;
    private Account userAccount5;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Pasport getPasport() {
        return pasport;
    }

    public void setPasport(Pasport pasport) {
        this.pasport = pasport;
    }

    public Account getUserAccount1() {
        return userAccount1;
    }

    public void setUserAccount1(Account userAccount1) {
        this.userAccount1 = userAccount1;
    }

    public Account getUserAccount2() {
        return userAccount2;
    }

    public void setUserAccount2(Account userAccount2) {
        this.userAccount2 = userAccount2;
    }

    public Account getUserAccount3() {
        return userAccount3;
    }

    public void setUserAccount3(Account userAccount3) {
        this.userAccount3 = userAccount3;
    }

    public Account getUserAccount4() {
        return userAccount4;
    }

    public void setUserAccount4(Account userAccount4) {
        this.userAccount4 = userAccount4;
    }

    public Account getUserAccount5() {
        return userAccount5;
    }

    public void setUserAccount5(Account userAccount5) {
        this.userAccount5 = userAccount5;


    }


    public User(String name, String surname, int id, String passWord, String keyWord, Pasport pasport, Account userAccount1, Account userAccount2, Account userAccount3, Account userAccount4, Account userAccount5) {
        Name = name;
        Surname = surname;
        this.id = id;
        this.passWord = passWord;
        this.keyWord = keyWord;
        this.pasport = pasport;
        this.userAccount1 = userAccount1;
        this.userAccount2 = userAccount2;
        this.userAccount3 = userAccount3;
        this.userAccount4 = userAccount4;
        this.userAccount5 = userAccount5;
    }
}



