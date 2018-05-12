package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import sample.Domain.Play;

import javafx.scene.image.ImageView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by thabomoopa on 12/05/2018.
 */
public class PlayController implements ActionListener, Initializable {

    private Play play;
    private String[][] animals;
    SecureRandom random = new SecureRandom();

    @FXML
    private ImageView imageView;

    @FXML
    private TextField txtAnswer;

    @FXML
    private Button btnAnswer;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        animals = new String[][]{{"lion","lion.png"}, {"Elephant","elephant.png"},{"Rhinoceros","rhinoceros.png"},{"Leopard","leopard.png"},{"Buffalo","buffalo.png"}};

        File file = new File("src/sample/images/buffalo.png");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
        //imageView.setImage(animals[0][0]);
        System.out.println("intializer");
        System.out.println(imageView.getImage());

        Play play = new Play();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }



    public void calculate(ActionEvent actionEvent) {
    }

    public void calc(ActionEvent actionEvent) {
    }

    public void buttonPressed(javafx.event.ActionEvent actionEvent) {
        System.out.println("Pressed");
    }
}
