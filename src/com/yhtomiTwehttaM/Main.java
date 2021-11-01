package com.yhtomiTwehttaM;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Queues queue = new Queues();
    static String title = """
                                    
             ██░   ██░   ████░  ████████░ ██░ ███░  ██░  ██████░      ██████░    ██░   ██░ ███████░ ██░   ██░ ██████░
             ██░   ██░ ██░   ██░   ██░    ██░ ████░ ██░ ██░         ██░     ██░  ██░   ██░ ██░      ██░   ██░ ██░
              ██░ ██░  ██░   ██░   ██░    ██░ ██░██░██░ ██   ███░   ██░ ██░ ██░  ██░   ██░ █████░   ██░   ██░ █████░
               ████░   ██░   ██░   ██░    ██░ ██░ ████░ ██░   ██░     ██████░    ██░   ██░ ██░      ██░   ██░ ██░
                ██░      ████░     ██░    ██░ ██░  ███░  ██████░        ██░       ██████░  ███████░  ██████░  ██████░
                                                                                                         
                                                                                                         
              ██████░ ██░ ███░   ███░ ██░   ██░ ██░       █████░  ████████░  █████░   ██████░
             ██░      ██░ ████░ ████░ ██░   ██░ ██░      ██░  ██░    ██░    ██░   ██░ ██░  ██░
              █████░  ██░ ██░████░██░ ██░   ██░ ██░      ███████░    ██░    ██░   ██░ ██████░
                  ██░ ██░ ██░ ██░ ██░ ██░   ██░ ██░      ██░  ██░    ██░    ██░   ██░ ██░  ██░
             ██████░  ██░ ██░     ██░  ██████░  ███████░ ██░  ██░    ██░     ██████░  ██░  ██░
                                    
             ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶
            """;

    public static void main(String[] args) {
        int count = 0;
//        Misc.maximizeConsole();
        System.out.println();
        Misc.titleAnim1(100);
        System.out.println();
        System.out.printf("%s VOTING QUEUE SIMULATOR%s\n", Color.CYAN_BOLD_BRIGHT, Color.RESET);
        System.out.print(Color.MAGENTA_BOLD_BRIGHT);
        System.out.print(" ");
        Misc.scrollingTextLn(" By Group 6 | BSIT-2C | 2021", 50);
        System.out.print(Color.RESET);
        String ans;
        String yn;
        outerLoop:
        do {
            while (true) {
                queue.enqueue(addPerson(count++));
                System.out.println();
                System.out.print(" Add another entry? y/n: ");
                yn = yesOrNo(input.nextLine().toLowerCase().charAt(0));
                if (yn.equals("n")) {
                    break;
                }
                System.out.println();
            }
            Misc.clearConsole();
            Misc.wait(500);
            queue.altSort(queue.getQueue());
            do {
                if (queue.getQueue().isEmpty()) {
                    System.out.println();
                    System.out.println(" There is no queue!");
                    System.out.println(" Do you want to add a new Entry? y/n: ");
                    yn = yesOrNo(input.nextLine().toLowerCase().charAt(0));
                    if (yn.equals("y")) {
                        break;
                    }
                    break outerLoop;
                }
                System.out.println(title);
                Person curr = queue.dequeue();
                Person next = null;
                if (!queue.getQueue().isEmpty()) {
                    next = queue.getQueue().peek();
                }
                displayQueue(curr, next);
                Misc.anim1(1, 230);
                menu(next);
                ans = checkInput(input.next().toLowerCase().charAt(0));
                input.nextLine();
                if (ans.equals("x"))
                    break outerLoop;
                Misc.clearConsole();
                Misc.wait(500);
            } while (!(ans.equals("a")));
        } while (true);
        System.out.println();
        Misc.pig("Please come again! Oink!");
        System.out.println("\n Successfully exited the program.");
        System.exit(0);
    }

    private static Person addPerson(int count) {
        boolean isPriority = false;
        System.out.println();
        System.out.println(" Insert new individual:");
        System.out.println(" No. " + count);
        System.out.print(" First name: ");
        String firstname = input.nextLine().trim().replaceAll(" +", " ");
        System.out.print(" Last name: ");
        String lastname = input.nextLine().trim().replaceAll(" +", " ");
        System.out.print(" Priority? y/n: ");
        String ans = yesOrNo(input.next().toLowerCase().charAt(0));
        input.nextLine();
        if (!(ans.equals("n")))
            isPriority = true;
        System.out.println();
        return new Person(firstname, lastname, isPriority, count);
    }

    private static void displayQueue(Person current, Person next) {
        int CurrNameLength = current.getFirstname().length() + current.getLastname().length();
        String cP = (current.isPriority()) ? "[Priority]" : "";
        String line = line(current);
        if (next == null) {
            System.out.printf("""
                             ⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺%s⁺⁺
                               %sPlease Enter:%s
                               No. %s: %s %s %s%s%s
                              
                               %sNext in Line:%s
                               None
                             ⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺%s⁺⁺
                            """,
                    line,
                    Color.GREEN_BOLD, Color.RESET,
                    current.getNumber(), current.getFirstname(), current.getLastname(),
                    Color.BLUE_BRIGHT, cP, Color.RESET,
                    Color.GREEN_BOLD, Color.RESET,
                    line
            );
        } else {
            int NextNameLength = next.getFirstname().length() + next.getLastname().length();
            if (CurrNameLength < NextNameLength) {
                line = line(next);
            }
            String nP = (next.isPriority()) ? "[Priority]" : "";
            System.out.printf("""
                             ⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺%s⁺⁺
                               %sPlease Enter:%s
                               No. %s: %s %s %s%s%s
                              
                               %sNext in Line:%s
                               No. %s: %s %s %s%s%s
                             ⁺⁺⁺⁺⁺⁺⁺⁺⁺⁺%s⁺⁺
                            """,
                    line,
                    Color.GREEN_BOLD, Color.RESET,
                    current.getNumber(), current.getFirstname(), current.getLastname(),
                    Color.BLUE_BRIGHT, cP, Color.RESET,
                    Color.GREEN_BOLD, Color.RESET,
                    next.getNumber(), next.getFirstname(), next.getLastname(),
                    Color.BLUE_BRIGHT, nP, Color.RESET,
                    line
            );
        }
        System.out.println();
    }

    private static String line(Person name) {
        StringBuilder line = new StringBuilder();
        int currName = name.getFirstname().length() + name.getLastname().length();
        if (name.isPriority()) {
            line.append("⁺".repeat(currName + 12));
        } else {
            line.append("⁺".repeat(currName));
        }
        return String.valueOf(line);
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

    private static String yesOrNo(char ans) {
        while (ans != 'n' && ans != 'y') {
            System.out.print(" Is it a no or a yes? Please make up your mind:");
            ans = input.next().toLowerCase().charAt(0);
        }
        return Character.toString(ans);
    }

    private static String checkInput(char ans) {
        while (ans != 'n' && ans != 'a' && ans != 'x') {
            System.out.printf(" %s is not on the options. Please enter again: ", ans);
            ans = input.next().toLowerCase().charAt(0);
        }
        return Character.toString(ans);
    }
}