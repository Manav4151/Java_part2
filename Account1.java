//21CE097 Manav Patel
/*
 Use the Account class created as above to simulate an ATM machine. Create 10 accounts  with id AC001.....AC010  with  initial balance 300₹. The system prompts the users to enter an id. If the id is entered incorrectly, ask the  user  to  enter  a  correct  id.  Once  an  id  is  accepted,  display  menu  with multiple choices. 
1.Balance inquiry
2.Withdraw money [Maintain minimum balance 300₹]
3.Deposit money
4.Money Transfer
5.Create Account
6.Deactivate Account
7.Exit Hint: Use ArrayList, which is can shrink and expand with compared to Array.

 */

import java.util.Scanner;
public class Account1 {



    public String id;
    double balance = 3000;

    Account1() {

    }

    public Account1(String s) {
        id = s;
    }

    public static void main(String[] args) {
        Account1[] acc = new Account1[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            acc[i] = new Account1();
            acc[i] = new Account1("AC" + i);
            System.out.println(acc[i].id );
        }
        int k = 0;
        int l;
        int j;

        do {
            System.out.println("Enter valid ID number");
            String t = sc.next();
            for (j = 1; j <= 10; j++) {
                if (t.equals(acc[j].id)) {
                    k++;
                    break;

                } else {

                }
            }
            if (k == 0) {
                l = 10;
            } else {
                l = 3;
            }
        } while (l != 3);
        System.out.println("Hello");

        System.out.println("ENter 1 for balance");
        System.out.println("ENter 2 for withdraw");
        System.out.println("ENter 3 for deposit");
        System.out.println("ENter 4 for money transfer");
        System.out.println("ENter 5 for create account");
        System.out.println("ENter 6 for deactivate account");
        System.out.println("Enter 7 for exiting");
        int x = sc.nextInt();
        switch (x) {
            case 1: {
                System.out.println(acc[2].balance);
                break;
            }
            case 2: {
                int s = sc.nextInt();
                acc[j].balance -= s;
                System.out.println(acc[2].balance);
                break;
            }
            case 3: {
                int s = sc.nextInt();
                acc[j].balance += s;
                System.out.println(acc[2].balance);
                break;
            }
            case 4: {
                int s = sc.nextInt();
                System.out.print("To be transferred in :");
                int i = sc.nextInt();
                acc[i].balance += s;
                acc[j].balance -= s;
                System.out.println(acc[j].balance);

                System.out.println(acc[i].balance);
                break;

            }
            case 5: {
                acc[11] = new Account1();
                System.out.println("Account created");
                break;

            }
            case 6: {
                acc[j].balance = 0;
                acc[j].id = "0A";
                break;
            }

        }

    }
}


