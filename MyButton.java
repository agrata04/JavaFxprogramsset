package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyButton extends Application {

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Button submit = new Button("Submit");
		submit.setLayoutX(200);
		submit.setLayoutY(200);
		
		
		Group root = new Group();
		
		ObservableList<Node> list = root.getChildren();
		
		list.add(submit);
		
		Scene scene = new Scene(root,600,600);
		
		stage.setScene(scene);
		stage.setTitle("My submit button");
		stage.show();
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         launch(args);
         
	}
	
	

}
