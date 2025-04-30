package application;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        method2();

        System.out.println("End of program");
    }

    public static void method2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("****Method 2 start****");
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println("Imput error");
        }
    }
}