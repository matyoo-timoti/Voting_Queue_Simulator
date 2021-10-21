package com.yhtomiTwehttaM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Animations {

    public void queue(int repeat, String name, int num) {
        var blk = Color.BLACK_BRIGHT;
        var wbb = Color.WHITE_BOLD_BRIGHT;
        var gbb = Color.GREEN_BOLD_BRIGHT;
        var yb = Color.YELLOW_BRIGHT;
        var w = Color.WHITE_BACKGROUND;
        var res = Color.RESET;
        System.out.printf("""
                           %sVoting Station%s
                         %s %s▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔%s
                         %s %s └ └ └ └ └ └ └  %s
                         %s %s └ └ └ └ └ └ └  %s %s[ %s %s ]%s
                         %s %s  ▁▁▁  └ └ └ └  %s
                         %s %s▁▁%s▏%s╍%s▕%s%s▁▁▁▁▁▁▁▁▁▁▁%s
                        """,
                gbb, res, //Bldg. name
                blk, w, res, //Top (5th Level)
                blk, w, res, // Above mid (4th)
                blk, w, res, // Mid (3rd)
                wbb, num, name, res, // Number and Name
                blk, w, res, // Below mid (2nd)
                blk, w, res, // Ground (left side) (1st)
                yb, res,
                blk, w, res // Ground (right side) (1st)
        );
        for (int i = 0; i < repeat; i++) {
            System.out.print("               🧍 🧍 🧍  \r");
            wait(250);
            System.out.print("               🚶 🧍 🧍  \r");
            wait(250);
            System.out.print("             🚶   🚶 🧍  \r");
            wait(250);
            System.out.print("            🚶   🚶  🚶   \r");
            wait(250);
            System.out.print("           🚶   🚶  🚶  🚶 \r");
            wait(250);
            System.out.print("          🚶    🧍 🚶  🚶  \r");
            wait(250);
            System.out.print("         🚶     🧍 🧍 🚶  \r");
            wait(250);
            System.out.print("        🚶      🧍 🧍 🧍 \r");
            wait(250);
            System.out.print("       🚶       🧍 🧍 🧍 \r");
            wait(250);
            System.out.print("      🚶        🧍 🧍 🧍 \r");
            wait(250);
            System.out.print("     🚶         🧍 🧍 🧍 \r");
            wait(250);
            System.out.print("     ⌃         🧍 🧍 🧍 \r");
            wait(250);
        }
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
         * x:1250 y:700, This is the coordinates I entered.
         * It clicks approximately around the lower right of my screen. Right at the IntelliJ console.
         */
        try {
            click(1250, 700);
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
