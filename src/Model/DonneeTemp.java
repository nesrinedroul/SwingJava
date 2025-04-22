package Model;

import Controller.Controller;

public class DonneeTemp extends ModeleSubject{
    private double tempC = 20.0;
    private Controller strategie;

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
        notifyView();
    }

    public double convertiTemp() {
        return (tempC * 9 / 5) + 32;
    }

    public void setStrategie(Controller strategie) {
        this.strategie = strategie;
    }

    public void traiterEvent() {
        if (strategie != null) {
            strategie.traiterEvent(this);
        }
    }
}
