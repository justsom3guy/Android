import java.util.Scanner;

public class Driver{
    public static void main(String[] args){

        //using scanner class to input the data into diff variables
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Name of phone");
        String name=scanner.next();
        System.out.println("Enter the brand of phone");
        String brand=scanner.next();
        System.out.println("Enter the price of phone");
        int price=scanner.nextInt();
        System.out.println("Enter the size of phone");
        int size=scanner.nextInt();
        System.out.println("Enter the thickness of phone");
        double thickness=scanner.nextDouble();
        System.out.println("Does the phone have an audio jack?(true or false)");
        boolean audio=scanner.nextBoolean();
        scanner.close();

        //new object of class Androidphone using empty constructor as instructed
        AndroidPhone myphone =new AndroidPhone();

        //using setters to input values
        myphone.buildPhone(price, size, thickness, audio, name, brand);

        //printing everything out
        myphone.myAwesomePhone();
    }
}