package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Spinner;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SpinnerLucky extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Text t1 = new Text();
		t1.setX(50);
		t1.setY(100);
		
		
		
		/*Spinner<?> spin = new Spinner<?>(0,1000,100,100);
		spin.setPromptText("Spin the wheel");
		spin.setLayoutX(50);
		spin.setLayoutY(150);
		
		spin.valueProperty().addListener(new ChangeListener<Number>() {
			
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				
				
			}
			
			
			
		});
		*/
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
