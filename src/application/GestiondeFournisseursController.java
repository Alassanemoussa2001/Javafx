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
			/// d�but partie alert
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
			/// d�but partie alert
		Alert dialog = new Alert(AlertType.INFORMATION);
		dialog.setTitle("ISIKA");
		dialog.setHeaderText("Centre Formation du Numerique.");
		dialog.setContentText("sika, �cole sp�cialis�e en formation et reconversion vers les m�tiers "
				+ "du d�veloppement informatique propose des formations  intensives et � distance "
				+ "accessibles aux d�butants � partir de Bac+3/4 et des formations de sp�cialisation destin�es "
				+ "aux entreprises et aux particuliers informaticien(ne)s confirm�(e)s.\n" +
		"(Avec 30 ans d'exp�rience et plus de 6000 carri�res lanc�es dans le num�rique, Isika met � profit ses connaissances appronfondies du march� pour "
		+ "proposer des formations compl�tes est adapt�es aux besoins des entreprises.)");
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
