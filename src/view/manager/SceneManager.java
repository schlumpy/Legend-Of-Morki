package view.manager;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.JFXView;
import view.mainmenu.Gui;

import java.io.IOException;

public class SceneManager {
    private Stage mainstage;

    public SceneManager(Stage stage){
        this.mainstage = stage;
        Gui gui = new Gui();
        this.loadScene(gui);
    }

    public void loadScene(JFXView view){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource(view.getRessource()));
            loader.setController(view);
            Parent parent = loader.load();
            Scene scene = new Scene(parent);
            mainstage.setScene(scene);
            mainstage.setTitle(view.getTitle());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
