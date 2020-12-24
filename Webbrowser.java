package application;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Pagination;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Webbrowser extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		//create pagination
		
		Pagination pagination = new Pagination(10,0);
		
		String[] myUrls = new String[10];
		
		myUrls[0] = "www.google.com";
		myUrls[1] = "www.facebook.com";
		myUrls[2] = "www.apache.org";
		myUrls[3] = "www.en.wikipedia.org";
		myUrls[4] = "https://myeducationtech.com";
		myUrls[5] = "https://product365day.com";
		myUrls[6] = "www.yahoo.com";
		myUrls[7] = "www.microsoft.com";
		myUrls[8] = "www.ibm.com";
		myUrls[9] = "www.hostinger.com";
		
		pagination.setPageFactory(new Callback<Integer,Node>(){
			
			public Node call(Integer pageIndex) {
				
				VBox box = new VBox(5);
				
				for(int i=0;i<pageIndex+10;i++) {
					
					Hyperlink link = new Hyperlink(myUrls[i]);
					
					
				}
				return box;
			}
		});
		
		Scene scene = new Scene(pagination,600,600);
		
		stage.setScene(scene);
		stage.setTitle("Browse and pagniation");
		
		stage.show();
		
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       launch(args);
       }

}
