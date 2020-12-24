package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SignUp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		
		Text t1 = new Text("Sign Up");
		t1.setX(50);
		t1.setY(50);
		
		
		Text name = new Text("Name");
		name.setX(50);
		name.setY(100);
		
		
		TextField namefield = new TextField();
		
		namefield.setLayoutX(50);
		namefield.setLayoutY(150);
		
		
		Text email = new Text("Email");
		t1.setX(50);
		t1.setY(200);
		
		
		TextField emailfield = new TextField();
		emailfield.setLayoutX(50);
		emailfield.setLayoutY(250);
		
		
		Text password = new Text("Password");
		t1.setX(50);
		t1.setY(300);
		
		
		PasswordField pass = new PasswordField();
		pass.setLayoutX(50);
		pass.setLayoutY(350);
		
		
		Text cpassword = new Text("confirm password");
		
		t1.setX(50);
		t1.setY(400);
		
		
		PasswordField cpass = new PasswordField();
		cpass.setLayoutX(50);
		cpass.setLayoutY(150);
		
		Group root = new Group();
		
		ObservableList<Node> list = root.getChildren();
	//	list.addAll(t1,name,namefield,email,emailfield,password,pass,cpassword,cpass);
		
		list.add(t1);
		list.add(name);
		list.add(namefield);
		list.add(email);
		list.add(emailfield);
		list.add(password);
		list.add(pass);
		list.add(cpassword);
		list.add(cpass);
		
		
		Scene scene = new Scene(root,600,600);
		
		stage.setScene(scene);
		stage.setTitle("Sign Up Form");
		
		stage.show();
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       launch(args);
	}

}
