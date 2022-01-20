package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // HW 4
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNextInt()){
                int n = scanner.nextInt();
                if(list.contains(n))
                    list.remove(list.indexOf(n));
                list.add(0, n);
            }
        }
	    catch (Exception e){
        System.out.println("got exception " + e);
        }
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        // HW 5
        Integer[] array = {3, 6, 21, 6};
        List<Integer> testList = new List<Integer>(array);
        testList.removeFirst();
        testList.removeLast();
        testList.add(1, 5);
        testList.add(2, 2);
        testList.remove(0);
        testList.add(4, 6);
        testList.addLast(3);
        testList.addFirst(6);

        System.out.println(testList.toString());

        // HW 6
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(6, 7, 8, 9, 10));
        LinkedList<LinkedList<Integer>> combinedList = new LinkedList<>(Arrays.asList(list1, list2));
        LinkedList<Integer> newList = flatten(combinedList);
        for (int i:newList)
            System.out.println(i);



    }
    public static LinkedList<Integer> flatten (LinkedList<LinkedList<Integer>> list){
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++)
                newList.add(list.get(i).get(j));
        }
        return newList;
    }
}