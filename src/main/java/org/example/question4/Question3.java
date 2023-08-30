package org.example.question4;

import java.util.List;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "MySql", "Veten");
        List<String> result = list.stream()
                .sorted((a,b) ->Integer.compare(a.length(), b.length())).collect(Collectors.toList());
        System.out.println("Netice" + result);
    }
}
