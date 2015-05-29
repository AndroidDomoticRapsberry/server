package application.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import application.Main;
import application.initServer;

public class ServerOverviewController {

	@FXML
	private Label estado;
	
	private static boolean apagar = false;
	
	public static boolean isApagar() {
		return apagar;
	}

	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}

	public void initialize(){
		
	}
	
	public ServerOverviewController() {
	}

	
	@FXML
	private void btnApagar(){
		apagar=false;
		
	}
	
	@FXML
	private void btnEncender(){
		System.out.println("HOLA");
	}
	
}
