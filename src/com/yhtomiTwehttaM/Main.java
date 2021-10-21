package com.yhtomiTwehttaM;

public class Main {
    static Animations anim = new Animations();
    public static void main(String[] args) {
        var person = new Person("matt", "cab", true, 0);
        var person1 = new Person("kat", "cab", true, 1);
        anim.queue(10, "NAME", 1 );
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
//                Color.WHITE_BOLD_BRIGHT, Color.RESET,
                Color.GREEN_BOLD, Color.RESET,
                Color.BLUE_BOLD, Color.RESET,
                Color.YELLOW_BOLD, Color.RESET,
                Color.RED_BOLD_BRIGHT, Color.RESET);
    }
}