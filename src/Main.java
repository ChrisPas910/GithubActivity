import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please state your name: ");
        String name = scn.next();


        System.out.println("Hello, " + name + "!");
    }
}