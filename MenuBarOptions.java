package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MenuBarOptions extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		MenuBar mb = new MenuBar();
		
		final Menu filemenu = new Menu("File");
		
		final Menu Editmenu = new Menu("Edit");
		
		final Menu optionmenu = new Menu("options");
		
		final Menu helpmenu = new Menu("Help");
		
		//add menuItems to file menu
		
		MenuItem f1 = new MenuItem("New");
		MenuItem f2 = new MenuItem("open");
		MenuItem f3 = new MenuItem("Save");
		MenuItem f4 = new MenuItem("close");
		
		filemenu.getItems().add(f1);
		filemenu.getItems().add(f2);
		filemenu.getItems().add(f3);
		filemenu.getItems().add(f4);
		
		//add menuiem to edit menu
		
		MenuItem e1 = new MenuItem("Undo");
		MenuItem e2 = new MenuItem("Redo");
		MenuItem e3 = new MenuItem("cut");
		MenuItem e4 = new MenuItem("copy");
		MenuItem e5 = new MenuItem("paste");
		MenuItem e6 = new MenuItem("select");
		
		Editmenu.getItems().add(e1);
		Editmenu.getItems().add(e2);
		Editmenu.getItems().add(e3);
		Editmenu.getItems().add(e4);
		Editmenu.getItems().add(e5);
		Editmenu.getItems().add(e6);
		
		
		//add menuitem to option menu
		
		MenuItem o1 = new MenuItem("Font");
		
		//adding checkmenuitem
		
		CheckMenuItem check = new CheckMenuItem("Install live updates");
		optionmenu.getItems().add(o1);
		optionmenu.getItems().add(check);
		
		// add menu item to help
		
		MenuItem h1 = new MenuItem("Help");
		
		//adding radiomenuitem
		
		RadioMenuItem radio = new RadioMenuItem("Enable editing");
		
		helpmenu.getItems().add(h1);
		helpmenu.getItems().add(radio);
		
		
		mb.getMenus().add(filemenu);
		mb.getMenus().add(Editmenu);
		mb.getMenus().add(optionmenu);
		mb.getMenus().add(helpmenu);
		
		double width = stage.getWidth();
		double height = stage.getHeight();
		
		
		//text area
		TextArea area = new TextArea();
		
		area.setLayoutX(0);
		area.setLayoutY(25);
		//area.setPrefSize(width,height);
		
		
		Group root = new Group();
		
		
		ObservableList<Node> list = root.getChildren();
		list.add(mb);
		list.add(area);
		
		Scene scene = new Scene(root,width,height);
		
		stage.setScene(scene);
		stage.setTitle("Word processor project");
		
		
		
		
		
		stage.show();
		
		
		
		
		
		
		
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       launch(args);
	}

}
