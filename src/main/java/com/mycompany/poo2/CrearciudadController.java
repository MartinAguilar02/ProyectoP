/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo2;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author User
 */
public class CrearciudadController {
    @FXML
    private void switchToAdministarCiudades() throws IOException {
        App.setRoot("administrarciudades");
    }
}
