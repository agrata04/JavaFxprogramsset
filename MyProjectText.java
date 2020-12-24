package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyProjectText extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Text text = new Text();
		text.setFont(new Font(45));
		
		text.setX(50);
		text.setY(150);
		
		text.setText("My Name is Agrata");
		
		Group root = new Group();
		
		ObservableList<Node> list = root.getChildren();
		
		list.add(text);
		
		Scene scene = new Scene(root,600,600);
		
		stage.setTitle("Hello!");
		
		stage.setScene(scene);
		
		stage.show();
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
