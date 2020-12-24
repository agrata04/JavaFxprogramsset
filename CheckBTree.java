package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.stage.Stage;

public class CheckBTree extends Application {

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		CheckBoxTreeItem<String> A = new CheckBoxTreeItem<String>("A");
		CheckBoxTreeItem<String> B = new CheckBoxTreeItem<String>("B");
		CheckBoxTreeItem<String> C = new CheckBoxTreeItem<String>("C");
		CheckBoxTreeItem<String> D = new CheckBoxTreeItem<String>("D");
		CheckBoxTreeItem<String> E = new CheckBoxTreeItem<String>("E");
		CheckBoxTreeItem<String> F = new CheckBoxTreeItem<String>("F");
		
		CheckBoxTreeItem<String> Aroot = new CheckBoxTreeItem<String>("Parent");
		
		Aroot.setExpanded(true);
		Aroot.getChildren().addAll(A,B,C,D,E,F);
		
		
		
		final TreeView<String>  tree = new TreeView<String>();
		tree.setRoot(Aroot);
		
		tree.setCellFactory(CheckBoxTreeCell.<String>forTreeView());

		Scene scene = new Scene(tree,600,600);
		
		stage.setScene(scene);
		stage.setTitle("Tree view");
		
		stage.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
