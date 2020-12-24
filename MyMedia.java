package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class MyMedia extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		/*String source = "https://www.youtube.com/watch?v=Oldw0ruI0Cs";
		Media media = new Media(source);
		
		MediaPlayer mplayer = new MediaPlayer(media);
		mplayer.setAutoPlay(true);
		
		MediaView mview = new MediaView(mplayer);
		
		Group root = new Group();
		
		ObservableList<Node> list = root.getChildren();
		
		list.add(mview);
		
		Scene scene = new Scene(root,600,600);
		
		stage.setScene(scene);
		stage.setTitle("AVclasses");
		
		stage.show();
		*/
		 // Create and set the Scene.
	     Scene scene = new Scene(new Group(), 540, 209);
	     stage.setScene(scene);

	     // Name and display the Stage.
	     stage.setTitle("Hello Media");
	     stage.show();

	     // Create the media source.
	     String source = "https://www.youtube.com/watch?v=Oldw0ruI0Cs";
	     Media media = new Media(source);

	     // Create the player and set to play automatically.
	     MediaPlayer mediaPlayer = new MediaPlayer(media);
	     mediaPlayer.setAutoPlay(true);

	     // Create the view and add it to the Scene.
	     MediaView mediaView = new MediaView(mediaPlayer);
	     ((Group) scene.getRoot()).getChildren().add(mediaView);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          launch(args);
	}

}
