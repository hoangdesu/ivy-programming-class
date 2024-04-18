import java.util.Scanner;

public class Hello {
//    psvm
    public static void main(String[] args) {
//        System.out.println("Hello world");

//        sout + tab (autocomplete)
//        System.out.println();

//            1. input name
//            2. hello + name
//            3. output

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        System.out.println("piano");
    }
}
