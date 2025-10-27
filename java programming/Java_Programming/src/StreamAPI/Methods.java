package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        //filter(Predicate)
        //boolean value function
        List<String> names=List.of("Aman","Anil","Ankita","Aarosi","Rahul");
        List<String> newNames= names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);


        //map(function)
        // each element operation
        List<Integer> numbers=List.of(2,4,5,7,8);
        List<Integer> newNumbers=numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newNumbers);


    }
}
