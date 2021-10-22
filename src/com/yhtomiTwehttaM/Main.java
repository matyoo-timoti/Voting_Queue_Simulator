package com.yhtomiTwehttaM;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int count = 0;
    static Animations anim = new Animations();

    public static void main(String[] args) {
//        var q = new Queues();
//        ArrayList<Person> personList = new ArrayList<>();
//        char ans = ' ';
//        while (!(ans == 'n')) {
//            personList.add(addPerson(count));
//            System.out.print("Want to add more? y/n: ");
//            ans = input.next().charAt(0);
//            input.nextLine();
//            count++;
//        }
//
//        for (Person person : personList) {
//            q.enqueue(person);
//        }
//        personList.clear();
//        if (q.dequeue() == null) {
//            System.out.println("There is nothing to see!");
//        }
//        displayQueue(q.dequeue());
        anim.anim1(1, "as", 1);
    }

    private static Person addPerson(int count) {
        boolean isPriority = false;
        System.out.println();
        System.out.println("Insert new individual");
        System.out.println("No. " + count);
        System.out.print("First name: ");
        String firstname = input.nextLine();
        System.out.print("Last name: ");
        String lastname = input.nextLine();
        System.out.print("Priority? y/n: ");
        if (!(input.next().charAt(0) == 'n'))
            isPriority = true;
        System.out.println();
        System.out.println("────────────────────────────────────────────");
        return new Person(firstname, lastname, isPriority, count);
    }

    private static void displayQueue(Person current) {
        System.out.printf("""
                        ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                          %sNext in line:%s
                          No. %s: %s %s %s
                        ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                        """,
                Color.GREEN_BOLD, Color.RESET,
                current.getNumber(), current.getFirstname(), current.getLastname(), ((current.isPriority()) ? "[Priority]" : ""));
        System.out.println();
    }

    private static void menu() {
        System.out.printf("""
                        ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                        ┃  %sNext [N]%s │  %sNext (Priority lane) [P]%s │  %sAdd New Entry [A]%s │ %sExit [X]%s   ┃
                        ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                         Answer: 
                        """,
                Color.GREEN_BOLD, Color.RESET,
                Color.BLUE_BOLD, Color.RESET,
                Color.YELLOW_BOLD, Color.RESET,
                Color.RED_BOLD_BRIGHT, Color.RESET);
    }
}