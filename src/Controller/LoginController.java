package Controller;

import java.io.IOException;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController implements Initializable {
	@FXML
	private CheckBox remember;

	@FXML
	private PasswordField password;

	@FXML
	private ImageView progress;

	@FXML
	private Button login;

	@FXML
	private Button signup;

	@FXML
	private TextField username;

	@FXML
	private Button forgotpassword;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		progress.setVisible(false);
		username.setStyle(
				"-fx-text-fill: #a0a2ab; -fx-background-color: #2D344B; -fx-border-color: #2D344B #2D344B #a0a2ab #2D344B");
		password.setStyle(
				"-fx-text-fill: #a0a2ab; -fx-background-color: #2D344B; -fx-border-color: #2D344B #2D344B #a0a2ab #2D344B");

	}

	@FXML
	public void loginAction(ActionEvent event) {
		progress.setVisible(true);
		PauseTransition pt = new PauseTransition();
		pt.setDuration(Duration.seconds(3));
		pt.setOnFinished(e -> {
			System.out.println("Login Succesfully");
		});
		pt.play();
	}

	@FXML
	public void signUP(ActionEvent event) {
		login.getScene().getWindow().hide();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Sign_UP.fxml"));
		try {
			Stage signup = new Stage();
			Parent root = loader.load();
			Scene scene = new Scene(root);
			signup.setScene(scene);
			signup.show();
			signup.setResizable(false);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
