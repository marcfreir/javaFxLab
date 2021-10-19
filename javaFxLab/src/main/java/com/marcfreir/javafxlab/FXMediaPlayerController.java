package com.marcfreir.javafxlab;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

public class FXMediaPlayerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to this test application, just to play Trogdor!\nCredits: TheDooo\n - Trogdor (cover)");
        //welcomeText.setAlignment(Pos.CENTER);
        welcomeText.setTextAlignment(TextAlignment.CENTER);
    }
}