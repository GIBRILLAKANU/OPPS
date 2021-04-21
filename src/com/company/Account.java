package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(){
      this("56789", 2.50, "Default name",
              "Default address", "Default phone");
      System.out.println("Empty Constructor called");
  }
  public  Account(String number, double balance, String customerName, String customerEmailAddress,
                  String customerPhoneNumber){
      System.out.println("Amount constructor with parameters called");
      this.number = number;
      this.balance = balance;
      this.customerName = customerName;
      this.customerEmailAddress = customerEmailAddress;
      this.customerPhoneNumber = customerPhoneNumber;
  }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + balance);
    }
    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount <=0){
            System.out.println("only " + balance + " available. withdrawal not processed");
        }else{
            balance -= withdrawalAmount;
            System.out.println("");
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
