import java.util.*;
import java.util.Scanner;

public class Squareofside{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the side of square:");
        int side= sc.nextInt();

        int area= side*side;

        System.out.println(area);

    }
    
}
