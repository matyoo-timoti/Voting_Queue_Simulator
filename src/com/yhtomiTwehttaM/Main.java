package com.yhtomiTwehttaM;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Queues queue = new Queues();


    public static void main(String[] args) {
        int count = 0;
        Misc.maximizeConsole();
        Misc.titleAnim(90);
        System.out.println();
        System.out.printf("%sVOTING QUEUE SIMULATOR%s\n", Color.CYAN_BOLD_BRIGHT, Color.RESET);
        System.out.print(Color.MAGENTA_BOLD_BRIGHT);
        Misc.scrollingTextLn("By Group 6 | BSIT-2C | 2021", 70);
        System.out.print(Color.RESET);
        String ans = "";
        bigLoop:
        while (true) {
            while (!ans.equals("n")) {
                queue.enqueue(addPerson(count++));
                System.out.println();
                System.out.print("Add another entry? y/n: ");
                ans = input.next();
                input.nextLine();
                System.out.println();
            }
            Misc.clearConsole();
            Misc.wait(500);
            ans = "";
            queue.altSort(queue.getQueue());
            while (!ans.equals("a")) {
                if (queue.getQueue().isEmpty()) {
                    System.out.println();
                    System.out.println("There is no queue!");
                    System.out.println("Do you want to add a new Entry? y/n: ");
                    ans = input.next();
                    input.nextLine();
                    if (!(ans.equals("n"))) {
                        break;
                    }
                    break bigLoop;
                }
//                System.out.printf("%sVOTING QUEUE SIMULATOR%s\n", Color.CYAN_BOLD_BRIGHT, Color.RESET);
                System.out.print(Color.CYAN);
                System.out.println("""
                                                
                        █ █ █▀█ ▀█▀ █ █▄ █ █▀▀  █▀█ █ █ █▀▀ █ █ █▀▀   █▀ █ █▀▄▀█ █ █ █   ▄▀█ ▀█▀ █▀█ █▀█
                        ▀▄▀ █▄█  █  █ █ ▀█ █▄█  ▀▀█ █▄█ ██▄ █▄█ ██▄   ▄█ █ █ ▀ █ █▄█ █▄▄ █▀█  █  █▄█ █▀▄
                        """);
                System.out.print(Color.RESET);
                Person curr = queue.dequeue();
                Person next = null;
                if (!queue.getQueue().isEmpty()) {
                    next = queue.getQueue().peek();
                }
                displayQueue(curr, next);
                Misc.anim1(1);
                menu(next);
                ans = input.next();
                input.nextLine();
                if (ans.equals("x"))
                    break bigLoop;
                Misc.clearConsole();
                Misc.wait(500);
            }
        }
        System.out.println();
        Misc.pig("Please come again! Oink!");
        System.out.println("\nSuccessfully exited the program.");
        System.exit(0);
    }

    private static Person addPerson(int count) {
        boolean isPriority = false;
        System.out.println();
        System.out.println("Insert new individual:");
        System.out.println("No. " + count);
        System.out.print("First name: ");
        String firstname = input.nextLine();
        System.out.print("Last name: ");
        String lastname = input.nextLine();
        System.out.print("Priority? y/n: ");
        String ans = input.next();
        input.nextLine();
        if (!(ans.charAt(0) == 'n'))
            isPriority = true;
        System.out.println();
        return new Person(firstname, lastname, isPriority, count);
    }

    private static void displayQueue(Person current, Person next) {
        String cP = (current.isPriority()) ? "[Priority]" : "";
        if (next == null) {
            System.out.printf("""
                                                    
                            ⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺
                              %sFirst in line:%s
                              No. %s: %s %s %s%s%s
                              
                              %sNext in Line:%s
                              None
                            ⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺
                                                    
                            """,
                    Color.GREEN_BOLD, Color.RESET,
                    current.getNumber(), current.getFirstname(), current.getLastname(),
                    Color.BLUE_BRIGHT, cP, Color.RESET,
                    Color.GREEN_BOLD, Color.RESET
                    );
        }
        else {
            String nP = (next.isPriority()) ? "[Priority]" : "";
            System.out.printf("""
                                                
                        ⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺
                          %sFirst in line:%s
                          No. %s: %s %s %s%s%s
                          
                          %sNext in Line:%s
                          No. %s: %s %s %s%s%s
                        ⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺
                                                
                        """,
                    Color.GREEN_BOLD, Color.RESET,
                    current.getNumber(), current.getFirstname(), current.getLastname(),
                    Color.BLUE_BRIGHT, cP, Color.RESET,
                    Color.GREEN_BOLD, Color.RESET,
                    next.getNumber(), next.getFirstname(), next.getLastname(),
                    Color.BLUE_BRIGHT, nP, Color.RESET
            );
        }
        System.out.println();
    }

    private static void menu(Person next) {
        System.out.println();
        if (next != null) {
            System.out.printf("""
                            ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                            ┃  %sNext [N]%s │  %sAdd New Entry [A]%s │ %sExit [X]%s ┃
                            ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                            """,
                    Color.GREEN_BOLD, Color.RESET,
                    Color.YELLOW_BOLD, Color.RESET,
                    Color.RED_BOLD_BRIGHT, Color.RESET);
        } else {
            System.out.printf("""
                            ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                            ┃  %sAdd New Entry [A]%s │ %sExit [X]%s ┃
                            ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                            """,
                    Color.YELLOW_BOLD, Color.RESET,
                    Color.RED_BOLD_BRIGHT, Color.RESET);
        }
        System.out.print(" Choose from the options: ");
    }
}