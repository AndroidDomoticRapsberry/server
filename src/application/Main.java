package application;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import application.vista.ServerOverviewController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {

	private Stage primaryStage;

	public boolean apagar = true;
	
	
	
	public boolean isApagar() {
		return apagar;
	}

	public void setApagar(boolean apagar) {
		this.apagar = apagar;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle(
					"Android Domotic Raspberry Server");

			this.primaryStage.getIcons().add(new Image("file:resources/images/LOGOFINALICONO.png"));

			initServerOverview();
			Platform.setImplicitExit(true);;

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void initServerOverview(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource(
					"vista/ServerOverview.fxml"));
			AnchorPane serverOverview = (AnchorPane) loader.load();

			Scene scene = new Scene(serverOverview);
			primaryStage.setScene(scene);
			primaryStage.show();


			ServerOverviewController controller = loader.
					getController();
			controller.setMain(this);
			
			initServer is = new initServer();
			is.start();


		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		File file = new File("file.xml");
		if (file != null){
			JAXB.JAXBunmarshall(file);
		}

		launch(args);




	}
}


