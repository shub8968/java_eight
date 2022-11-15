package tech.bhagavati.stream;

import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.iterate(1, i -> i +1);
        boolean b = stream.anyMatch(i -> i < 5);
        System.out.println(b);
    }
}
