package com.yhtomiTwehttaM;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {
    private static final java.util.Queue<Person> queueN = new ArrayDeque<>();
    private static final java.util.Queue<Person> queueP = new ArrayDeque<>();
    private int altCount;

    public void enqueue(Person person) {
        if (person.isPriority()) {
            queueP.add(person);
        } else queueN.add(person);
    }

    public Person dequeue() {
        if (queueN.isEmpty() && queueP.isEmpty()) {
            System.out.println("There is no items in the queue!");
            return null;
        }
        if (altCount % 2 == 0) {
            if (queueN.isEmpty()) {
                altCount++;
                return dequeueP();
            }
            altCount++;
            return dequeueN();
        }
        if (queueP.isEmpty()) {
            altCount++;
            return dequeueN();
        }
        altCount++;
        return dequeueP();
    }

    private static Person dequeueP() {
        return queueP.poll();
    }

    private static Person dequeueN() {
        return queueN.poll();
    }
}