public class Main1 {

    public static void main(String[] args) {

        Account a1 = new Account();

        a1.setAccountDetails(110, "Yuvraj", 1000);

        a1.withdraw(200);

        a1.deposit(100);

        a1.dispAccountDetails();
    }
}

class Account {

    int accountNo;
    String custName;
    int accountBalance;

    public void setAccountDetails(int accountNo,
                                  String custName,
                                  int accountBalance) {

        this.accountNo = accountNo;
        this.custName = custName;
        this.accountBalance = accountBalance;
    }

    public void withdraw(int amount) {

        if(amount < accountBalance){
            accountBalance = accountBalance - amount;
            System.out.println(amount+" Sended Succesfully");
        }
        else{
            System.out.println("Withdraw Denied");
            System.out.println("Not Sufficient Money Available");
        }
    }

    public void deposit(int amount) {

        accountBalance = accountBalance + amount;
    }

    public void dispAccountDetails() {

        System.out.println("Account No : " + accountNo);
        System.out.println("Customer Name : " + custName);
        System.out.println("Account Balance : " + accountBalance);
    }
}