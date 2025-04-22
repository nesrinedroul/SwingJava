package Controller;

import Model.DonneeTemp;

public class ContDiminue implements Controller {
    @Override
    public void traiterEvent(DonneeTemp model) {
        model.setTempC(model.getTempC() - 1);
    }
}
