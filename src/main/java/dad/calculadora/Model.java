package dad.calculadora;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	StringProperty resultado = new SimpleStringProperty();

	public StringProperty resultadoProperty() {
		return this.resultado;
	}
	

	public String getResultado() {
		return this.resultadoProperty().get();
	}
	

	public void setResultado(final String resultado) {
		this.resultadoProperty().set(resultado);
	}
	
	
	

}
