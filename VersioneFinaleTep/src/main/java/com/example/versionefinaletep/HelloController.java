package com.example.versionefinaletep;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    private boolean pista1=true;
    private boolean pista2=true;
    private boolean pista3=true;
    private Aerei ae1=new Aerei("alyanz");
    private Aerei ae2=new Aerei("alitalia");
    private Aerei ae3=new Aerei("ryanar");
    private Aerei ae4=new Aerei("easyget");
    private Aerei ae5=new Aerei("scarnagas");
    private Aerei ae6=new Aerei("sbenzus");
    private Aerei ae7=new Aerei("AmbriolaCompany");
    private Aerei ae8=new Aerei("FullBox");
    private Aerei ae9=new Aerei("dordi");
    private Aerei ae10=new Aerei("mollyrosa");


    @FXML
    private ImageView a1;
    @FXML
    private ImageView a2;
    @FXML
    private ImageView a3;
    @FXML
    private ImageView a4;
    @FXML
    private ImageView a5;
    @FXML
    private ImageView a6;
    @FXML
    private ImageView a7;
    @FXML
    private ImageView a8;
    @FXML
    private ImageView a9;
    @FXML
    private ImageView a10;

    @FXML
    protected void decollo(){
ae1.start();
    }
}