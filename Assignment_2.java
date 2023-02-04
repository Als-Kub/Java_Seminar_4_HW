/*
Задание 2:
Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import javax.print.attribute.IntegerSyntax;

public class Assignment_2 {

    public static void main(String[] args) {

        int number = 10;
        int element = 555;
        // Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> inputQueue = createQueue(number);
        System.out.println("Initial queue " + inputQueue);
        System.out.println("Element - " + element +" was added to the end of the queue " + enqueue(inputQueue, element));
        int firstElDequeue = dequeue(inputQueue);
        System.out.println("First element - " + firstElDequeue + " " + "in the queue was deleted " + inputQueue);
        int firstElFirst = first(inputQueue);
        System.out.println(firstElFirst + " is the first element in this queue " + inputQueue);

        // System.out.println("Revert list " + listRevert(inputList));
    }

    static Queue<Integer> createQueue(int num) {
        Queue<Integer> inputQueue = new LinkedList<Integer>();

        for (int i = 1; i < num + 1; i++) {
            inputQueue.add(i);
        }
        return inputQueue;
    }

    static Queue<Integer> enqueue(Queue<Integer> inputQueue, int el) {
        Queue<Integer> endQueue = inputQueue;
        inputQueue.add(el);

        return endQueue;
    }

    static Integer dequeue(Queue<Integer> inputQueue) {
        int el = inputQueue.poll();
        return el;
    }

    static Integer first(Queue<Integer> inputQueue) {
        int el = inputQueue.peek();
        return el;
    }
}
