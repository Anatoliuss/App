package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField A;

    @FXML
    private TextField B;

    @FXML
    private TextField C;

    @FXML
    private ToggleButton colour;

    @FXML
    protected void Change() {
        if (colour.isSelected()){
            colour.setStyle("-fx-background-color: #000000");
        }else{
            colour.setStyle("-fx-background-color: #FFFFFF");
            colour.setStyle("-fx-text-fill: #000000");
        }
    }


    @FXML
    protected void doSmth() {
        int a = Integer.parseInt(A.getText());
        int b=Integer.parseInt(B.getText());
        int c=Integer.parseInt(C.getText());
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant <0){
            welcomeText.setText("no solutions");
        }else{
        double ans1 = (b*(-1)+Math.sqrt(discriminant))/(2*a);
        double ans2 = b*(-1)-Math.sqrt(discriminant)/(2*a);
            welcomeText.setText("x1=" + ans1+" x2="+ans2);
    }


}}