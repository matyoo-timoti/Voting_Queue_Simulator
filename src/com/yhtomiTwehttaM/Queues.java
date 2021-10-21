package com.yhtomiTwehttaM;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Queues {
    private static final java.util.Queue<Person> normalQueue = new ArrayDeque<>();
    private static final java.util.Queue<Person> priorityQueue = new ArrayDeque<>();

    private static void enqueue(Person person) {
        normalQueue.add(person);
    }

    private static void enqueuePriority(Person person){
        priorityQueue.add(person);
    }

    public Person deque() {
        if (normalQueue.isEmpty()) {
            System.out.println("There is no queue!");
            return null;
        }
        return normalQueue.remove();
    }

    public Person dequePriority() {
        if (priorityQueue.isEmpty()) {
            System.out.println("There is no queue!");
            return null;
        }
        return priorityQueue.remove();
    }

    public void segregate(ArrayList<Person> personsList) {
        for (Person person : personsList) {
            if (person.isPriority())
                enqueue(person);
            else enqueuePriority(person);
        }
    }

    public Queue<Person> intoOneLine() {
        java.util.Queue<Person> newQ = new ArrayDeque<>();
        while(!(priorityQueue.isEmpty()) || !(normalQueue.isEmpty()))
        {
            if (normalQueue.isEmpty())
                newQ.add(normalQueue.poll());
            if (priorityQueue.isEmpty())
                newQ.add(priorityQueue.poll());
        }
        return newQ;
    }
}