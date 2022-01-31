package bin.testing;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import lib.ColorComparing;
import lib.testing.MouseCordGetter;

import java.awt.*;

public class TestingMain extends MouseCordGetter {
    public TestingMain() throws AWTException {
    }

    public static void main(String[]args) throws NativeHookException, AWTException {
        GlobalScreen.addNativeKeyListener(new TestingMain());
        GlobalScreen.registerNativeHook();

        Color a = new Color(251,123,11);

        Color b = new Color(255,133,12);

        System.out.println(ColorComparing.colorComp(a,b));
    }
}
