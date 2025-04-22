package Model;
import View.ViewObser;

import java.util.ArrayList;

public class ModeleSubject {
    private ArrayList<ViewObser> listView = new ArrayList<>();

    public void ajouter(ViewObser view) {
        listView.add(view);
    }

    public void delete(ViewObser view) {
        listView.remove(view);
    }

    public void notifyView() {
        for (ViewObser view : listView) {
            view.changeAff();
        }
    }
}
