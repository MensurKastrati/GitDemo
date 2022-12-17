package Introduction.JavaStreams;

import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {

        // print the names which end with 'a'
        Stream.of("Besim","Ena", "Rrusta", "Balena", "Bleroni", "Is", "Gezimi")
                .filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));


        System.out.println("------------------------------");


        // print the names which start with 'B' and sort from A-Z and with uppercase
        Stream.of("Besim","Ena", "Rrusta", "Balena", "Bleroni", "Is", "Gezimi")
                .filter(s -> s.startsWith("B"))
                .sorted()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));


        System.out.println("------------------------------");





    }
}
