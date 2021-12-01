package application;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class SampleController {
	
	private int contador = 0;
	
	@FXML public Button inicio;
	
	@FXML public Button boton01;
	
	@FXML public Button boton05;
	
	@FXML public Button boton10;
	
	@FXML public Button fin;
	
	@FXML private Text avisos;
	
	@FXML public Text abejas;
	
	@FXML public ImageView panalInicio;
	
	@FXML public Image imagen1;
	
	public void initialize() {
		manejoAbejas();
	}
	
	//método para el evento onClick del panal inicio
	public void startButtonClicked() {
		avisos.setText(null);
		contador += 1;
		inicio.setDisable(true);
		manejoAbejas();
	}
	
	//método para el evento onClick del panal 01
	public void button01Clicked() {
		if (contador == 2) {
			avisos.setText(null);
			contador += 1;
			boton01.setDisable(true);
			manejoAbejas();
		} else {
			avisos.setText("Opción incorrecta.");
		}
	}
	
	//método para el evento onClick del panal 05
	public void button05Clicked() {
		if (contador == 1) {
			avisos.setText(null);
			contador += 1;
			boton05.setDisable(true);
			manejoAbejas();
		} else {
			avisos.setText("Opción incorrecta.");
		}
	}
	
	//método para el evento onClick del panal 10
	public void button10Clicked() {
		if (contador == 3) {
			avisos.setText(null);
			contador += 1;
			boton10.setDisable(true);
			manejoAbejas();
		} else {
			avisos.setText("Opción incorrecta.");
		}
	}
	
	//método para el evento onClick del panal final
	public void finalButtonClicked() {
		if (contador == 4) {
			avisos.setText("Muy bien!");
			fin.setDisable(true);
			contador = 0;
			manejoAbejas();
		} else {
			avisos.setText("Opción incorrecta.");
		}
	}
	
	//método para mostrar asteriscos en pantalla por el momento son las abejas que se deben contar
	public void manejoAbejas() {
		if (contador == 0) {
			abejas.setText(null);
		} else if (contador == 1){
			abejas.setText("*****");
		} else if (contador == 2){
			abejas.setText("*");
		} else if (contador == 3){
			abejas.setText("**********");
		} else if (contador == 4){
			abejas.setText("********");
		}
	}
	
}
