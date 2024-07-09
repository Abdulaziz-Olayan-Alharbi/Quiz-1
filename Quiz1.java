import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

       // 1.Write a Java program that accept three numbers from the user and print the largest number .
        System.out.println("Enter first number: ");
        int num_1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num_2 = scan.nextInt();
        System.out.println("Enter third number: ");
        int num_3 = scan.nextInt();
        int largest = num_1 ;
        if (num_3 > num_2){
            if (num_3 > num_1){
                largest = num_3;
            }
        }else {
            if (num_2 > num_1){
                largest = num_2;
            }
        }
        System.out.println("The largest number is " + largest);
        System.out.println("********************************************");


        //Write a Java program that accept a String and a number from the user,then print the character in the given index
        System.out.println("Enter a word : ");
        String word = scan.next();
        System.out.println("Enter an index : ");
        int index = scan.nextInt();
        System.out.println("The character in the given index is : "+word.charAt(index));
        System.out.println("********************************************");

        //Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
        String check = "y" ;
        int num_4 = 0;
        int sum = 0;
        do {
            System.out.println("Enter a number : ");
            num_4 = scan.nextInt();
            sum += num_4;
            System.out.println("do you want to continue? (y/n) :  ");
            check = scan.next();
        }while (check.equals("y"));
        System.out.println("The sum is : "+sum);
        System.out.println("********************************************");


        //Write a Java program to find positive and negative numbers of a given array:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-21);
        numbers.add(30);
        numbers.add(31);
        numbers.add(-25);
        for (Integer n : numbers){
            if ( n > 0 ){
                System.out.println(n + " is a positive number");
            }else {
                System.out.println(n + " is a negative number");
            }
        }
        System.out.println("********************************************");

        //Write a Java program to find a shortest word of a given array:
        ArrayList<String> words = new ArrayList<>();
        words.add("Tuwaiq");
        words.add("Bootcamp");
        words.add("Student");
        words.add("JAVA");
        String shortest = words.get(0) ;
        for (String w : words){
            if (w.length() < shortest.length()){
                shortest = w ;
            }
        }
        System.out.println("The shortest word is : "+shortest);
        System.out.println("********************************************");


    }

}
