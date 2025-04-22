import Model.*;
import View.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        DonneeTemp model = new DonneeTemp();

        ViewC viewC = new ViewC(model);
        viewC.setLocation(100, 100);
        viewC.drawnCtrl();

        ViewF viewF = new ViewF(model);
        viewF.setLocation(600, 100);
        viewF.drawnCtrl();

        ViewSlide slider = new ViewSlide(model);
        slider.setLocation(350, 300);
        slider.drawnCtrl();
    }
}