import java.util.Scanner;

public class May23_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // conditionals: cau dieu kien - branching
        // if (boolean)

        // int housePrice = 1_300_000;
        // int asset = 1_300_000;

        // if (asset > housePrice) {
        //     System.out.println("Enough to buy the house");
        // } else if (asset == housePrice) {
        //     System.out.println("Just enough to buy");
        // } else {
        //     System.out.println("Not enough to buy");
        // }


        // Login app
        // String username = "ivy";
        // String password = "bepxinhdep";


        // System.out.print("Enter your username: ");
        // String inputUsername = sc.nextLine();
        // System.out.print("Enter your password: ");
        // String inputPassword = sc.nextLine();

        // // username AND password must be true
        // // String == .equals

        // if (inputUsername.equals(username) && inputPassword.equals(password)) {
        //     System.out.println("Login successfully!!");
        // } else {
        //     System.out.println("Login failed :(");
        // }


        // Chain multiple branches
        System.out.print("How old are you: ");
        int age = sc.nextInt();
                
        // 18+:     Adult
        // 12-17:   Teenager
        // 8-11:    Children
        // <8:      Baby

        if (age >= 18 && age < 120) {
            System.out.println("Adult");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 8 && age <= 11) {
            System.out.println("Children");
        } else if (age > 0 && age < 8) {
            System.out.println("Baby");
        } else {
            System.out.println("Invalid age");
        }




    }
}
