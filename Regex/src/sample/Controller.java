package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    @FXML
    private Button check;
    @FXML
    private TextArea text;
    @FXML
    private TextField regex;

    @FXML
    private void checkRegex(){
        String s = text.getText();
        String r = regex.getText();

        Pattern pattern = Pattern.compile(r, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        boolean matchFound = matcher.find();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if(matchFound) {
            alert.setTitle("Match founf");
            alert.setContentText("OK");
        } else {
            alert.setTitle("No match founf");
            alert.setContentText("NG");
        }
        alert.showAndWait();
    }
}
