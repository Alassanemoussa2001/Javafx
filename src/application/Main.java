package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static ObservableList<Produit> list = FXCollections.observableArrayList();
	public static ObservableList<Fournisseurs> listt = FXCollections.observableArrayList();
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Fournisseurs.fxml"));
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("GestiondeFournisseurs.fxml"));
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,500,550);
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			//Scene scene = new Scene(root,300,200);
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ListProducts.fxml"));
			//Scene scene = new Scene(root,675,400);
			
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ListProduits.fxml"));
			//Scene scene = new Scene(root,700,400);
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Gestion de Fournisseurs");
			//primaryStage.getIcons().add(new Image("C:\\Users\\amine\\Desktop\\Doc_Java_Fx\\Pharmacie-logo.jpg"));
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Oups un probl�me");
		}
	}
	
	public static void main(String[] args) {

		launch(args);
	}
}
