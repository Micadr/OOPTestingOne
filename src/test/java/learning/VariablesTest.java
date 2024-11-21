package learning;

import java.sql.SQLOutput;

public class VariablesTest {

    public static void main(String[] args) {

        String name= "Bob";
        String lastName= "Leo";
        System.out.println("Hi " + (name + " " + lastName));

        int myFirstNumber = 5;
        int mySecondNumber= 3;
        System.out.println("The sum is:" +
        (myFirstNumber + mySecondNumber));

        System.out.println("The result of Multiplication is:"+(myFirstNumber * mySecondNumber));

        System.out.println("The result of Division" + (myFirstNumber / mySecondNumber));

        System.out.println("The result of Division" + (myFirstNumber - mySecondNumber));

        System.out.println(" New The result of Division" + ((double)myFirstNumber / (double)mySecondNumber));

        double cakePrice;
        cakePrice=2.58;
        System.out.println("The price od the cake is: " + cakePrice + "€");


    }
}

