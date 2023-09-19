package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {

        // filters -> predicates (boolean values function)
        // e -> e>10


        // map ?(function)
        //

        List<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Raj");
        names.add("Anil");
        names.add("Anki");
        names.add("Ashu");

        List<String> names1 = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(names1);

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        List<Integer> list1= list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(list1);

        names.stream().forEach(e->
                {
                    System.out.println(e);
                }
                );

        // sorted

        list.stream().sorted().forEach(System.out::println);

        // min or max

        Integer integer =list.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println( "Min" +integer);
    }
}
