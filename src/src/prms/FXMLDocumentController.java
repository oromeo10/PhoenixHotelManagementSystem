/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 *
 * @author Fergus Kelley
 */
public class FXMLDocumentController implements Initializable {

    @FXML   public TabPane allTabs;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // This block of code automatically makes all tabs availible on startup and
        // selects a given tab. This is useful if you are working on the code for a tab
        // and you don't want to go through the login procedure every time
        // This code should stay commented out whenever you push to github
        // 
//        ObservableList<Tab> tabList = allTabs.getTabs();
//        for (Tab next : tabList) {
//            next.setDisable(false);
//        }
//        SingleSelectionModel<Tab> selectionModel = allTabs.getSelectionModel();
//        selectionModel.select(1);

    }

}
