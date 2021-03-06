package com.yhtomiTwehttaM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Misc {

    public static void anim1(int repeat, int msSpeed) {
        System.out.print("""
                             Voting Station
                          ▕▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▏
                          ▕ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▏
                          ▕ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▏
                          ▕  ▁▁▁  ▇ ▇ ▇ ▇ ▇ ▏
                          ▕▁▁▏╍▕▁▁▁▁▁▁▁▁▁▁▁▁▏🚘🚘🚘🚔🌳
                        """);
        String[] anim1 = new String[] {
                "                🧍 🧍 🧍    \r",
                "                🚶 🧍 🧍     \r",
                "              🚶   🚶 🧍     \r",
                "             🚶   🚶  🚶     \r",
                "            🚶   🚶  🚶  🚶   \r",
                "           🚶    🧍 🚶  🚶    \r",
                "          🚶     🧍 🧍 🚶    \r",
                "         🚶      🧍 🧍 🧍    \r",
                "        🚶       🧍 🧍 🧍    \r",
                "       🚶        🧍 🧍 🧍    \r",
                "      🚶         🧍 🧍 🧍    \r",
                "      ⌃         🧍 🧍 🧍    \r"
        };
        for (int i = 0; i < repeat; i++){
            for (String s : anim1) {
                System.out.print(s);
                wait(msSpeed);
            }
        }
        System.out.print("                🧍 🧍 🧍    \n");
    }

    public static void pig(String text) {
        StringBuffer line = new StringBuffer();
        line.append("━".repeat(text.length()));
        System.out.printf("""
                          
                          ┏━╮╭━┓ ╭━%s━╮
                          ┃┏┗┛┓┃╭┫ %s ┃
                          ╰┓▋▋┏╯╯╰━%s━╯
                         ╭━┻╮ ┗━━━━╮╭╮
                         ┃▎▎┃      ┣━╯
                         ╰━┳┻▅╯    ┃
                           ╰━┳┓┏┳┓┏╯
                             ┗┻┛┗┻┛
                        
                        """,
                line, text, line);
    }

    public static void titleAnim1(int msSpeed) {
        String[][] tAnim = new String[][]{
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        " ██░   ██░   ████░  ████████░ ██░ ███░  ██░  ██████░      ██████░    ██░   ██░ ██████░ ██░   ██░ ██████░ \n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        " ██░   ██░ ██░   ██░   ██░    ██░ ████░ ██░ ██░         ██░     ██░  ██░   ██░ ██░     ██░   ██░ ██░ \n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        "  ██░ ██░  ██░   ██░   ██░    ██░ ██░██░██░ ██░  ███░   ██░ ██░ ██░  ██░   ██░ █████░  ██░   ██░ █████░ \n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        "   ████░   ██░   ██░   ██░    ██░ ██░ ████░ ██░   ██░     ██████░    ██░   ██░ ██░     ██░   ██░ ██░ \n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● \r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ \r",
                        "    ██░      ████░     ██░    ██░ ██░  ███░  ██████░        ██░       ██████░  ██████░  ██████░  ██████░   \n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        "                                                                                            \n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        "  ██████░ ██░ ███░   ███░ ██░   ██░ ██░       █████░  ████████░  █████░   ██████░ \n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        " ██░      ██░ ████░ ████░ ██░   ██░ ██░      ██░  ██░    ██░    ██░   ██░ ██░  ██░\n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        "  █████░  ██░ ██░████░██░ ██░   ██░ ██░      ███████░    ██░    ██░   ██░ ██████░\n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        "      ██░ ██░ ██░ ██░ ██░ ██░   ██░ ██░      ██░  ██░    ██░    ██░   ██░ ██░  ██░\n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        " ██████░  ██░ ██░     ██░  ██████░  ███████░ ██░  ██░    ██░     ██████░  ██░  ██░\n\n"
                },
                {
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘ ⭘\r",
                        " ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ● ●\r",
                        " ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶ ✶\n",
                },

        };
//        System.out.print(Color.GREEN_BRIGHT);
        for (int i = 0; i < tAnim.length; i++) {
            if (i == 11) {
                System.out.print(Color.YELLOW_BRIGHT);
            }
            for (int j = 0; j < tAnim[i].length; j++) {
                System.out.print(tAnim[i][j]);
                wait(msSpeed);
            }
        }
        System.out.print(Color.RESET);
    }

    public static void scrollingTextLn(String text, int msSpeed) {
        StringBuilder newText = new StringBuilder();
        StringBuilder space = new StringBuilder();
        space.append(" ".repeat(text.length()));
        newText.append(space).append(text).append(space);
//        newText.append(" ".repeat(Math.max(0, length))).append(text);
        for (int i = 0; i < newText.length(); i++) {
            if (i == newText.length() - text.length() - text.length() + 1) {
                break;
            }
            System.out.printf("%s\r", newText.substring(i, i + text.length()));
            wait(msSpeed);
        }
        System.out.println("\n");
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void clearConsole() {
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

    public static void maximizeConsole() {
        /*
        Maximizes the size of the console/output pane.
        Works on IntelliJ IDEA. Change your IDE's 'Maximize
        Console' shortcut to SHIFT + CONTROL + QUOTE (")
        */
        try {
            click(1200, 700);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_QUOTE);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_QUOTE);
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
