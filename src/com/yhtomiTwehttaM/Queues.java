package com.yhtomiTwehttaM;

import java.util.*;

public class Queues {

    private final Queue<Person> queue = new ArrayDeque<>();

    public Queue<Person> getQueue() {
        return queue;
    }

    public void enqueue(Person newPerson) {
        queue.add(newPerson);
    }

    public Person dequeue() {
        return queue.poll();
    }

    public void altSort(Queue<Person> list) {
        ArrayList<Person> temp1 = new ArrayList<>();
        ArrayList<Person> temp2 = new ArrayList<>();

//        Segregates the priority and non-priority Persons into two arrays.
        while (!list.isEmpty()) {
            Person p = list.remove();
            if (p.isPriority()) {
                temp1.add(p);
            } else temp2.add(p);
        }

/*
       If both temp queues are not empty, adding the contents of
       both arrays on the final queue by alternation.
*/
        for (int i = 0; i < temp1.size() + temp2.size() + 2; i++) {
            if (!temp1.isEmpty()) {
                list.add(temp1.remove(0));
            }
            if (!temp2.isEmpty()) {
                list.add(temp2.remove(0));
            }
        }
/*
        Checks if there are any remaining item on
        either array and transfers it to the queue.
*/
        if (!temp1.isEmpty() || !temp2.isEmpty()) {
            if ((temp1.get(0) != null)) {
                list.add(temp1.remove(0));
            } else {
                list.add(temp2.remove(0));
            }
        }
    }
}