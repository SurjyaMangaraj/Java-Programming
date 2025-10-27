package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String args[]){

        // create a list and filter all even number from list

        List<Integer> list1=List.of(2,3,4,5,6,7,8,9);

        List<Integer> list2=new ArrayList<>();
        list2.add(11);
        list2.add(13);
        list2.add(96);
        list2.add(17);

        List<Integer> list3= Arrays.asList(23,567,12,677,24);

        //list1
        //without stream
        List<Integer> listEven=new ArrayList<>();
        for(Integer i : list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        //using stream API
        Stream<Integer> stream= list1.stream();
        List<Integer> newList= stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        // Stream API in single line
        List<Integer> newListStream= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newListStream);

        //find greater than 5 using stream api
        List<Integer> grater=list1.stream().filter(i->i>5).collect(Collectors.toList());
        System.out.println("Greater than 5 in list1"+grater);
    }
}
