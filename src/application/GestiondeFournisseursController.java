package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GestiondeFournisseursController implements Initializable {

	@FXML
	private TableColumn<Fournisseurs, String> nom;

	@FXML
	private TableColumn<Fournisseurs, String> adresse;

	@FXML
	private TableColumn<Fournisseurs, String> telephone;

	@FXML
	private TableColumn<Fournisseurs, String> email;

	@FXML
	private TableView<Fournisseurs> tblFournisseurs;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		nom.setCellValueFactory(new PropertyValueFactory<Fournisseurs, String>("nom"));
		adresse.setCellValueFactory(new PropertyValueFactory<Fournisseurs, String>("adresse"));
		telephone.setCellValueFactory(new PropertyValueFactory<Fournisseurs, String>("telephone"));
		email.setCellValueFactory(new PropertyValueFactory<Fournisseurs, String>("email"));
		tblFournisseurs.setItems(Main.listt);

	}

	@FXML
	private void handleMenuAddAction(ActionEvent e) throws IOException {
		Stage primaryStage = (Stage) tblFournisseurs.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane) FXMLLoader.load(getClass().getResource("Fournisseurs.fxml"));
		Scene sceneList = new Scene(layoutAddProduct, 500, 550);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);

	}
	
	@FXML
	private void handleMenuAFi(ActionEvent e)
	{
			/// début partie alert
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Finance");
			alert.setHeaderText(null);
			alert.setContentText("Contenu en Cours de constructions");

			alert.showAndWait();
			/// fin partie alert
		
	}
	@FXML
	private void handleListProduitAction(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage)tblFournisseurs.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListProduits.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,700,400);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);

		
	}
	
	@FXML
	private void handleMenuApropos(ActionEvent e)
	{
			/// début partie alert
		Alert dialog = new Alert(AlertType.INFORMATION);
		dialog.setTitle("ISIKA");
		dialog.setHeaderText("Centre Formation du Numerique.");
		dialog.setContentText("sika, école spécialisée en formation et reconversion vers les métiers "
				+ "du développement informatique propose des formations  intensives et à distance "
				+ "accessibles aux débutants à partir de Bac+3/4 et des formations de spécialisation destinées "
				+ "aux entreprises et aux particuliers informaticien(ne)s confirmé(e)s.\n" +
		"(Avec 30 ans d'expérience et plus de 6000 carrières lancées dans le numérique, Isika met à profit ses connaissances appronfondies du marché pour "
		+ "proposer des formations complètes est adaptées aux besoins des entreprises.)");
		dialog.showAndWait();
			/// fin partie alert
		
	}
	
	@FXML
	private void handleAjoutP(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) tblFournisseurs.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,380,500);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
		
	}
    


}
