package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyRectange extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		r.setX(50);
		r.setY(50);
		r.setWidth(200);
		r.setHeight(100);
		//r.setArcHeight(20);
		//r.setWidth(20);
		
	  
	  
	  r.setFill(Color.FIREBRICK);
		
		Group root = new Group(r);
		
		//ObservableList<Node> list = root.getChildren();
		//list.add(r);
		
		Scene scene = new Scene(root,600,600);
		
		stage.setScene(scene);
		stage.setTitle("Rectangle");
		
		
		stage.show();
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
