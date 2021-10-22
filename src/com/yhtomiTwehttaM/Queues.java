package com.yhtomiTwehttaM;

import java.util.ArrayDeque;

public class Queues {
    private static final java.util.Queue<Person> normalQueue = new ArrayDeque<>();
    private static final java.util.Queue<Person> priorityQueue = new ArrayDeque<>();
    private int altCount;

    public void enqueue(Person person) {
        if (person.isPriority()) {
            priorityQueue.add(person);
        } else normalQueue.add(person);
    }

    public Person dequeue() {
        if (normalQueue.isEmpty() && priorityQueue.isEmpty()) {
            System.out.println("There is no items in the queue!");
            return null;
        }
        if (altCount % 2 == 0) {
            if (normalQueue.isEmpty()) {
                altCount++;
                return dequeueP();
            }
            altCount++;
            return dequeueN();
        }
        if (priorityQueue.isEmpty()) {
            altCount++;
            return dequeueN();
        }
        altCount++;
        return dequeueP();
    }

    private static Person dequeueP() {
        return priorityQueue.poll();
    }

    private static Person dequeueN() {
        return normalQueue.poll();
    }
}