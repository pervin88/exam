package org.example;

import org.w3c.dom.stylesheets.LinkStyle;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Stream;

public class Main implements Runnable {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(n->n%2==0 || n%5!=0).forEach(System.out::println);
    }

    @Override
    public void run() {

    }

}