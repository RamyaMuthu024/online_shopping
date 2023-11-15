import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Ramya Muthu
 */
public class online_shopping {
    public static void main(String[] args) {
        int totalCost = 0;
        int[] quantity = new int[12];
        int[] cost = new int[12];
        String[] items = {
                "Sandisk 16 GB",
                "Logitech Mouse",
                "Pendrive 16 GB",
                "Dell Keyboard",
                "Adidas",
                "Nike",
                "Leecooper",
                "Campus",
                "Mi Note 3",
                "Nokia 3",
                "Samsung",
                "LG"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int billNumber = random.nextInt(1000000) + 1000;
        int transcationNumber = random.nextInt(10000000) + 10000;

        System.out.printf("\nBill Number: %d\n", billNumber);
        System.out.println("Please Enter Your Name");
        String name = scanner.nextLine();
         String phoneNumber;
        do {
        System.out.println("Please Enter Your Phone Number");
        phoneNumber = scanner.nextLine();
         if (phoneNumber.length() != 10) {
                System.out.println("Invalid Phone Number Length. Please enter a valid 10-digit phone number.");
            }
        } while (phoneNumber.length() != 10);

        System.out.printf("Hello %s, Welcome to our Online Shopping.\n", name);

        int choice, c = 1;

        do {
            if (c == 1) {
                System.out.println("Enter\n1 - Computer Accessories\n2 - Shoes\n3 - Mobiles\nAny other number to exit");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        int accessoriesChoice;
                        System.out.println("Enter\n1 - Sandisk 16 GB - Rs.355\n2 - Logitech Mouse- Rs.500\n3 - Pendrive 16 GB - Rs.550\n4 - Dell Keyboard - Rs.1340\nAny other number to exit");
                        accessoriesChoice = scanner.nextInt();
                        cost[0] = 355;
                        cost[1] = 500;
                        cost[2] = 550;
                        cost[3] = 1340;

                        switch (accessoriesChoice) {
                            case 1:
                                int num;
                                System.out.println("You chose Sandisk 16GB with Rs.355. How many do you want to buy?");
                                quantity[0] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[0] * quantity[0];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            case 2:
                                System.out.println("You chose Logitech Mouse with Rs.500. How many do you want to buy?");
                                quantity[1] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[1] * quantity[1];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            case 3:
                                System.out.println("You chose Pendrive 16GB with Rs.550. How many do you want to buy?");
                                quantity[2] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[2] * quantity[2];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            case 4:
                                System.out.println("You chose Dell Keyboard with Rs.1350. How many do you want to buy?");
                                quantity[3] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[3] * quantity[3];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            default:
                                System.out.println("Exit from Computer Accessories");
                                break;
                        }
                        break;

                    case 2:
                        int shoesChoice;
                        System.out.println("Enter\n1 - Adidas - Rs.3550\n2 - Nike - Rs.5000\n3 - Leecooper - Rs.2800\n 4- Campus - Rs.2500\nAny other number to exit");
                        shoesChoice = scanner.nextInt();
                        cost[4] = 3550;
                        cost[5] = 5000;
                        cost[6] = 2800;
                        cost[7] = 2500;

                        switch (shoesChoice) {
                            case 1:
                                int num;
                                System.out.println("You chose Adidas Shoes for Rs.3550. How many do you want to buy?");
                                quantity[4] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[4] * quantity[4];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            case 2:
                                System.out.println("You chose Nike Shoes for Rs.5000. How many do you want to buy?");
                                quantity[5] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[5] * quantity[5];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            case 3:
                                System.out.println("You chose Leecooper Shoes for Rs.2800. How many do you want to buy?");
                                quantity[6] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[6] * quantity[6];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            case 4:
                                System.out.println("You chose Campus Shoes for Rs.2500. How many do you want to buy?");
                                quantity[7] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[7] * quantity[7];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            default:
                                System.out.println("Exit from Shoes Category");
                                break;
                        }
                        break;

                    case 3:
                        int mobileChoice;
                        System.out.println("Enter\n1 - Mi Note 3 - Rs.11000\n2 - Nokia 3 - Rs.9866\n3 - Samsung - Rs.12800\n4 - LG - Rs.1390\nAny other number to exit");
                        mobileChoice = scanner.nextInt();
                        cost[8] = 11000;
                        cost[9] = 9866;
                        cost[10] = 12800;
                        cost[11] = 1390;

                        switch (mobileChoice) {
                            case 1:
                                int num;
                                System.out.println("You chose Mi Note 3 for Rs.11000. How many do you want to buy?");
                                quantity[8] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[8] * quantity[8];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            case 2:
                                System.out.println("You chose Nokia 3 for Rs.9866. How many do you want to buy?");
                                quantity[9] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[9] * quantity[9];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            case 3:
                                System.out.println("You chose Samsung for Rs.12800. How many do you want to buy?");
                                quantity[10] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[10] * quantity[10];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            case 4:
                                System.out.println("You chose LG for Rs.1390. How many do you want to buy?");
                                quantity[11] = scanner.nextInt();
                                System.out.println("Are you sure to buy? If 'Yes' Enter 1 else any number");
                                num = scanner.nextInt();
                                if (num == 1) {
                                    totalCost += cost[11] * quantity[11];
                                }
                                System.out.printf("Your Cost in Cart is %d\n", totalCost);
                                break;
                            default:
                                System.out.println("Exit from Mobile Category");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Enter Valid Categories Choice");
                        break;
                }
                System.out.printf("%s's cart\n", name);
                System.out.println("Id\tItems\t\t\tQuantity\t\t\tCost");
                for (int i = 0; i < 12; i++) {
                    if (quantity[i] != 0) {
                        System.out.printf("%d\t%s\t\t%d\t\t\t%d\n", i, items[i], quantity[i], (cost[i] * quantity[i]));
                    }
                }

                System.out.printf("Total Cost\t\t\t\t\t%d\n", totalCost);
                System.out.println("If you wish to buy anything more Enter\n1 to Add Item\n2 to Delete Items \nAny other number to Exit");
                c = scanner.nextInt();
            }

            if (c == 2) {
                int id;
                System.out.println("Enter id to delete item");
                id = scanner.nextInt();

                if (id < 9 && id > 0) {
                    totalCost -= cost[id] * quantity[id];
                    quantity[id] = 0;
                } else {
                    System.out.println("Enter Valid id");
                }

               /* System.out.println("Revised Items ");
                System.out.println("Id\tItems\t\t\tQuantity\t\tCost");
                for (int i = 0; i < 12; i++) {
                    if (quantity[i] != 0) {
                        System.out.printf("%d\t%s\t\t%d\t\t%d\n", i, items[i], quantity[i], (cost[i] * quantity[i]));
                    }
                }*/
               System.out.println("Revised Items ");
               System.out.println("Id    Items               Quantity        Cost");
                for (int i = 0; i < 12; i++) {
                    if (quantity[i] != 0) {
                        System.out.printf("%-6d%-20s%-20d%-8d\n", i, items[i], quantity[i], (cost[i] * quantity[i]));
                    }
                }


                System.out.printf("Total Cost\t\t\t\t\t%d\n", totalCost);
                System.out.println("If you wish to buy anything more Enter\n1 to Add Item\n2 to Delete Items \nAny other number to Exit");
                c = scanner.nextInt();
            }

        } while (c == 1 || c == 2);

        System.out.println("Your Final Cost is " + totalCost);
        System.out.println("Select Payment Method:");
        System.out.println("1 - Online Payment");
        System.out.println("2 - Cash");
        int paymentChoice = scanner.nextInt();

        if (paymentChoice == 1) {
            System.out.println("Select Online Payment Method:");
            System.out.println("1 - Debit Card");
            System.out.println("2 - Credit Card");
            System.out.println("3 - GPay/PhonePay");
            int onlinePaymentChoice = scanner.nextInt();

            switch (onlinePaymentChoice) {
                case 1:
                     String cardNumber;
                     int pin;
                    do{
                    System.out.println("Enter Debit Card details");
                    System.out.println("Enter Card Number:");
                    cardNumber = scanner.next();
                    if (cardNumber.length() != 12) {
                            System.out.println("Invalid Debit Card Number Length. Please enter a valid 12-digit debit card number.");
                        }
                    } while (cardNumber.length() != 12);
                    do{
                    System.out.println("Enter PIN:");
                    pin = scanner.nextInt();
                     if (pin < 1000 || pin > 9999) {
                            System.out.println("Invalid PIN Length. Please enter a valid 4-digit PIN.");
                     }
                      else {
                        System.out.println("Transaction Failed. Invalid Debit Card Details.Please enter again");
                        }
                    } while (pin < 1000 || pin > 9999);
                    break;
                case 2:
                     String cardNumber2;
                     int pin2;
                    do{
                    System.out.println("Enter Credit Card details");
                    System.out.println("Enter Card Number:");
                    cardNumber2 = scanner.next();
                    if (cardNumber2.length() != 12) {
                            System.out.println("Invalid Crebit Card Number Length. Please enter a valid 12-digit debit card number.");
                        }
                    } while (cardNumber2.length() != 12);
                    do{
                    System.out.println("Enter PIN:");
                    pin2 = scanner.nextInt();
                     if (pin2 < 1000 || pin2 > 9999) {
                            System.out.println("Invalid PIN Length. Please enter a valid 4-digit PIN.");
                     }
                      else {
                        System.out.println("Transaction Failed. Invalid Debit Card Details.Please enter again");
                        }
                    } while (pin2 < 1000 || pin2 > 9999);
                    break;
                case 3:
                    int upiid;
                    System.out.println("Enter GPay/PhonePay details");
                    do{
                    System.out.println("Enter UPI ID:");
                    upiid = scanner.nextInt();
                     if (upiid >= 1000 && upiid <= 9999) {
                        System.out.println("Transaction Successful!");
                        System.out.printf("\n Transaction Number: %d\n", transcationNumber);                 
                    } else {
                        System.out.println("Transaction Failed. Invalid Debit Card Details.");
                    }
                     } while (String.valueOf(upiid).length() != 4);
                    break;
               
                   
                    
                    
                    
                default:
                    System.out.println("Invalid Online Payment Method");
            }

        } else if (paymentChoice == 2) {
            System.out.println("Pay with Cash");
            System.out.println("Transaction Successful!");
        } else {
            System.out.println("Invalid Payment Method");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("\nCustomer Details:");
        System.out.printf("\nBill Number: %d\n", billNumber);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);

        System.out.println("\nProducts Purchased:");
        for (int i = 0; i < 12; i++) {
            if (quantity[i] != 0) {
                System.out.printf("%s - Quantity: %d - Cost: %d\n", items[i], quantity[i], (cost[i] * quantity[i]));
            }
        }

        System.out.printf("\nTotal Amount: %d\n", totalCost);

        String paymentMethod = (paymentChoice == 1) ? "Online Payment" : "Cash";
        System.out.println("Payment Method: " + paymentMethod);

        System.out.printf("\nThanks %s for Choosing Us and Visit us again.\n", name);
        System.out.println("-------------------------------------------------------------------------------------------------------------");

    }
}
