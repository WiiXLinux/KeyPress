package lib.testing;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.NativeSystem;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import lib.AutoMat;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MouseCordGetter implements NativeKeyListener {

    Rectangle bounds = new Rectangle();
    Robot robot;

    public MouseCordGetter() throws AWTException {
        robot = new Robot();

        Dimension bnd = Toolkit.getDefaultToolkit().getScreenSize();
        bounds.setBounds(0,0,(int)bnd.getWidth(),(int)bnd.getHeight());
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeEvent) {


        if ((int)nativeEvent.getKeyChar() == 27){
            System.out.println("exiting");
            System.exit(1);
        }

        if ((int)nativeEvent.getKeyChar() == 103){
            System.out.println(MouseInfo.getPointerInfo().getLocation());
            BufferedImage image = robot.createScreenCapture(bounds);

            System.out.println(new Color(image.getRGB((int)MouseInfo.getPointerInfo().getLocation().getX(),(int)MouseInfo.getPointerInfo().getLocation().getY())));
        }

        }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
    }
    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeEvent) {
    }


}
