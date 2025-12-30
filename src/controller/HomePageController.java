package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class HomePageController {

    // Bottoni del menu header
    @FXML
    private Button chiSiamoButton; //definito solo a livello di grafica

    @FXML
    private Button serviziButton;

    @FXML
    private Button contattiButton;

    // Bottoni delle card
    @FXML
    private Button cercaServizioButton;

    @FXML
    private Button iniziaOffrireButton;

    @FXML
    private Button esploraOspiteButton;

    /**
     * Metodo chiamato automaticamente dopo il caricamento del FXML
     */
    @FXML
    public void initialize() { //inizializza il controller
        System.out.println("HomePageController inizializzato");

        // Configura gli handler dei bottoni del menu
        setupMenuButtons();

        // Configura gli handler dei bottoni delle card
        setupCardButtons();
    }

    private void setupMenuButtons() {
        if (chiSiamoButton != null) {
            System.out.println("setup chi siamo eseguito");
            chiSiamoButton.setOnAction(e -> handleChiSiamo());
        }

        if (serviziButton != null) {
            serviziButton.setOnAction(e -> handleServizi());
        }

        if (contattiButton != null) {
            contattiButton.setOnAction(e -> handleContatti());
        }
    }

    private void setupCardButtons() {
        if (cercaServizioButton != null) {
            cercaServizioButton.setOnAction(e -> handleCercaServizio());
        }

        if (iniziaOffrireButton != null) {
            iniziaOffrireButton.setOnAction(e -> handleIniziaOffrire());
        }

        if (esploraOspiteButton != null) {
            esploraOspiteButton.setOnAction(e -> handleEsploraOspite());
        }
    }

    // Handler per i bottoni del menu
    @FXML
    private void handleChiSiamo() {
        showInfo("Chi Siamo", "Scopri di più su ServiziPro e il nostro team!");
        System.out.println("Cliccato: Chi Siamo");
    }

    @FXML
    private void handleServizi() {
        showInfo("Servizi", "Esplora tutti i servizi disponibili sulla nostra piattaforma!");
        System.out.println("Cliccato: Servizi");
    }

    @FXML
    private void handleContatti() {
        showInfo("Contatti", "Contattaci per qualsiasi informazione o supporto!");
        System.out.println("Cliccato: Contatti");
    }

    // Handler per i bottoni delle card
    @FXML
    private void handleCercaServizio() {
        showInfo("Cerca Servizio", "Accedi come cliente per cercare professionisti!");
        System.out.println("Cliccato: Cerca un servizio");
    }

    @FXML
    private void handleIniziaOffrire() {
        showInfo("Professionista", "Registrati come professionista per offrire i tuoi servizi!");
        System.out.println("Cliccato: Inizia a offrire");
    }

    @FXML
    private void handleEsploraOspite() {
        showInfo("Modalità Ospite", "Esplora il catalogo dei servizi senza registrazione!");
        System.out.println("Cliccato: Esplora come ospite");
    }

    /**
     * Mostra un dialog informativo
     */
    private void showInfo(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
