
import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        float principal = scanner.nextFloat();

        System.out.print("Annual Intrest Rate: ");
        float annual = scanner.nextFloat();

        float monthlyIntrest =annual/PERCENT / MONTHS_IN_YEAR;
        System.out.print("Period( Years ): ");
         byte years = scanner.nextByte();

        int numberOfPayments= years*MONTHS_IN_YEAR;
        double mortage = principal*(monthlyIntrest*Math.pow(1+monthlyIntrest,numberOfPayments)/(Math.pow(1+monthlyIntrest,numberOfPayments)-1));

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: "+ mortageFormatted + " Dollars");
    }
}