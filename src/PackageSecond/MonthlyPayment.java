package PackageSecond;
import java.util.Scanner;
public class MonthlyPayment {
    public static void main(String[] args){
        Scanner myPayment = new Scanner (System.in);
        int MSRP;
        MSRP = myPayment.nextInt();
        System.out.println("Enter MSRP:");
        double driverDiscountPercentage;
        driverDiscountPercentage = myPayment.nextDouble();
        System.out.println("Enter discount percentage:");
        final double downPayment;
        downPayment =myPayment.nextDouble();
        System.out.println("Down Payment:");
        int numberOfMonth;
        numberOfMonth = myPayment.nextInt();
        System.out.println(" Enter Number Of Month:");
        System.out.println("Monthly Payment for Financed Car:" +(MSRP*driverDiscountPercentage-downPayment)/numberOfMonth);

    }
}
