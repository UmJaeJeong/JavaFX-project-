package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SingupController implements Initializable {
	@FXML
	private TextField password;

	@FXML
	private TextField name;

	@FXML
	private ImageView progress;

	@FXML
	private AnchorPane parentPane;

	@FXML
	private ToggleGroup genders;

	@FXML
	private TextField location;

	@FXML
	private RadioButton female;

	@FXML
	private Button login;
	@FXML
	private Button signup;
	@FXML
	private RadioButton male;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		progress.setVisible(false);

		name.setStyle(
				"-fx-text-fill: #a0a2ab; -fx-background-color: #2D344B; -fx-border-color: #2D344B #2D344B #a0a2ab #2D344B");
		password.setStyle(
				"-fx-text-fill: #a0a2ab; -fx-background-color: #2D344B; -fx-border-color: #2D344B #2D344B #a0a2ab #2D344B");
		this.location.setStyle(
				"-fx-text-fill: #a0a2ab; -fx-background-color: #2D344B; -fx-border-color: #2D344B #2D344B #a0a2ab #2D344B");
	}

	@FXML
	public void signUP(ActionEvent event) {
		progress.setVisible(true);
		PauseTransition pt = new PauseTransition();
		pt.setDuration(Duration.seconds(3));
		pt.setOnFinished(e -> {
			System.out.println("Sign_UP Sucessfull");
		});
		pt.play();
	}

	@FXML
	public void loginAction(ActionEvent event) throws Exception {
		signup.getScene().getWindow().hide();
		Stage login = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		Scene scene = new Scene(root);
		login.setScene(scene);
		login.show();
		login.setResizable(false);
	}
}
