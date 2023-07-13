import java.util.*;
import java.text.DecimalFormat;

public class currencyConvertor {
    public static void main(String[] args) {
        double amount;

        double rupee,dollar,pound,euro,yen;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Choices are : ");
        System.out.println("Choose 1 : Rupee");
        System.out.println("Choose 2 : Dollar");
        System.out.println("Choose 3 : Pound");
        System.out.println("Choose 4 : Euro");
        System.out.println("Choose 5 : Yen");

        System.out.print("Option selected : ");
        choice = sc.nextInt();

        System.out.println("Enter amount to convert = ");
        amount = sc.nextFloat();

        switch (choice)
        {
            case 1 : //rupee conversion
            dollar = amount/70;
            System.out.println(amount + " Rupee = " + f.format(dollar) + "Dollar");
            pound = amount/88;
            System.out.println(amount + " Rupee = " + f.format(pound) + "Pound");
            euro = amount/80;
            System.out.println(amount + " Rupee = " + f.format(euro) + "Euro");
            yen = amount/0.63;
            System.out.println(amount + " Rupee = " + f.format(yen) + "Yen");
            break;

            case 2: //Dollar conversion
            rupee  = amount * 70;
            System.out.println(amount + " Dollar = " + f.format(rupee) + "Rupees");
            pound = amount * 0.78;
            System.out.println(amount + " Dollar = " + f.format(pound) + "Pound");
            euro = amount * 0.87;
            System.out.println(amount + " Dollar = " + f.format(euro) + "Euro");
            yen = amount*111.087;
            System.out.println(amount + " Dollar = " + f.format(yen) + "Yen");
            break;

            case 3: //Pound Conversion
        rupee = amount *88;
        System.out.println(amount + "Pound = " + f.format(rupee) + "Rupees");
        dollar = amount* 1.26 ;
        System.out.println(amount + "Pound = " + f.format(dollar) + "Dollar");
        euro = amount* 1.10 ;
        System.out.println(amount + "Pound = " + f.format(euro) + "Euro");
        yen = amount * 140.93 ;
        System.out.println(amount + "Pound = " + f.format(yen) + "Yen");
        break;

        case 4: //euro Conversion
        rupee = amount *80;
        System.out.println(amount + "Euro = " + f.format(rupee) + "Rupees");
        dollar = amount* 1.14 ;
        System.out.println(amount + "Euro = " + f.format(dollar) + "Dollar");
        pound = amount* 0.90 ;
        System.out.println(amount + "Euro = " + f.format(pound) + "Pound");
        yen = amount * 127.32 ;
        System.out.println(amount + "Euro = " + f.format(yen) + "Yen");
        break;

        case 5: //yen Conversion
        rupee = amount *0.63;
        System.out.println(amount + "Yen = " + f.format(rupee) + "Rupees");
        dollar = amount* 0.008 ;
        System.out.println(amount + "Yen = " + f.format(dollar) + "Dollar");
        pound = amount* 0.007 ;
        System.out.println(amount + "Yen = " + f.format(pound) + "Pound");
        euro = amount * 0.007 ;
        System.out.println(amount + "Yen = " + f.format(euro) + "Euro");
        break;

        default:
        System.out.println("INVALID!");
        sc.close();
    }
}
}