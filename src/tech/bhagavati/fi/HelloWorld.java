package tech.bhagavati.fi;

public class HelloWorld implements HelloInterface {
    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();

    }

    @Override
    public void sayHello() {
        System.out.println("Hello using old way");
    }
}
