/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusoselector;

import Componentes.SelectorDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Juanjo
 */
public class APPUsoSelectorController implements Initializable {

    ArrayList<String> items;
    
    @FXML
    private SelectorDeslizamiento selectorArriba;
    @FXML
    private SelectorDeslizamiento selectorAbajo;
    @FXML
    private Label etiquetaPulsado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // Cargamos los datos para los selectores
        cargarSelectores();
        
        // Selector arriba cuando es presionado
        selectorArriba.setOnAction((ActionEvent event) ->{
            etiquetaPulsado.setText("Has pulsado el selector de arriba");
        });
        
        // Selector abajo cuando es presionado
        selectorAbajo.setOnAction((ActionEvent event) ->{
            etiquetaPulsado.setText("Has pulsado el selector de abajo");
        });
    }
    
    // Método para cargar los datos de los selectores
    public void cargarSelectores(){
        items = new ArrayList();
        items.add("Uno");
        items.add("Dos");
        items.add("Tres");
        items.add("Cuatro");
        
        // Le pasamos a los dos selectores creados el array list cargado de los datos (items)
        selectorArriba.setItems(items);
        selectorAbajo.setItems(items);
    }
}
