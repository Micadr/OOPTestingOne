package learning;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(7);
        System.out.println(myNumbers.get(0));

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        for (String myCars : cars) {
            System.out.println(myCars);

            System.out.println(cars.get(0));


            cars.set(0,"Opel");
            System.out.println(cars.get(0));


            cars.remove(0);
            System.out.println(cars.get(0));
        }
    }
}
