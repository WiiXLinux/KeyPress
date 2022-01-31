package lib;

import java.awt.*;

public class AutoMat {

    private static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    static int[] StringToIntArray(String input) {
        int[] temp = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            temp[i] = input.toUpperCase().toCharArray()[i];
        }
        return temp;
    }

    public static void pressKey(int keycode){
        robot.keyPress(keycode);
        robot.keyRelease(keycode);
    }


    public static void pressKey(int[] keyseq) {


        for (int i = 0; i < keyseq.length; i++) {
            robot.keyPress(keyseq[i]);
        }


        for (int i = 0; i < keyseq.length; i++) {

            robot.keyRelease(keyseq[i]);
        }


    }

    public static void type(String text, int sleepmills) throws InterruptedException {
        int[] keyseq = StringToIntArray(text);

        for (int i = 0; i < keyseq.length; i++) {
            robot.keyPress(keyseq[i]);
            Thread.sleep(sleepmills);
            robot.keyRelease(keyseq[i]);
        }


    }

    public static void type(int[] keyseq, int sleepmills) throws InterruptedException {


        for (int i = 0; i < keyseq.length; i++) {
            robot.keyPress(keyseq[i]);
            Thread.sleep(sleepmills);
            robot.keyRelease(keyseq[i]);
        }


    }

}
