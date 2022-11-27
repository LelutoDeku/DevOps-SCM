class Banking{
    String name;
    int age;
    long aadhar;
    double balance;
    public double withdraw(double balance){
     System.out.println("Enter amount to withdraw ")
     amount=sc.nextDouble();
     if(amount>balance)
        System.out.println("Insufficient balance")
    else
        balance-balance-amount;
    return balance;

    }

    public double deposit(double balance){
        System.out.println("Enter amount to deposit ")
     amount=sc.nextDouble();
     balance-balance+amount;

        return balance;
    }
    void

}