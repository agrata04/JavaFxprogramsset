package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

public class AccortionDemo extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		TitledPane t1 = new TitledPane("My stuff",new Button("Explore"));
		
		Accordion accordion = new Accordion();
		
		accordion.getPanes().add(t1);
		
		Scene scene = new Scene(accordion,600,600);
		stage.setScene(scene);
		stage.setTitle("Explore my stuff");
		stage.show();
		
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
