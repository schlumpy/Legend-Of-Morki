package view.mainmenu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import view.JFXView;

import java.awt.event.ActionEvent;

public class Gui implements JFXView, IGui {
    @FXML
    Button settingButton;

    @Override
    public String getRessource() {
        return "/fxml/MainLobby.fxml";
    }

    @Override
    public String getTitle() {
        return "Hauptmenü";
    }

    @Override
    public void showPlaySuccesful() {

    }
    @FXML
    private void einstellungenButtonHandler(ActionEvent event){
        //TODO: do something
    }
}
