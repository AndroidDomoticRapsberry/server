package application;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import application.modelo.User;
import application.modelo.UserListWrapper;

public class JAXB {

public static ObservableList<User> userdata = FXCollections.observableArrayList();
	

	public static  ObservableList<User> getUserdata() {
		return userdata;
	}
	
	/**
	 * Marshall
	 * Convierte Objetos a XML.
	 */
	public static void JAXBmarshall(){
		try {

			File file = new File("file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(
					UserListWrapper.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();


			jaxbMarshaller.setProperty(Marshaller.
					JAXB_FORMATTED_OUTPUT, true);

			UserListWrapper user = new UserListWrapper();
			user.setUsers(userdata);

			jaxbMarshaller.marshal(user, file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}


	/**
	 * Unmarshall
	 * Convierte XML a Objetos.
	 * @return
	 */
	public static  void JAXBunmarshall(File file){
		try {


			JAXBContext jaxbContext = JAXBContext.newInstance(
					UserListWrapper.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			UserListWrapper user = (UserListWrapper) jaxbUnmarshaller.
					unmarshal(file);

			userdata.clear();
			userdata.addAll(user.getUser());

		} catch (JAXBException e) {
			
		}
	}
}
