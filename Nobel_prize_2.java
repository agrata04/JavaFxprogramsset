package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Nobel_prize_2 extends Application {

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage stage1) throws Exception {
		// TODO Auto-generated method stub
		
     Group root = new Group();
     
     Text t1 = new Text("Who won nobel prize for Radium?");
     
     t1.setX(50);
     t1.setY(100);
     
     ToggleGroup tgb = new ToggleGroup();
     
     RadioButton rb1 = new RadioButton("Madam Curie");
     rb1.setToggleGroup(tgb);
     
     rb1.setLayoutX(50);
     rb1.setLayoutY(150);
     
     RadioButton rb2 = new RadioButton("Elizabeth");
     rb1.setToggleGroup(tgb);
     
     rb2.setLayoutX(50);
     rb2.setLayoutY(200);
     
     Button b1 = new Button("Submit");
     b1.setLayoutX(50);
     b1.setLayoutY(250);
     
     //b1.setId("b1");
     
    /* b1.setOnAction(new EventHandler() {
    	 

		@Override
		public void handle(Event event) {
			// TODO Auto-generated method stub
			
		}
     });
     */
    
     
     
     ObservableList<Node> list = root.getChildren();
     list.add(t1);
     list.add(rb1);
     list.add(rb2);
     list.add(b1);
     
     Scene scene = new Scene(root,600,600);
     
     stage1.setScene(scene);
     stage1.setTitle("Nobel Prize quiz");
     stage1.show();
     
     
     

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          launch(args);
	}

}
