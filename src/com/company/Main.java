package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////        Car porsche = new Car();
////        Car holden = new Car();
////        porsche.setModel("Carrera");
////        System.out.println("Model is " + porsche.getModel());
//        Account giboAccount = new Account("12345", 0.00, "Gibrilla Kanu",
//                "gikanu694@gmail.com", "(078) 278531");
////        giboAccount.setNumber("12345");
////        giboAccount.setBalance(0.00);
////        giboAccount.setCustomerName("Gibrilla Kanu");
////        giboAccount.setCustomerEmailAddress("gikanu694@gmail.com");
////        giboAccount.setCustomerPhoneNumber("(078) 278531");
//        System.out.println(giboAccount.getNumber());
//        System.out.println(giboAccount.getBalance());
//        giboAccount.withdrawal(100.0);
//        giboAccount.deposit(50.0);
//        giboAccount.withdrawal(100.0);
//        giboAccount.deposit(51.0);
//        giboAccount.withdrawal(100.0);
//
//        Account KanuAccount = new Account(" Kanu", "kanu@gmail.com", " 12345");
//        System.out.println(KanuAccount.getNumber() + " name" + KanuAccount.getCustomerName());
//        System.out.println("Current balance is " +giboAccount.getBalance());
//        giboAccount.withdrawal(1000.55);
//
//        VipCustomer customer = new VipCustomer();
//        System.out.println(customer.getName());
//
//        VipCustomer customer1 = new VipCustomer("Kanu", 25000.00);
//        System.out.println(customer1.getName());
//
//        VipCustomer customer2 = new VipCustomer("gibo", 100.00, "gi@gmail..com");
//        System.out.println(customer2.getName());
//        System.out.println(customer2.getEmailAddress());

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Floor dimensions: ");
        System.out.print("Length: ");
        double floorLengthParameter = scannerObject.nextDouble();
        System.out.print("Width: ");
        double floorWidthParameter = scannerObject.nextDouble();

        Floor floorObject = new Floor(floorWidthParameter, floorLengthParameter);

        System.out.println();

        System.out.print("Desired carpet price: $");
        double carpetCostParameter = scannerObject.nextDouble();

        Carpet carpetObject = new Carpet(carpetCostParameter);

        System.out.println();

        Calculator calculatorObject = new Calculator(floorObject, carpetObject);
        System.out.println("Total carpeting price: $" + String.format("%.2f", calculatorObject.getTotalCost()));

        scannerObject.close();

    }

}
