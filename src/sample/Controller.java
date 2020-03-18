package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label hello;
    public void submit(ActionEvent actionEvent) {
hello.setText("Hello World");
    }
}
