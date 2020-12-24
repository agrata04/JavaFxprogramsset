package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.shape.VertexFormat;
import javafx.stage.Stage;

public class MyMesh extends Application {

	@Override
	public void start(Stage stage1) throws Exception {
		// TODO Auto-generated method stub
		
		TriangleMesh mesh = new TriangleMesh();
		
		mesh.setVertexFormat(VertexFormat.POINT_TEXCOORD);
		
		
		mesh.getPoints().addAll(0.1f,10.0f,20.0f,30.0f);
		
		Group g = new Group();
		
		Scene scene = new Scene(g,600,600);
		
		//scene.setCamera();
		scene.setFill(Color.RED);
		
		stage1.setScene(scene);
		
		stage1.setTitle("my mesh");
		
		stage1.show();
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       launch(args);
	}

}
