package ProductPurchaseandDiscountCalculator;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Productname;
        double Productprice;
        int Quantity;
        int ProductCategory;

        double taxamount;
        double deliveryCharge;

        System.out.println("Enter Product Name: ");
        Productname = scanner.nextLine();
        System.out.println("Enter Product Price: ");
        Productprice = scanner.nextDouble();
        System.out.println("Enter Quantity of Product: ");
        Quantity = scanner.nextInt();
        System.out.println("Enter Tax Amount: ");
        taxamount = scanner.nextDouble();
        System.out.println("Enter Delivery Charges:");
        deliveryCharge = scanner.nextDouble();
        System.out.println("Customer Categories ");
        System.out.println("1.Regular Customer");
        System.out.println("2.Student Customer");
        System.out.println("3.Premium Customer");

        System.out.println("\n");
        System.out.println("Enter product Categories 1 to 3 :");
        ProductCategory = scanner.nextInt();
        double payprice = 0;
        double finalprice = 0;
        double Discountprice = 0;
        double aftertax = 0;
        double finalPay = 0;

        if (ProductCategory == 1) {
            System.out.println("1.Regular Customer ");
            finalprice = Productprice * Quantity;
            Discountprice = (finalprice * 5) / 100;
            payprice = finalprice - Discountprice;
            aftertax = payprice + taxamount;
            finalPay = aftertax + deliveryCharge;

            System.out.println("Product Name:" + Productname);
            System.out.println("Original Amount :" + Productprice);
            System.out.println("Final Amount: " + finalprice);
            System.out.println("Membership Discount: " + Discountprice);
            System.out.println("Amount after Discount: " + payprice);
            System.out.println("Tax Amount: " + taxamount);
            System.out.println("Delivery Charges: " + deliveryCharge);

            System.out.println("Final Payable Amount: " + finalPay);
            System.out.println("Benefit Status: Membership benefit applied .");

        } else if (ProductCategory == 2) {
            finalprice = Productprice * Quantity;
            Discountprice = (finalprice * 10) / 100;
            payprice = finalprice - Discountprice;
            aftertax = payprice + taxamount;
            finalPay = aftertax + deliveryCharge;

            System.out.println("Product Name:" + Productname);
            System.out.println("Original Amount :" + Productprice);
            System.out.println("Final Amount: " + finalprice);
            System.out.println("Membership Discount: " + Discountprice);
            System.out.println("Amount after Discount: " + payprice);
            System.out.println("Tax Amount: " + taxamount);
            System.out.println("Delivery Charges: " + deliveryCharge);

            System.out.println("Final Payable Amount: " + finalPay);
            System.out.println("Benefit Status: Membership benefit applied .");
        } else if (ProductCategory == 3) {
            finalprice = Productprice * Quantity;
            Discountprice = (finalprice * 15) / 100;
            payprice = finalprice - Discountprice;
            aftertax = payprice + taxamount;
            finalPay = aftertax + deliveryCharge;

            System.out.println("Product Name:" + Productname);
            System.out.println("Original Amount :" + Productprice);
            System.out.println("Final Amount: " + finalprice);
            System.out.println("Membership Discount: " + Discountprice);
            System.out.println("Amount after Discount: " + payprice);
            System.out.println("Tax Amount: " + taxamount);
            System.out.println("Delivery Charges: " + deliveryCharge);

            System.out.println("Final Payable Amount: " + finalPay);
            System.out.println("Benefit Status: Membership benefit applied .");
        } else {
            System.out.println("entered wrong categories option !");
        }

    }
}
