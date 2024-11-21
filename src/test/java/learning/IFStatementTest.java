package learning;

public class IFStatementTest {

    public static void main(String[] args) {


        myNumber();
        myAge();
         myTime();
    }

    static void myNumber() {

        int num = 10;
        if (num < 100) {

            System.out.println("My Number is" + "less than 100!");

        }
    }

    static void myAge() {
        int myAge = 10;
        if (myAge > 18) {
            System.out.println("My Number is greater than 18");
        } else {

            System.out.println("My Number is not greater than 18");

        }

    }

    static void myTime() {
        int time=7;

        if(time<18) {
            System.out.println("Good morning.");
        } else if(time<20) {
                System.out.println("Good day.");
            } else {
        System.out.println("Good evening.");
            }
        }

    }