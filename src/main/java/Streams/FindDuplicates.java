//How to find duplicate elements in the stream
// to find first element in stream
//find last element in stream
package Streams;

import java.util.*;
import java.util.stream.*;


public class FindDuplicates {

    public static void main(String []args){
        //Stream<Integer> stream=Stream.of(2,3,4,6,7,4);

        Stream<Integer> stream
                = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        Stream<Integer> stream1
                = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        Stream<Integer> stream2
                = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

        Stream<Integer> stream3
                = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

        System.out.println(findDuplicatesInStream(stream));
        System.out.println(findFirstElementInStream(stream1));
        System.out.println(sortedStream(stream2));
        System.out.println(lastElement(stream3));
    }

    public static List<Integer> findDuplicatesInStream(Stream<Integer>    stream){

        Set<Integer> items=new HashSet<Integer>();

        return stream.filter(n -> !items.add(n)).collect(Collectors.toList());
    }

    public static Integer findFirstElementInStream(Stream<Integer> stream){

        return stream.findFirst().orElse(null);

    }

    public static List<Integer> sortedStream(Stream<Integer> stream){

        return stream.sorted().collect(Collectors.toList());

    }

    public static Integer lastElement(Stream<Integer> stream){
        return stream.reduce((first,second)-> second).orElse(null);
    }
}
