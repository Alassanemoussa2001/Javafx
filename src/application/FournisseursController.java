package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.TableView;

public class FournisseursController implements Initializable {

	
	ArrayList<Fournisseurs> fournisseurs = new ArrayList<>();
	@FXML
	private Label nom1;

	@FXML
	private Label adresse1;

	@FXML
	private Label telephone2;

	@FXML
	private Label email2;

	@FXML
	private TextField nom;

	@FXML
	private TextField adresse;

	@FXML
	private TextField email;

	@FXML
	private TextField telephone;

	@FXML
	private Button btnadd;

	@FXML
	private TableView<Produit> tblFournisseurs;


		


	@FXML
		private void handleAddAction(ActionEvent e) throws IOException
		{
			Stage primaryStage = (Stage) btnadd.getScene().getWindow();
		
			BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("GestiondeFournisseurs.fxml"));
			Scene sceneList = new Scene(layoutAddProduct,500,550);
			sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(sceneList);
			Fournisseurs fournisseur = new Fournisseurs(nom.getText(),adresse.getText(),telephone.getText(),email.getText().toString());
			Main.listt.add(fournisseur);
			
		}
	
	
	
	@FXML
	private void handleMenuListAction(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnadd.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("GestiondeFournisseurs.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,500,550);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
		
	}
	@FXML
	private void handleMenuAF(ActionEvent e)
	{
			/// début partie alert
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Finance");
			alert.setHeaderText(null);
			alert.setContentText("en Cours de constructions");

			alert.showAndWait();
			/// fin partie alert
		
	}

	
	@FXML
	private void handleeeeeeAdd(ActionEvent e) throws IOException {
		Stage primaryStage = (Stage) tblFournisseurs.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane) FXMLLoader.load(getClass().getResource("Fournisseurs.fxml"));
		Scene sceneList = new Scene(layoutAddProduct, 500, 550);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);

	}

	@FXML
	private void handleListProduitAction(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnadd.getScene().getWindow();
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


		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
		
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