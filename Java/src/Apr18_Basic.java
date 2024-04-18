public class Apr18_Basic {
    public static void main(String[] args) {
//        System.out.println("Hello Java");

//        variables: biến
        String name = "Ivy";

        // data-type variable-name = value;

        System.out.println("hello " + name);

        name = "Brian"; // re-assign

        System.out.println("hello " + name);

        // comment: for human to take notes

        // System.out.println("hehe");

//        turn off, comment out

        /*
        *
        * multiple line comment
        *
        * */

//        Data types: kieu du lieu
//        numbers: int, float, double, long, short
//        String: chữ
//        characters: char
//        boolean: true/false

//        String: tap hop cua chars, chuỗi kí tự
//        "Ivy"
//        "Brian"

//        wrapped around a double quotes

        String favoriteDrink = "ca phe sua da";

//        char: single quote
        char firstCharacterInTheAlphabet = 'a';

        System.out.println(firstCharacterInTheAlphabet);

//        numbers
//        integer: whole numbers
        int a = 3;
        int b = 5;

        System.out.println(a + b);

        double PI = 3.14159263;
        System.out.println(PI);

//        limits of integers are from -2.1 -> 2.1B


        int exs;

//        int worldPopulation = 8_100_000_000; // overflow
        long worldPopulation = 8_100_000_000L;

        System.out.println("World population: " + worldPopulation);


        float pi = 3.14f;
        System.out.println(pi);

        boolean isHot = false;

        if (isHot) {
            System.out.println("Turn on the AC");
        } else {
            System.out.println("Turn on the fan");
        }


//        String char float int boolean dates?

        int dates;

//        salary -> float/double

//        String favoriteDrink = "ice matcha";





    }
}
