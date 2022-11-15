package tech.bhagavati.fi;


public class HelloWorldUsingJava8 {

    public static void main(String[] args) {
        HelloInterface helloInterface = () -> System.out.println("Hello World");
        helloInterface.sayHello();
    }
}
