import java.util.Scanner;
// program to find effective temperature
public class WindChill {
    public static void main(String[] args) {
        double temp, velocity;
        double windChill = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit:");
        temp = scanner.nextDouble();
        System.out.println("Enter wind velocity");
        velocity = scanner.nextDouble();
        if(temp>50 || velocity>120 || velocity<3){
            System.out.println(" kindly enter velocity within 3-120 and temperature within 50");
        } else {
        windChill = 35.74 + (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(velocity,0.16);

        System.out.println("Effective temperature: " + windChill);}
    }
}