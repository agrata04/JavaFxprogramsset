package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class MyBox extends Application {

	@Override
	public void start(Stage stage1) throws Exception {
		// TODO Auto-generated method stub
		
		Box box = new Box(200,100,300);
		box.setLayoutX(100);
		box.setLayoutY(100);
		
		//((Object) box).setFill(Color.BLANCHEDALMOND);
		
		Group g1 = new Group(box);
		
		Scene s1 = new Scene(g1,600,600);
		s1.setFill(Color.BROWN);
		stage1.setScene(s1);
		stage1.setTitle("My Cuboid");
	
		stage1.show();
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       launch(args);
	}

}
