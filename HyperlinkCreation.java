package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HyperlinkCreation extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		String myurl = "www.google.com";
		
		Hyperlink link = new Hyperlink(myurl);
		
		link.setText("Browse Google");
		
		String url2 = "www.wikipedia.com";
		
		Hyperlink link2 = new Hyperlink(url2);
		
		link2.setText("Browse wikipedia");
		
		VBox box = new VBox(5);
		box.getChildren().addAll(link,link2);
		
		Scene scene = new Scene(box,600,600);
		
		stage.setScene(scene);
		stage.setTitle("Browse web now");
		
		stage.show();
		
		
		
		
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
