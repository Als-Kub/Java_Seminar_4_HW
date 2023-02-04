/*
Задание 1.
​
Создать LinkedList целых чисел (заполнить случайными числами).
Реализуйте метод, который вернет “перевернутый” список.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import javax.print.attribute.IntegerSyntax;

public class Assignment_1 {

    public static void main(String[] args) {

        int number = 10;
        LinkedList<Integer> inputList = randomList(number);
        System.out.println("Initial random list" + inputList);

        System.out.println("Reverse list " + listReverse(inputList));
    }

    static LinkedList<Integer> randomList(int num) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random random = new Random();
        for (Integer i = 0; i < num; i++) {
            list.add(random.nextInt(10, 50));

        }
        return list;
    }

    static LinkedList<Integer> listReverse(LinkedList<Integer> list) {
        LinkedList listRev = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {

            listRev.add(list.getLast());
            list.removeLast();

        }
        return listRev;
    }
}