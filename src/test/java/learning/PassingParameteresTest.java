package learning;

public class PassingParameteresTest {


    public static void main(String[] args) {
        sayHello("Milica");
        add(4, 6);

        int sum = add(5,6);
        System.out.println(sum);

        int result=sum*5;
        System.out.println(result);

        System.out.println(add(5,5));

    }




    public static void sayHello(String name) {
        System.out.println("Hello " + name);

    }

    public static int add(int a, int b) {

        return(a+b);

}

}



