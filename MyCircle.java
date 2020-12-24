package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyCircle extends Application {

	@Override
	public void start(Stage stage1) throws Exception {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle();
		
		circle.setCenterX(100.0f);
		circle.setCenterY(100.0f);
		
		circle.setRadius(50.0f);
		circle.setFill(Color.RED);
		
		Group group = new Group(circle);
		
		Scene s1 = new Scene(group,600,600);
		
		stage1.setScene(s1);
		stage1.setTitle("circle");
		
		stage1.show();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
