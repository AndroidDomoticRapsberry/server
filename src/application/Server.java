package application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


class Server extends Thread{
	
	private Socket socket;

	public Server(Socket socket) {
		this.socket = socket;
	}
	
	
	@Override
	public void run (){
		System.out.println("Conexión Realizada");
	
  
     	    
	}
	
}
