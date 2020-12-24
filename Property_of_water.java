package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Property_of_water extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Text t = new Text("Check the property of water");
		t.setX(50);
		t.setY(50);;
		//Label label = new Label();
		Text t1 = new Text();
		t1.setX(50);
		t1.setY(200);
		
		Slider slider = new Slider(0,10,0.5);
		slider.setLayoutX(50);
		slider.setLayoutY(100);
		
		
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		
		slider.setMajorTickUnit(5);
		
		slider.setBlockIncrement(1);
		
		slider.valueProperty().addListener( new ChangeListener<Number>() {
			
			

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				
				//int number = Integer.parseInt(arg2);
				if(arg2.intValue() == 7) {
					//pure water
					t1.setText("Pure water");
				}
				else if(arg2.intValue() > 7) {
					//alkaline
					
					t1.setText("alkaline");
				}else if(arg2.intValue()<7) {
					
					//acidic
					t1.setText("Acidic");
					
				}
				
				
			}
			
		});
		
		Group root = new Group();
		
		ObservableList<Node> list = root.getChildren();
		
		list.add(t);
		list.add(slider);
		list.add(t1);
		
		Scene scene =new Scene(root,600,600);
		
		stage.setScene(scene);
		stage.setTitle("Property of water");
		
		stage.show();
		
		
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
