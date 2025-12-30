package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class HomePageProfessionistaController {

    // Bottoni del menu header
    @FXML
    private Button chiSiamoButton;

    @FXML
    private Button serviziButton;

    @FXML
    private Button contattiButton;

    // Bottoni delle azioni principali
    @FXML
    private Button loginButton;

    @FXML
    private Button registratiButton;

    // Bottoni del footer
    @FXML
    private Button terminiButton;

    @FXML
    private Button faqButton;

    @FXML
    private Button socialButton;

    @FXML
    private Button tornaIndietroButton;

    /**
     * Metodo chiamato automaticamente dopo il caricamento del FXML
     */
    @FXML
    public void initialize() {
        System.out.println("HomePageProfessionistaController inizializzato");

        // Configura gli handler dei bottoni del menu
        setupMenuButtons();

        // Configura gli handler dei bottoni delle azioni
        setupActionButtons();

        // Configura gli handler dei bottoni del footer
        setupFooterButtons();
    }

    private void setupMenuButtons() {
        if (chiSiamoButton != null) {
            chiSiamoButton.setOnAction(e -> handleChiSiamo());
        }

        if (serviziButton != null) {
            serviziButton.setOnAction(e -> handleServizi());
        }

        if (contattiButton != null) {
            contattiButton.setOnAction(e -> handleContatti());
        }
    }

    private void setupActionButtons() {
        if (loginButton != null) {
            loginButton.setOnAction(e -> handleLogin());
        }

        if (registratiButton != null) {
            registratiButton.setOnAction(e -> handleRegistrati());
        }
    }

    private void setupFooterButtons() {
        if (terminiButton != null) {
            terminiButton.setOnAction(e -> handleTermini());
        }

        if (faqButton != null) {
            faqButton.setOnAction(e -> handleFaq());
        }

        if (socialButton != null) {
            socialButton.setOnAction(e -> handleSocial());
        }

        if (tornaIndietroButton != null) {
            tornaIndietroButton.setOnAction(e -> handleTornaIndietro());
        }
    }

    // Handler menu
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

    // Handler azioni
    @FXML
    private void handleLogin() {
        showInfo("Login", "Accedi al tuo account professionista!");
        System.out.println("Cliccato: Login");
    }

    @FXML
    private void handleRegistrati() {
        showInfo("Registrazione", "Registrati come professionista su ServiziPro!");
        System.out.println("Cliccato: Registrati");
    }

    // Handler footer
    @FXML
    private void handleTermini() {
        showInfo("Termini e Condizioni", "Leggi i nostri termini e condizioni!");
        System.out.println("Cliccato: Termini e Condizioni");
    }

    @FXML
    private void handleFaq() {
        showInfo("FAQ e Aiuto", "Trova risposta alle domande frequenti!");
        System.out.println("Cliccato: FAQ e Aiuto");
    }

    @FXML
    private void handleSocial() {
        showInfo("Social", "Seguici sui social media!");
        System.out.println("Cliccato: Social");
    }

    @FXML
    private void handleTornaIndietro() {
        showInfo("Torna Indietro", "Ritorno alla homepage principale!");
        System.out.println("Cliccato: Torna Indietro");
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
