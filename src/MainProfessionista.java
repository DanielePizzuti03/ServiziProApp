import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controller.HomePageProfessionistaController;

public class MainProfessionista extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carica il file FXML della homepage professionista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view/HomePageProfessionista.fxml"));
            Parent root = loader.load();

            // Ottieni il controller se necessario
            HomePageProfessionistaController controller = loader.getController();

            // Crea la scena
            Scene scene = new Scene(root, 1000, 700);

            // Imposta il titolo e la scena
            primaryStage.setTitle("ServiziPro - Homepage Professionista");
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
