import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// Se crea la escena
		Group root = new Group();
		Scene scene = new Scene(root, 400, 300);

		// Creamos los elementos
		Button button = new Button("BOTON INACTIVO");
		Polygon penta = new Polygon();
		penta.getPoints().addAll(new Double[] { 
				260., 60., 
				350., 130., 
				315., 240., 
				200., 240., 
				165., 130. 
				});
		Label label = new Label("Esto es una etiqueta");

		// Posicionamos los elementos
		button.setLayoutX(40);
		button.setLayoutY(60);
		label.setLayoutX(45);
		label.setLayoutY(190);

		// Añadimos los elementos a la escena
		root.getChildren().add(button);
		root.getChildren().add(penta);
		root.getChildren().add(label);

		// Se añade la escena al escenario
		stage.setTitle("Mi aplicación");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
