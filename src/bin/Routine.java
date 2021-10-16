package bin;

import lib.AutoMat;

import java.awt.event.KeyEvent;


public class Routine {

    public enum tunes {
        YES, NO
    }

    public static void StartFirefox() throws InterruptedException {
        AutoMat.pressKey(new int[]{KeyEvent.VK_WINDOWS});
        Thread.sleep(250);
        AutoMat.type("firefox", 0);
        Thread.sleep(25);
        AutoMat.pressKey(new int[]{KeyEvent.VK_ENTER});
        Thread.sleep(1000);
        AutoMat.pressKey(new int[]{KeyEvent.VK_Y});
        Thread.sleep(25);
        AutoMat.pressKey(new int[]{KeyEvent.VK_ENTER});

        Thread.sleep(2500);
    }

    public static void StartSpotify(Enum tunes) throws InterruptedException {
        AutoMat.pressKey(new int[]{KeyEvent.VK_WINDOWS});
        Thread.sleep(250);
        AutoMat.type("spotify", 0);
        Thread.sleep(25);
        AutoMat.pressKey(new int[]{KeyEvent.VK_ENTER});
        Thread.sleep(3000);
        if (tunes == Routine.tunes.YES) {
            AutoMat.pressKey(new int[]{KeyEvent.VK_CONTROL, KeyEvent.VK_L});
            Thread.sleep(250);
            AutoMat.type("golden brown take vibe ep", 0);
            Thread.sleep(250);
            AutoMat.type("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t", 25);
            AutoMat.pressKey(new int[]{KeyEvent.VK_ENTER});
        }

        Thread.sleep(2500);
    }


    public static void main(String[] args) throws InterruptedException {

        StartFirefox();
        StartSpotify(tunes.YES);


    }
}
