package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Nobel_prize_quiz extends Application {

	@Override
	public void start(Stage stage1) throws Exception {
		// TODO Auto-generated method stub
		
		//Create group
		
		Group root = new Group();
		
		ObservableList<Node> list = root.getChildren();
		
		Text t1 = new Text("Who won Nobel prize for radium?");
		t1.setX(50);
		t1.setY(150);
		
		CheckBox cb1 = new CheckBox("Madam Curie");
		cb1.setLayoutX(50);
		cb1.setLayoutY(200);
		
		CheckBox cb2 = new CheckBox("Elizabeth");
		
		cb2.setLayoutX(50);
		cb2.setLayoutY(250);
		
		Button b1 = new Button("Submit");
		b1.setLayoutX(50);
		b1.setLayoutY(300);
		
		
		list.add(t1);
		list.add(cb1);
		list.add(cb2);
		
		list.add(b1);
		
		Scene scene = new Scene(root,600,600);
		
		stage1.setScene(scene);
		stage1.setTitle("Nobel Prize");
		
		stage1.show();
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
