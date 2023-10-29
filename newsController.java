package com.example.mainpage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.FileNotFoundException;

public class newsController {

    @FXML
    private VBox hBox1;

    @FXML
    private VBox hBox2;

    @FXML
    private VBox hBox3;

    @FXML
    private VBox hBox4;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    void econimyB(MouseEvent event) throws FileNotFoundException {
        Image i1 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\economy1.png");
        image1.setImage(i1);
        Image i2 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\economy2.png");
        image2.setImage(i2);
        Image i3 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\economy3.png");
        image3.setImage(i3);
        Image i4 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\economy4.png");
        image4.setImage(i4);


        label1.setText("Paris: Should for-hire e-scooters be banned?");
        label2.setText("California passes bill capping oil industry profits");
        label3.setText("Elon Musk and hundreds of experts call for 'pause' in AI development!");
        label4.setText("French oil refinery strike perseveres: 'We are tired but determined'");
    }

    @FXML
    void foodB(MouseEvent event) throws FileNotFoundException {

        Image i1 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\food1.png");
        image1.setImage(i1);
        Image i2 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\food2.png");
        image2.setImage(i2);
        Image i3 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\food3.png");
        image3.setImage(i3);
        Image i4 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\food4.png");
        image4.setImage(i4);

        label1.setText("Fancy a delicious creative vegan sandwich?");
        label2.setText("Five restaurants in Lille that pack a punch");
        label3.setText("Lille, a city that tickles your taste buds");
        label4.setText("France's Hauts-de-France region has been awarded the European Region of Gastronomy for 2023. ");
    }

    @FXML
    void sportB(MouseEvent event) throws FileNotFoundException {

        Image i1 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\sport1.png");
        image1.setImage(i1);
        Image i2 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\sport2.png");
        image2.setImage(i2);
        Image i3 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\sport3.png");
        image3.setImage(i3);
        Image i4 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\sport4.png");
        image4.setImage(i4);

        label1.setText("Paris Marathon: A first for Ethiopia's Abeje Ayana, a coup for Kenya's Helah Kiprop");
        label2.setText("Verstappen wins in chaotic finish to Australian Grand Prix");
        label3.setText("Mbappe shines as France new captain in 4-0 win over the Netherlands");
        label4.setText("Beating Netherlands, France's Les Bleus open a new chapter of their history in style");
    }

    @FXML
    void techB(MouseEvent event) throws FileNotFoundException {

        Image i1 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\science1.png");
        image1.setImage(i1);
        Image i2 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\science2.png");
        image2.setImage(i2);
        Image i3 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\science3.png");
        image3.setImage(i3);
        Image i4 = new Image("C:\\Users\\Acer\\IdeaProjects\\MainPage\\src\\main\\java\\com\\example\\mainpage\\science4.png");
        image4.setImage(i4);

        label1.setText("Beware, poison!");
        label2.setText("EU finally adopts space defense strategy");
        label3.setText("Prostate cancer treatment can wait for most men, study finds");
        label4.setText("Hibernation, a closely studied option for extended space travel");
    }

}
