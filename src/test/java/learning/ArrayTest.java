package learning;

public class ArrayTest {

    public static void main(String[] args) {

        //Array- Store multiple values in a single variable

        String[] cars = {"Ford", "MBW", "Tesla", "Yugo"};
        {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(cars[2]);
            System.out.println(numbers[0]);

            System.out.println(cars);

            cars[0] = "Mustang";
            numbers[2] = 7;
            System.out.println(cars[0]);
            System.out.println(numbers[2]);

            String[] states = new String[5];
            states[0] = " New York";
            states[1] = "Florida";
            states[2] = "Texas";
            states[3] = "Aljaska";
            states[4] = "Aljaska2";

            System.out.println(states[0]);
            System.out.println(states[1]);
            System.out.println(states[2]);
            System.out.println(states[3]);


            for (String myCars : cars) {
                System.out.println(myCars);

                for (int myNumber : numbers) {
                    System.out.println(myNumber);



                }


            }
        }
    }
}
