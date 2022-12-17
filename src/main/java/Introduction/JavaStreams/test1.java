package Introduction.JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class test1 {

    public static void main(String[] args) {

        // Count the number of names starting with letter A in the list

        ArrayList<String> names = new ArrayList<String>();
        names.add("Admir");
        names.add("Hamit");
        names.add("Blerina");
        names.add("Arbnor");
        names.add("Arta");

//        int count = 0;
//
//        for (int i = 0; i < names.size(); i++){
//
//            String allNames = names.get(i);
//
//            if (allNames.startsWith("A")){
//                count++;
//            }
//        }
//
//        System.out.println(count);

        Long abc = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(abc);

       System.out.println(Stream.of("Besim","Bleona", "Rrusta", "Blenda", "Bleroni").filter(s -> s.startsWith("B")).count());

        //print all names of the ArrayList
        names.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s));


    }
}
