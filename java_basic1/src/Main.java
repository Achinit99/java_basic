/* import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter your first number");
        number1 = input.nextDouble();

        System.out.println("Enter your second number");
        number2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
} */

// Message box -----------------------
/* import javax.swing.JOptionPane;
public class Main {

    public static void main(String args[])
    {
        String name = JOptionPane.showInputDialog("Hi! What is your name ? ");
        JOptionPane.showMessageDialog(null , "I love you "+name+" !");
    }
} */

//------------------------------------------
/*import java.util.Scanner;

public  class Main {
    public static void main(String args[])
    {
        Scanner sun = new Scanner(System.in);

        System.out.println(sun.nextLine()); //(sun.next())
    }
} */

// ---------------------------------------
/*public class Main {
    public static void main(String args[])
    {
        int num1, num2, answer;

        num1 = 11;
        num2 = 10;

        answer = num1 + num2;

        System.out.println(answer);
    }
} */

// simple calculator --------------------------
/*import java.util.Scanner;
public class Main {

    public static void main(String args[])
    {
        // ** Create scanner variable **
        Scanner sun = new Scanner(System.in);

        // ** Create variable **
        double no1, no2, ans;

        // ** Message user -> 01 **
        System.out.println("Enter your first number :");
        no1 = sun.nextDouble();

        // ** Message user -> 02 **
        System.out.println("Enter your second number :");
        no2 = sun.nextDouble();

        ans = no1 + no2;

        System.out.println("Your answer is :"+ ans);

    }
} */

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


       /*  // ---- how to find most frequent number in array java ------

        //Declare and initialize the array elements
        int[] arr = { 1, 2, 3, 1, 5, 7, 5, 5, 9 };

        //get the length of the array
        int n = arr.length;
        int max_count = 0;
        int maxfreq = 0;

        //Logic implementation
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }

            if (count > max_count){
                max_count = count;
                maxfreq = arr[i];
            }
        }
        //print the result
        System.out.print("Most frequent element is: " + maxfreq); */


        /* // ---- nested if statements ----
        int age = 14;

        if (age > 18){
            System.out.println("You can log");
        } else {
            System.out.println("You can't log 18+ web");
            if (age > 14){
                System.out.println("But you can log 14+ web");
            } else {
                System.out.println("Sorry !!");
            }
        } */


       /* // ---- switch statements ---
        int age = 8;

        switch (age) {
            case 15:
                System.out.println("Your age is 15");
                break;
            case 16:
                System.out.println("Your age is 16");
                break;
            case 17:
                System.out.println("Your age is 17");
                break;
            case 18:
                System.out.println("Your age is 18");
                break;
            default:
                System.out.println("I don't Know");
        } */

        int count = 0;

        while (){
            
        }




    }
}