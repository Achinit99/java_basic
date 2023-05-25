//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//
//        char operator;
//        Double number1, number2, result;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("What is your operator: +, -, *, or /");
//        operator = input.next().charAt(0);
//
//        System.out.println("Enter your first number");
//        number1 = input.nextDouble();
//
//        System.out.println("Enter your second number");
//        number2 = input.nextDouble();
//
//        switch (operator) {
//
//            case '+':
//                result = number1 + number2;
//                System.out.println(number1 + " + " + number2 + " = " + result);
//                break;
//
//            case '-':
//                result = number1 - number2;
//                System.out.println(number1 + " - " + number2 + " = " + result);
//                break;
//
//            case '*':
//                result = number1 * number2;
//                System.out.println(number1 + " * " + number2 + " = " + result);
//                break;
//
//            case '/':
//                result = number1 / number2;
//                System.out.println(number1 + " / " + number2 + " = " + result);
//                break;
//
//            default:
//                System.out.println("Invalid operator!");
//                break;
//        }
//
//        input.close();
//    }
//}

// Message box -----------------------
//import javax.swing.JOptionPane;
//public class Main {
//
//    public static void main(String args[])
//    {
//        String name = JOptionPane.showInputDialog("Hi! What is your name ? ");
//        JOptionPane.showMessageDialog(null , "I love you "+name+" !");
//    }
//}

//------------------------------------------
//import java.util.Scanner;
//
//public  class Main {
//    public static void main(String args[])
//    {
//        Scanner sun = new Scanner(System.in);
//
//        System.out.println(sun.nextLine()); //(sun.next())
//    }
//}

// ---------------------------------------
//public class Main {
//    public static void main(String args[])
//    {
//        int num1, num2, answer;
//
//        num1 = 11;
//        num2 = 10;
//
//        answer = num1 + num2;
//
//        System.out.println(answer);
//    }
//}

// simple calculator --------------------------
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String args[])
//    {
//        // ** Create scanner variable **
//        Scanner sun = new Scanner(System.in);
//
//        // ** Create variable **
//        double no1, no2, ans;
//
//        // ** Message user -> 01 **
//        System.out.println("Enter your first number :");
//        no1 = sun.nextDouble();
//
//        // ** Message user -> 02 **
//        System.out.println("Enter your second number :");
//        no2 = sun.nextDouble();
//
//        ans = no1 + no2;
//
//        System.out.println("Your answer is :"+ ans);
//
//    }
//}

import java.sql.SQLOutput;

public class Main {

    public static void main (String[] args) {
         /*
        // first (if/else) condition
        int num = 5;

        if (num == 10)
        {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        } */

        /* int maths = 55;
        int sinhala = 75;

        if(maths > 50 && sinhala > 60)
        {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        } */


        // -- else if statements ------------
       /* int marks = 67;

        if(marks >= 75) {
            System.out.println("Your grade is A");
        } else if (marks >= 65) {
            System.out.println("Your grade is B");
        }else if (marks >= 55) {
            System.out.println("Your grade is C");
        }else if (marks >= 45) {
            System.out.println("Your grade is S");
        } else {
            System.out.println("Your grade is F");
        } */

        // ---- how to find most frequent number in array java ------

        // Declare and initialize the array elements
        int[] arr = { 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 4, 1, 12, 13, 15};
    }
}