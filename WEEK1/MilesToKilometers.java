package firstJavaProgram;
import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the distance in miles: ");
        
       
        double miles = scanner.nextDouble();
        
       
        scanner.close();
        
        
        double kilometers = miles * 1.60935;
        
       
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
