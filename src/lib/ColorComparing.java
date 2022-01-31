package lib;

import java.awt.*;

public class ColorComparing {

    public static double logAbs(double a){
        return Math.pow(Math.E,Math.abs(Math.log(a)));
    }

    public static double compareValues(double a1, double a2){
        return 1/logAbs(a1/a2);
    }

    public static double colorComp(Color c1, Color c2){
        double redComp = compareValues(c1.getRed()+1, c2.getRed()+1);
        double greenComp = compareValues(c1.getGreen()+1, c2.getGreen()+1);
        double blueComp = compareValues(c1.getBlue()+1, c2.getBlue()+1);

        return (redComp+blueComp+greenComp)/3;
    }
}
