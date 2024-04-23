/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;        // importa o evento
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
//import javafx.scene.control.Button;  // importa o botão
import javafx.scene.control.Label;     // importa o label

/**
 *
 * @author marcos
 */
public class FXMLDocumentController implements Initializable { //cria uma interface a partir do FXML
    
    @FXML   //identificação dos controles
    private Label lblMensagem;
    private Button btnClick;
    //private Button btnClick;
    
    @FXML
    private void clicouBtn(ActionEvent event) { //função do btnBotao
        lblMensagem.setText("Olá Mundão!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
