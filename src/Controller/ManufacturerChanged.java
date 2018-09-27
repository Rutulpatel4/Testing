package Controller;

import javafx.beans.value.ObservableValue;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ManufacturerChanged implements ChangeListener {



    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        System.out.printf("New value: %s%n", newValue);
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {

    }
}
