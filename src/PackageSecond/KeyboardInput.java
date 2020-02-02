package PackageSecond;
import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter the length: ");
        int length;
        length = myInput.nextInt();
        int width;
        System.out.println("Please enter the width:");
        width = myInput.nextInt();
        System.out.println("Rectangle area:" +(length*width));


        System.out.println("Please enter the radius: ");
        int radius;
        double PI =3.14;
        radius = myInput.nextInt();
        System.out.println("Perimeter of Circle is:" +(2*PI*radius));

    }

}



