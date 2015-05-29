package application;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import application.vista.ServerOverviewController;

public class initServer extends Thread{
	boolean Apagar = true;
	public initServer(){
	
	}
	
	@Override
	public void run(){

		try( ServerSocket serverSocket = new ServerSocket(9999)
				){
					System.out.println("Server ON");
					while (true){
						Socket socket = serverSocket.accept();
						new Server(socket).start();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};

	}
}
