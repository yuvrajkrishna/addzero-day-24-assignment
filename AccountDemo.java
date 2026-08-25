class AccountDemo {

    public static void main(String[] args) {

        Account a1 = new Account(101, "Yuvraj", 10000, 5);

        a1.calculateInterest();

        a1.displayAccountDetails();
    }
}


 class Account {

    int accountNumber;
    String custName;
    float balance;
    float interestRate;

    Account(int accountNumber,
            String custName,
            float balance,
            float interestRate) {

        this.accountNumber = accountNumber;
        this.custName = custName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void calculateInterest() {

        float interest = (interestRate * balance) / 100;

        balance = balance + interest;
        
    }

    public void displayAccountDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + custName);
        System.out.println("Balance        : " + balance);
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}

