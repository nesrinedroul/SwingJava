package View;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import Model.*;
public class ViewSlide extends JFrame implements ViewObser {
    private DonneeTemp model;
    private JSlider slider;

    public ViewSlide(DonneeTemp model) {
        this.model = model;
        model.ajouter(this);

        setTitle("Celsius");
        slider = new JSlider(JSlider.VERTICAL, -50, 120, (int) model.getTempC());
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                model.setTempC(slider.getValue());
            }
        });

        add(slider);
        pack();
        setVisible(true);
    }

    @Override
    public void changeAff() {
        slider.setValue((int) model.getTempC());
    }

    @Override
    public void drawnCtrl() {
    }
}
