import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controller.HomePageController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carica il file FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Homepage.fxml"));
            Parent root = loader.load();

            // Ottieni il controller se necessario
            HomePageController controller = loader.getController();

            // Crea la scena
            Scene scene = new Scene(root, 900, 600);

            // Imposta il titolo e la scena
            primaryStage.setTitle("ServiziPro");
            primaryStage.setScene(scene);
            primaryStage.setResizable(true);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Errore nel caricamento del file FXML: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}