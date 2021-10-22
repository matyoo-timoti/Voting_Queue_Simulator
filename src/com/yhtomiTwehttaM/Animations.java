package com.yhtomiTwehttaM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Animations {

    public void queue(int repeat, String name, int num) {
        var rb = Color.RED_BRIGHT;
        var bv = Color.BLUE_BRIGHT;
        var gb = Color.GREEN_BRIGHT;
        var wbb = Color.WHITE_BOLD_BRIGHT;
        var gbb = Color.GREEN_BOLD_BRIGHT;
        var yb = Color.YELLOW_BRIGHT;
        var bckgrnd = Color.WHITE_BACKGROUND;
        var res =Color.RESET;
        System.out.printf("""
                   %sVoting Station%s
                 ▕%s▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔%s▏
                 ▕%s └ └ └ └ └ └ └  %s▏
                 ▕%s └ └ └ └ └ └ └  %s▏%s[ %s %s ]%s
                 ▕%s  ▁▁▁  └ └ └ └  %s▏
                 ▕%s▁▁%s▏╍▕%s▁▁▁▁▁▁▁▁▁▁▁%s▏
                """,
                gbb, res, //Bldg. name
                bckgrnd, res, //Top (5th Level)
                bckgrnd, res, // Above mid (4th)
                bckgrnd, res, // Mid (3rd)
                wbb, num, name, res, // Number and Name
                bckgrnd, res, // Below mid (2nd)
                bckgrnd, res, // Ground (left side) (1st)
                bckgrnd, res // Ground (right side) (1st)
                );
        for (int i = 0; i<repeat ; i++) {
            System.out.printf("               %s🧍%s %s🧍%s %s🧍%s  \r",
                    rb, res, //First in line
                    bv, res, //2nd
                    yb, res //3rd
                    );
            wait(300);
            System.out.print("               🚶 🧍 🧍  \r");
            wait(300);
            System.out.print("             🚶   🚶 🧍  \r");
            wait(300);
            System.out.print("            🚶   🚶  🚶   \r");
            wait(300);
            System.out.print("           🚶   🚶  🚶  🚶 \r");
            wait(300);
            System.out.print("          🚶    🧍 🚶  🚶  \r");
            wait(300);
            System.out.print("         🚶     🧍 🧍 🚶  \r");
            wait(300);
            System.out.print("        🚶      🧍 🧍 🧍 \r");
            wait(300);
            System.out.print("       🚶       🧍 🧍 🧍 \r");
            wait(300);
            System.out.print("      🚶        🧍 🧍 🧍 \r");
            wait(300);
            System.out.print("     🚶         🧍 🧍 🧍 \r");
            wait(300);
            System.out.print("     🕴         🧍 🧍 🧍 \r");
            wait(300);
            System.out.print("               🧍 🧍 🧍 \r");
        }
    }

    public static void scrollingText(String text) {
        String pls = "Please enter ";
        String space = "          ";
        StringBuilder newText = new StringBuilder();
        newText.append(space).append(pls).append(text).append(space);
        int i;
        int l = newText.length();
        for (i = 0; i < l; i++) {
            if (i == l-9) {
                break;
            }
            System.out.printf("[ %s ]\r", newText.substring(i, i + 10));
            wait(200);
        }
        System.out.println("\r");
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void clearConsole() {
        /*
         * Need to change 'Clear Console' shortcut of your IDE to [ALT + SHIFT + 1] for it to work.
         * Also make sure that the focus is on the console and not anywhere else.
         * Click on the anywhere on console to make sure the focus is on the console.
         * But with the click(); method you can just specify the coordinates (of the screen based on resolution)
         * on which you want the cursor to click (just make sure it is in the right place tho).
         * x:1200 y:700, This is the coordinates I entered.
         * It clicks approximately around the lower right of my screen. Right at the IntelliJ console.
         */
        try {
            click(1200, 700);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_ALT);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_1);
        } catch (AWTException ex) {
            ex.printStackTrace(System.err);
        }
    }

    public static void click(int x, int y) throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
