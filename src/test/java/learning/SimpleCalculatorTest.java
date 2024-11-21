package learning;

import java.util.Scanner;

public class SimpleCalculatorTest {
    public static void main(String[] args) {


        Scanner calculator = new Scanner(System.in);
        double firsNUm,secondNum,sum;
        System.out.println("Enter firs Number");
        firsNUm=calculator.nextDouble();
        System.out.println("Enter seconf Number");
        secondNum = calculator.nextDouble();
        sum = firsNUm / secondNum;
        System.out.println(sum);



    }



}

