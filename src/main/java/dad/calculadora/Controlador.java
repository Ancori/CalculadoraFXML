package dad.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controlador implements Initializable {
	Calculadora calc = new Calculadora();
	// model
	Model modelo = new Model();
	// Vista
	@FXML
	private GridPane vista;

	@FXML
	private TextField operacion;

	@FXML
	private Button b7;

	@FXML
	private Button b4;

	@FXML
	private Button b1;

	@FXML
	private Button b0;

	@FXML
	private Button b8;

	@FXML
	private Button b5;

	@FXML
	private Button b2;

	@FXML
	private Button b9;

	@FXML
	private Button b6;

	@FXML
	private Button b3;

	@FXML
	private Button bcoma;

	@FXML
	private Button bce;

	@FXML
	private Button bmultiplicar;

	@FXML
	private Button brestar;

	@FXML
	private Button bsumar;

	@FXML
	private Button bc;

	@FXML
	private Button bdivision;

	@FXML
	private Button bigual;

	public Controlador() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		operacion.textProperty().bind(modelo.resultadoProperty());
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onb0(ActionEvent event) {
		calc.insertar('0');
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onb1(ActionEvent event) {
		calc.insertar('1');
		modelo.setResultado(calc.getPantalla());

	}

	@FXML
	void onb2(ActionEvent event) {
		calc.insertar('2');
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onb3(ActionEvent event) {
		calc.insertar('3');
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onb4(ActionEvent event) {
		calc.insertar('4');
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onb5(ActionEvent event) {
		calc.insertar('5');
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onb6(ActionEvent event) {
		calc.insertar('6');
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onb7(ActionEvent event) {
		calc.insertar('7');
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onb8(ActionEvent event) {
		calc.insertar('8');
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onb9(ActionEvent event) {
		calc.insertar('9');
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onbc(ActionEvent event) {
		calc.borrar();
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onbce(ActionEvent event) {
		calc.borrarTodo();
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onbcoma(ActionEvent event) {
		calc.insertarComa();
		modelo.setResultado(calc.getPantalla());

	}

	@FXML
	void onbdivision(ActionEvent event) {
		calc.operar(Calculadora.DIVIDIR);
	}

	@FXML
	void onbigual(ActionEvent event) {
		calc.operar(Calculadora.IGUAL);
		modelo.setResultado(calc.getPantalla());
	}

	@FXML
	void onbmultiplicar(ActionEvent event) {
		calc.operar(Calculadora.MULTIPLICAR);
	}

	@FXML
	void onbrestar(ActionEvent event) {
		calc.operar(Calculadora.RESTAR);
	}

	@FXML
	void onbsumar(ActionEvent event) {
		calc.operar(Calculadora.SUMAR);
	}

	public GridPane getVista() {
		return vista;
	}

}
