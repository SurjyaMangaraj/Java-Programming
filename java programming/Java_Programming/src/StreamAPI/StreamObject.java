package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        //Stream API - collection process
        //collection / group of object

        //1-blank
        Stream<Object> emptyStream = Stream.empty();

        //2-array, object, collection
        String names[]={"surjya","anil","rahul","dilu"};

        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

        //3
        Stream<Object> streamBuilder=Stream.builder().build();

        //4
        IntStream stream= Arrays.stream(new int[]{2,3,4,6,435});
        stream.forEach(e->{
            System.out.println(e);
        });

        //5. list,set

        List<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(97);

        Stream<Integer> stream2=list2.stream();
        stream2.forEach(e->{
            System.out.println(e);
        });
    }
}
