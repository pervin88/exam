package org.example.question4;

import java.util.List;
import java.util.stream.Stream;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        list.stream().filter(n->n%2==0 || n%5!=0).forEach(System.out::println);
    }

}
