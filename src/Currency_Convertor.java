import java.text.DecimalFormat;
import java.util.*;

public class Currency_Convertor {
    public static void main(String[] args) {
        double amount, dollar, pound, code, euro, yen, ringgit, rupee;
        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Hi, Welcome to Currency Convertor!");
        System.out.println("");
        System.out.println("Which Currency, you want to convert ?");
        System.out.println(" 1. Rupees \n 2. Dollar \n 3. Pound \n 4. Euro \n 5. Yen \n 6. Ringgit");
        System.out.println("");
        code = sc.nextDouble();
        System.out.println("How Much Money you want to convert ?");
        System.out.println("");
        amount = sc.nextFloat();
        System.out.println("");
        // for Amounts Conversion
        if (code == 1) {
            dollar = amount / 74.5;
            System.out.println("Your " + amount + " Rupee is: " + f.format(dollar) + " Dollar");
            pound = amount / 101;
            System.out.println("Your " + amount + " Rupee is: " + f.format(pound) + " Pound");
            euro = amount / 84;
            System.out.println("Your " + amount + " Rupee is: " + f.format(euro) + " Euro");
            yen = amount / 0.64;
            System.out.println("Your " + amount + " Rupee is: " + f.format(yen) + " Yen");
            ringgit = amount / 17.69;
            System.out.println("Your " + amount + " Rupee is: " + f.format(ringgit) + " Ringgit");
        } else if (code == 2)// for Dollar Conversiion
        {
            rupee = amount * 74.5;
            System.out.println("Your " + amount + " Dollar is: " + f.format(rupee) + " Rupees");
            pound = amount * 0.73;
            System.out.println("Your " + amount + " Dollar is: " + f.format(pound) + " Pound");
            euro = amount * 0.88;
            System.out.println("Your " + amount + " Dollar is: " + f.format(euro) + " Euro");
            yen = amount * 114.24;
            System.out.println("Your " + amount + " Dollar is: " + f.format(yen) + " Yen");
            ringgit = amount * 4.18;
            System.out.println("Your " + amount + " Dollar is: " + f.format(ringgit) + " Ringgit");
        } else if (code == 3)// for Pound Conversiion
        {
            rupee = amount * 101;
            System.out.println("Your " + amount + " Pound is: " + f.format(rupee) + " Rupees");
            dollar = amount * 1.26;
            System.out.println("Your " + amount + " Pound is: " + f.format(dollar) + " Pound");
            euro = amount * 1.10;
            System.out.println("Your " + amount + " Pound is: " + f.format(euro) + " Euro");
            yen = amount * 140.93;
            System.out.println("Your " + amount + " Pound is: " + f.format(yen) + " Yen");
            ringgit = amount * 5.29;
            System.out.println("Your " + amount + " Pound is: " + f.format(ringgit) + " Ringgit");
        } else if (code == 4)// for Euro Conversiion
        {
            rupee = amount * 84;
            System.out.println("Your " + amount + " Euro is: " + f.format(rupee) + " Rupees");
            dollar = amount * 1.14;
            System.out.println("Your " + amount + " Euro is: " + f.format(dollar) + " Pound");
            pound = amount * 0.90;
            System.out.println("Your " + amount + " Euro is: " + f.format(pound) + " Euro");
            yen = amount * 127.43;
            System.out.println("Your " + amount + " Euro is: " + f.format(yen) + " Yen");
            ringgit = amount * 4.78;
            System.out.println("Your " + amount + " Euro is: " + f.format(ringgit) + " Ringgit");
        } else if (code == 5)// for Yen Conversiion
        {
            rupee = amount * 0.64;
            System.out.println("Your " + amount + " Yen is: " + f.format(rupee) + " Rupees");
            dollar = amount * 0.008;
            System.out.println("Your " + amount + " Yen is: " + f.format(dollar) + " Pound");
            pound = amount * 0.007;
            System.out.println("Your " + amount + " Yen is: " + f.format(pound) + " Euro");
            euro = amount * 0.007;
            System.out.println("Your " + amount + " Yen is: " + f.format(euro) + " Yen");
            ringgit = amount * 0.037;
            System.out.println("Your " + amount + " Yen is: " + f.format(ringgit) + " Ringgit");
        } else if (code == 6)// for Ringgit Conversiion
        {
            rupee = amount * 17.69;
            System.out.println("Your " + amount + " Ringgit is: " + f.format(rupee) + " Rupees");
            dollar = amount * 0.239;
            System.out.println("Your " + amount + " Ringgit is: " + f.format(dollar) + " Pound");
            pound = amount * 0.188;
            System.out.println("Your " + amount + " Ringgit is: " + f.format(pound) + " Euro");
            euro = amount * 0.289;
            System.out.println("Your " + amount + " Ringgit is: " + f.format(euro) + " Yen");
            yen = amount * 26.63;
            System.out.println("Your " + amount + " Ringgit is: " + f.format(yen) + " Ringgit");
        } else {
            System.out.println("Invalid Input ");
        }
        System.out.println("");
        System.out.println("Thanks For Using This Program For Currency Conversion....");
        System.out.println("");
    }
}