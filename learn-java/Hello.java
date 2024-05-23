import java.util.Scanner;

// class name must be the same as file name.java
public class Hello {
    public static void main(String[] args) {
        // System.out.println("Hello Java");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        String name = sc.nextLine(); // get a string input

        System.out.println("Wassup " + name);

        System.out.print("When were you born: ");

        int birthYear = sc.nextInt(); // get an integer input

        int age = 2024 - birthYear; // process user input

        System.out.println("Oh so you are " + age + " years old");

    }
    
}