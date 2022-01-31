package bin.games.VegaConflict;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import lib.AutoMat;
import lib.ColorComparing;
import lib.testing.MouseCordGetter;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;

public class VegaMain implements NativeKeyListener {

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeEvent) {
        if ((int)nativeEvent.getKeyChar() == 27){
            System.out.println("exiting");
            System.exit(1);
        }
    }


    private Robot robot;
    private Rectangle bounds = new Rectangle();

    private boolean shouldwait() throws InterruptedException {
        Thread.sleep(1000);
        BufferedImage image = robot.createScreenCapture(bounds);
        if (ColorComparing.colorComp(new Color(image.getRGB(1094,1313)),new Color(50,88,99))<0.8)
        return true;
        else return false;
    }

    private void init() throws InterruptedException, AWTException {
        robot = new Robot();

        Dimension bnd = Toolkit.getDefaultToolkit().getScreenSize();
        bounds.setBounds(0,0,(int)bnd.getWidth(),(int)bnd.getHeight());


        System.out.println("Starting in 5 seconds, open game");
        Thread.sleep(5000);
        System.out.println("Starting automation");
    }

    private void program() throws InterruptedException {
        while (true) {



            robot.mouseMove(2172, 124);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(100);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            while (shouldwait()){

            }


            robot.mouseMove(1095,1356);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(100);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);




        }
    }

// TODO Cords for:
    /*
    *
    * search: java.awt.Point[x=2172,y=124]
      fight : java.awt.Point[x=1095,y=1356]
    *
    * */


    public static void main(String[]args) throws InterruptedException, AWTException, NativeHookException {
        GlobalScreen.registerNativeHook();
        GlobalScreen.addNativeKeyListener(new VegaMain());

        VegaMain vegaMain = new VegaMain();
        vegaMain.init();

        vegaMain.program();




    }
}
