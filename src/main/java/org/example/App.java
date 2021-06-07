package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int age;
        int drivingAge = 16;
        Scanner input = new Scanner(System.in);
        System.out.println( "What is your age?" );
        age = input.nextInt();
        String outputMessage = age >= drivingAge ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(outputMessage);
    }
}
