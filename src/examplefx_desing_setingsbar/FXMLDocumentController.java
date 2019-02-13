/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplefx_desing_setingsbar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author angel
 */
public class FXMLDocumentController implements Initializable {
    

    @FXML
    private ImageView ib_User,ib_Home,ib_Settings,ib_Shutdown;
    @FXML
    private AnchorPane Menu1,Menu2;
    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//    }
    
    @FXML
    private void mambeche(MouseEvent e){
        if(e.getTarget()==ib_Shutdown)
            System.exit(0);
        else
            if(e.getTarget()==ib_Home)
        {
            Menu1.setVisible(false);
            Menu2.setVisible(false);
        }else
            if(e.getTarget()==ib_Settings)
        {
            Menu1.setVisible(true);
            Menu2.setVisible(false);
        }else
            if(e.getTarget()==ib_User)
            {
                Menu2.setVisible(true);
                Menu1.setVisible(false);
            }
                
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
