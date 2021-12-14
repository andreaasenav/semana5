package application;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class SampleController {

	public int contador = 0;

	public Image panelInicio = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panelInicio.png");
	public Image panel1 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel1.png");
	public Image panel2 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel2.png");
	public Image panel3 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel3.png");
	public Image panel4 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel4.png");
	public Image panel5 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel5.png");
	public Image panel6 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel6.png");
	public Image panel7 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel7.png");
	public Image panel8 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel8.png");
	public Image panel9 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel9.png");
	public Image panel10 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/panel10.png");

	public Image verdeInicio = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verdeInicio.png");
	public Image verde1 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde1.png");
	public Image verde2 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde2.png");
	public Image verde3 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde3.png");
	public Image verde4 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde4.png");
	public Image verde5 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde5.png");
	public Image verde6 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde6.png");
	public Image verde7 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde7.png");
	public Image verde8 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde8.png");
	public Image verde9 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde9.png");
	public Image verde10 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/verde10.png");

	public Image rojo1 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo1.png");
	public Image rojo2 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo2.png");
	public Image rojo3 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo3.png");
	public Image rojo4 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo4.png");
	public Image rojo5 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo5.png");
	public Image rojo6 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo6.png");
	public Image rojo7 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo7.png");
	public Image rojo8 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo8.png");
	public Image rojo9 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo9.png");
	public Image rojo10 = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/rojo10.png");

	public Image abejaIzq = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/Izq.png");
	public Image abejaDer = new Image("file:///D:/Espacio de trabajo Eclipse/prueba/src/resources/Der.png");

	@FXML
	public ImageView abeja1;
	@FXML
	public ImageView abeja2;
	@FXML
	public ImageView abeja3;
	@FXML
	public ImageView abeja4;
	@FXML
	public ImageView abeja5;
	@FXML
	public ImageView abeja6;
	@FXML
	public ImageView abeja7;
	@FXML
	public ImageView abeja8;
	@FXML
	public ImageView abeja9;
	@FXML
	public ImageView abeja10;
	
	@FXML
	public Text texto1;

	@FXML
	public Button boton1;
	@FXML
	public ImageView panal1;

	public void initialize() {
		manejoAbejas();
		manejoBotones();
	}
	
	public void Boton1() {
		if (contador == 0) {
			System.out.println("Boton1()");
			boton1.setDisable(true);
			panal1.setImage(verdeInicio);
			contador += 1;
			manejoAbejas();
			manejoBotones();
		}
	}

	@FXML
	public Button boton2;
	@FXML
	public ImageView panal2;

	public void Boton2() {
		if (contador == 1) {
			System.out.println("Boton2()");
			boton2.setDisable(true);
			panal2.setImage(verde8);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal2.setImage(rojo8);
			boton2.setDisable(true);
		}
	}

	@FXML
	public Button boton3;
	@FXML
	public ImageView panal3;

	public void Boton3() {
		if (contador == 2) {
			System.out.println("Boton3()");
			boton3.setDisable(true);
			panal3.setImage(verde9);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal3.setImage(rojo9);
			boton3.setDisable(true);
		}
	}

	@FXML
	public Button boton4;
	@FXML
	public ImageView panal4;

	public void Boton4() {
		if (contador == 7) {
			System.out.println("Boton4()");
			boton4.setDisable(true);
			panal4.setImage(verde4);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal4.setImage(rojo4);
			boton4.setDisable(true);
		}
	}

	@FXML
	public Button boton5;
	@FXML
	public ImageView panal5;

	public void Boton5() {
		if (contador == 6) {
			System.out.println("Boton5()");
			boton5.setDisable(true);
			panal5.setImage(verde2);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal5.setImage(rojo2);
			boton5.setDisable(true);
		}
	}

	@FXML
	public Button boton6;
	@FXML
	public ImageView panal6;

	public void Boton6() {
		if (contador == 3) {
			System.out.println("Boton6()");
			boton6.setDisable(true);
			panal6.setImage(verde1);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal6.setImage(rojo1);
			boton6.setDisable(true);
		}

	}

	@FXML
	public Button boton7;
	@FXML
	public ImageView panal7;

	public void Boton7() {
		if (contador == 9) {
			System.out.println("Boton7()");
			boton7.setDisable(true);
			panal7.setImage(verde1);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal7.setImage(rojo1);
			boton7.setDisable(true);
		}
	}

	@FXML
	public Button boton8;
	@FXML
	public ImageView panal8;

	public void Boton8() {
		if (contador == 8) {
			System.out.println("Boton8()");
			boton8.setDisable(true);
			panal8.setImage(verde6);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal8.setImage(rojo6);
			boton8.setDisable(true);
		}
	}

	@FXML
	public Button boton9;
	@FXML
	public ImageView panal9;

	public void Boton9() {
		if (contador == 5) {
			System.out.println("Boton9()");
			boton9.setDisable(true);
			panal9.setImage(verde5);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal9.setImage(rojo5);
			boton9.setDisable(true);
		}
	}

	@FXML
	public Button boton10;
	@FXML
	public ImageView panal10;

	public void Boton10() {
		if (contador == 4) {
			System.out.println("Boton10()");
			boton10.setDisable(true);
			panal10.setImage(verde10);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal10.setImage(rojo10);
			boton10.setDisable(true);
		}
	}

	@FXML
	public Button boton11;
	@FXML
	public ImageView panal11;

	public void Boton11() {
		System.out.println("Boton11()");
		panal11.setImage(rojo8);
		boton11.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton12;
	@FXML
	public ImageView panal12;

	public void Boton12() {
		if (contador == 10) {
			System.out.println("Boton12()");
			boton12.setDisable(true);
			panal12.setImage(verde10);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal12.setImage(rojo10);
			boton12.setDisable(true);
		}
	}

	@FXML
	public Button boton13;
	@FXML
	public ImageView panal13;

	public void Boton13() {
		if (contador == 11) {
			System.out.println("Boton13()");
			boton13.setDisable(true);
			panal13.setImage(verde3);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal13.setImage(rojo3);
			boton13.setDisable(true);
		}
	}

	@FXML
	public Button boton14;
	@FXML
	public ImageView panal14;

	public void Boton14() {
		System.out.println("Boton14()");
		panal14.setImage(rojo7);
		boton14.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton15;
	@FXML
	public ImageView panal15;

	public void Boton15() {
		System.out.println("Boton15()");
		panal15.setImage(rojo9);
		boton15.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton16;
	@FXML
	public ImageView panal16;

	public void Boton16() {
		System.out.println("Boton16()");
		panal16.setImage(rojo5);
		boton16.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton17;
	@FXML
	public ImageView panal17;

	public void Boton17() {
		System.out.println("Boton17()");
		panal17.setImage(rojo7);
		boton17.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton18;
	@FXML
	public ImageView panal18;

	public void Boton18() {
		if (contador == 13) {
			System.out.println("Boton18()");
			boton18.setDisable(true);
			panal18.setImage(verde9);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal18.setImage(rojo9);
			boton18.setDisable(true);
		}
	}

	@FXML
	public Button boton19;
	@FXML
	public ImageView panal19;

	public void Boton19() {
		if (contador == 12) {
			System.out.println("Boton19()");
			boton19.setDisable(true);
			panal19.setImage(verde8);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal19.setImage(rojo8);
			boton19.setDisable(true);
		}
	}

	@FXML
	public Button boton20;
	@FXML
	public ImageView panal20;

	public void Boton20() {
		System.out.println("Boton20()");
		panal20.setImage(rojo4);
		boton20.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton21;
	@FXML
	public ImageView panal21;

	public void Boton21() {
		System.out.println("Boton21()");
		panal21.setImage(rojo2);
		boton21.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton22;
	@FXML
	public ImageView panal22;

	public void Boton22() {
		System.out.println("Boton22()");
		panal22.setImage(rojo2);
		boton22.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton23;
	@FXML
	public ImageView panal23;

	public void Boton23() {
		System.out.println("Boton23()");
		panal23.setImage(rojo4);
		boton23.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton24;
	@FXML
	public ImageView panal24;

	public void Boton24() {
		if (contador == 14) {
			System.out.println("Boton24()");
			boton24.setDisable(true);
			panal24.setImage(verde6);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal24.setImage(rojo6);
			boton24.setDisable(true);
		}
	}

	@FXML
	public Button boton25;
	@FXML
	public ImageView panal25;

	public void Boton25() {
		System.out.println("Boton25()");
		panal25.setImage(rojo2);
		boton25.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton26;
	@FXML
	public ImageView panal26;

	public void Boton26() {
		System.out.println("Boton26()");
		panal26.setImage(rojo5);
		boton26.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton27;
	@FXML
	public ImageView panal27;

	public void Boton27() {
		System.out.println("Boton27()");
		panal27.setImage(rojo6);
		boton27.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton28;
	@FXML
	public ImageView panal28;

	public void Boton28() {
		System.out.println("Boton28()");
		panal28.setImage(rojo10);
		boton28.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton29;
	@FXML
	public ImageView panal29;

	public void Boton29() {
		System.out.println("Boton29()");
		panal29.setImage(rojo8);
		boton29.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton30;
	@FXML
	public ImageView panal30;

	public void Boton30() {
		if (contador == 15) {
			System.out.println("Boton30()");
			boton30.setDisable(true);
			panal30.setImage(verde1);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal30.setImage(rojo1);
			boton30.setDisable(true);
		}
	}

	@FXML
	public Button boton31;
	@FXML
	public ImageView panal31;

	public void Boton31() {
		if (contador == 16) {
			System.out.println("Boton31()");
			boton31.setDisable(true);
			panal31.setImage(verde3);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal31.setImage(rojo3);
			boton31.setDisable(true);
		}
	}

	@FXML
	public Button boton32;
	@FXML
	public ImageView panal32;

	public void Boton32() {
		System.out.println("Boton32()");
		panal32.setImage(rojo10);
		boton32.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton33;
	@FXML
	public ImageView panal33;

	public void Boton33() {
		System.out.println("Boton33()");
		panal33.setImage(rojo1);
		boton33.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton34;
	@FXML
	public ImageView panal34;

	public void Boton34() {
		System.out.println("Boton34()");
		panal34.setImage(rojo3);
		boton34.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton35;
	@FXML
	public ImageView panal35;

	public void Boton35() {
		System.out.println("Boton35()");
		panal35.setImage(rojo5);
		boton35.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton36;
	@FXML
	public ImageView panal36;

	public void Boton36() {
		if (contador == 17) {
			System.out.println("Boton36()");
			boton36.setDisable(true);
			panal36.setImage(verde9);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal36.setImage(rojo9);
			boton36.setDisable(true);
		}
	}

	@FXML
	public Button boton37;
	@FXML
	public ImageView panal37;

	public void Boton37() {
		if (contador == 18) {
			System.out.println("Boton37()");
			boton37.setDisable(true);
			panal37.setImage(verde7);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal37.setImage(rojo7);
			boton37.setDisable(true);
		}
	}

	@FXML
	public Button boton38;
	@FXML
	public ImageView panal38;

	public void Boton38() {
		System.out.println("Boton38()");
		panal38.setImage(rojo8);
		boton38.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton39;
	@FXML
	public ImageView panal39;

	public void Boton39() {
		System.out.println("Boton39()");
		panal39.setImage(rojo9);
		boton39.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton40;
	@FXML
	public ImageView panal40;

	public void Boton40() {
		System.out.println("Boton40()");
		panal40.setImage(rojo4);
		boton40.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton41;
	@FXML
	public ImageView panal41;

	public void Boton41() {
		if (contador == 20) {
			System.out.println("Boton41()");
			boton41.setDisable(true);
			panal41.setImage(verde2);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal41.setImage(rojo2);
			boton41.setDisable(true);
		}
	}

	@FXML
	public Button boton42;
	@FXML
	public ImageView panal42;

	public void Boton42() {
		if (contador == 19) {
			System.out.println("Boton42()");
			boton42.setDisable(true);
			panal42.setImage(verde5);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal42.setImage(rojo5);
			boton42.setDisable(true);
		}
	}

	@FXML
	public Button boton43;
	@FXML
	public ImageView panal43;

	public void Boton43() {
		System.out.println("Boton43()");
		panal43.setImage(rojo6);
		boton43.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton44;
	@FXML
	public ImageView panal44;

	public void Boton44() {
		if (contador == 21) {
			System.out.println("Boton44()");
			boton44.setDisable(true);
			panal44.setImage(verde3);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal44.setImage(rojo3);
			boton44.setDisable(true);
		}
	}

	@FXML
	public Button boton45;
	@FXML
	public ImageView panal45;

	public void Boton45() {
		if (contador == 22) {
			System.out.println("Boton45()");
			boton45.setDisable(true);
			panal45.setImage(verde1);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal45.setImage(rojo1);
			boton45.setDisable(true);
		}
	}

	@FXML
	public Button boton46;
	@FXML
	public ImageView panal46;

	public void Boton46() {
		if (contador == 23) {
			System.out.println("Boton46()");
			boton46.setDisable(true);
			panal46.setImage(verde10);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal46.setImage(rojo10);
			boton46.setDisable(true);
		}
	}

	@FXML
	public Button boton47;
	@FXML
	public ImageView panal47;

	public void Boton47() {
		System.out.println("Boton47()");
		panal47.setImage(rojo7);
		boton47.setDisable(true);
	//	contador += 1;
	}

	@FXML
	public Button boton48;
	@FXML
	public ImageView panal48;

	public void Boton48() {
		if (contador == 24) {
			System.out.println("Boton48()");
			boton48.setDisable(true);
			panal48.setImage(verde9);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
		} else {
			panal48.setImage(rojo9);
			boton48.setDisable(true);
		}
	}

	@FXML
	public Button boton49;
	@FXML
	public ImageView panal49;

	public void Boton49() {
		if (contador == 25) {
			System.out.println("Boton49()");
			boton49.setDisable(true);
			panal49.setImage(verde8);
			contador += 1;
			panalesAmarillos();
			manejoAbejas();
			texto1.setText("Buen trabajo!");
		} else {
			panal49.setImage(rojo8);
			boton49.setDisable(true);
		}
	}

	public void panalesAmarillos() {
		if (panal2.getImage() == rojo8) {
			panal2.setImage(panel8);
			boton2.setDisable(false);
		}
		if (panal3.getImage() == rojo9) {
			panal3.setImage(panel9);
			boton3.setDisable(false);
		}
		if (panal4.getImage() == rojo4) {
			panal4.setImage(panel4);
			boton4.setDisable(false);
		}
		if (panal5.getImage() == rojo2) {
			panal5.setImage(panel2);
			boton5.setDisable(false);
		}
		if (panal6.getImage() == rojo1) {
			panal6.setImage(panel1);
			boton6.setDisable(false);
		}
		if (panal7.getImage() == rojo1) {
			panal7.setImage(panel1);
			boton7.setDisable(false);
		}
		if (panal8.getImage() == rojo6) {
			panal8.setImage(panel6);
			boton8.setDisable(false);
		}
		if (panal9.getImage() == rojo5) {
			panal9.setImage(panel5);
			boton9.setDisable(false);
		}
		if (panal10.getImage() == rojo10) {
			panal10.setImage(panel10);
			boton10.setDisable(false);
		}
		if (panal11.getImage() == rojo8) {
			panal11.setImage(panel8);
			boton11.setDisable(false);
		}
		if (panal12.getImage() == rojo10) {
			panal12.setImage(panel10);
			boton12.setDisable(false);
		}
		if (panal13.getImage() == rojo3) {
			panal13.setImage(panel3);
			boton13.setDisable(false);
		}
		if (panal14.getImage() == rojo7) {
			panal14.setImage(panel7);
			boton14.setDisable(false);
		}
		if (panal15.getImage() == rojo9) {
			panal15.setImage(panel9);
			boton15.setDisable(false);
		}
		if (panal16.getImage() == rojo5) {
			panal16.setImage(panel5);
			boton16.setDisable(false);
		}
		if (panal17.getImage() == rojo7) {
			panal17.setImage(panel7);
			boton17.setDisable(false);
		}
		if (panal18.getImage() == rojo9) {
			panal18.setImage(panel9);
			boton18.setDisable(false);
		}
		if (panal19.getImage() == rojo8) {
			panal19.setImage(panel8);
			boton19.setDisable(false);
		}
		if (panal20.getImage() == rojo4) {
			panal20.setImage(panel4);
			boton20.setDisable(false);
		}
		if (panal21.getImage() == rojo2) {
			panal21.setImage(panel2);
			boton21.setDisable(false);
		}
		if (panal22.getImage() == rojo2) {
			panal22.setImage(panel2);
			boton22.setDisable(false);
		}
		if (panal23.getImage() == rojo4) {
			panal23.setImage(panel4);
			boton23.setDisable(false);
		}
		if (panal24.getImage() == rojo6) {
			panal24.setImage(panel6);
			boton24.setDisable(false);
		}
		if (panal25.getImage() == rojo2) {
			panal25.setImage(panel2);
			boton25.setDisable(false);
		}
		if (panal26.getImage() == rojo5) {
			panal26.setImage(panel5);
			boton26.setDisable(false);
		}
		if (panal27.getImage() == rojo6) {
			panal27.setImage(panel6);
			boton27.setDisable(false);
		}
		if (panal28.getImage() == rojo10) {
			panal28.setImage(panel10);
			boton28.setDisable(false);
		}
		if (panal29.getImage() == rojo8) {
			panal29.setImage(panel8);
			boton29.setDisable(false);
		}
		if (panal30.getImage() == rojo1) {
			panal30.setImage(panel1);
			boton30.setDisable(false);
		}
		if (panal31.getImage() == rojo3) {
			panal31.setImage(panel3);
			boton31.setDisable(false);
		}
		if (panal32.getImage() == rojo10) {
			panal32.setImage(panel10);
			boton32.setDisable(false);
		}
		if (panal33.getImage() == rojo1) {
			panal33.setImage(panel1);
			boton33.setDisable(false);
		}
		if (panal34.getImage() == rojo3) {
			panal34.setImage(panel3);
			boton34.setDisable(false);
		}
		if (panal35.getImage() == rojo5) {
			panal35.setImage(panel5);
			boton35.setDisable(false);
		}
		if (panal36.getImage() == rojo9) {
			panal36.setImage(panel9);
			boton36.setDisable(false);
		}
		if (panal37.getImage() == rojo7) {
			panal37.setImage(panel7);
			boton37.setDisable(false);
		}
		if (panal38.getImage() == rojo8) {
			panal38.setImage(panel8);
			boton38.setDisable(false);
		}
		if (panal39.getImage() == rojo9) {
			panal39.setImage(panel9);
			boton39.setDisable(false);
		}
		if (panal40.getImage() == rojo4) {
			panal40.setImage(panel4);
			boton40.setDisable(false);
		}
		if (panal41.getImage() == rojo2) {
			panal41.setImage(panel2);
			boton41.setDisable(false);
		}
		if (panal42.getImage() == rojo5) {
			panal42.setImage(panel5);
			boton42.setDisable(false);
		}
		if (panal43.getImage() == rojo6) {
			panal43.setImage(panel6);
			boton43.setDisable(false);
		}
		if (panal44.getImage() == rojo3) {
			panal44.setImage(panel3);
			boton44.setDisable(false);
		}
		if (panal45.getImage() == rojo1) {
			panal45.setImage(panel1);
			boton45.setDisable(false);
		}
		if (panal46.getImage() == rojo10) {
			panal46.setImage(panel10);
			boton46.setDisable(false);
		}
		if (panal47.getImage() == rojo7) {
			panal47.setImage(panel7);
			boton47.setDisable(false);
		}
		if (panal48.getImage() == rojo9) {
			panal48.setImage(panel9);
			boton48.setDisable(false);
		}
		if (panal49.getImage() == rojo8) {
			panal49.setImage(panel8);
			boton49.setDisable(false);
		}
	}

	public void manejoAbejas() {
		if (contador == 0) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(null);
			abeja4.setImage(null);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(null);
			abeja9.setImage(null);
			abeja10.setImage(null);
		}
		if (contador == 1) {
			abeja1.setImage(null);
			abeja2.setImage(abejaDer);
			abeja3.setImage(abejaDer);
			abeja4.setImage(null);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		}
		if (contador == 2) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(abejaDer);
			abeja3.setImage(null);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 3) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(abejaDer);
			abeja4.setImage(null);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(null);
			abeja9.setImage(null);
			abeja10.setImage(null);
		}
		if (contador == 4) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(abejaDer);
			abeja3.setImage(abejaDer);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 5) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(abejaDer);
			abeja3.setImage(abejaDer);
			abeja4.setImage(null);
			abeja5.setImage(null);
			abeja6.setImage(abejaDer);
			abeja7.setImage(null);
			abeja8.setImage(null);
			abeja9.setImage(null);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 6) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(null);
			abeja4.setImage(null);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(null);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 7) {
			abeja1.setImage(null);
			abeja2.setImage(abejaDer);
			abeja3.setImage(null);
			abeja4.setImage(null);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(null);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(null);
			abeja9.setImage(abejaDer);
			abeja10.setImage(null);
		} 
		if (contador == 8) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(null);
			abeja3.setImage(abejaDer);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(null);
			abeja6.setImage(abejaDer);
			abeja7.setImage(null);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(null);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 9) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(abejaDer);
			abeja4.setImage(null);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(null);
			abeja9.setImage(null);
			abeja10.setImage(null);
		} 
		if (contador == 10) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(abejaDer);
			abeja3.setImage(abejaDer);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 11) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(null);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(null);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 12) {
			abeja1.setImage(null);
			abeja2.setImage(abejaDer);
			abeja3.setImage(abejaDer);
			abeja4.setImage(null);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 13) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(abejaDer);
			abeja3.setImage(null);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 14) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(null);
			abeja3.setImage(abejaDer);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(null);
			abeja6.setImage(abejaDer);
			abeja7.setImage(null);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(null);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 15) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(abejaDer);
			abeja4.setImage(null);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(null);
			abeja9.setImage(null);
			abeja10.setImage(null);
		} 
		if (contador == 16) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(null);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(null);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 17) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(abejaDer);
			abeja3.setImage(null);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 18) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(null);
			abeja3.setImage(abejaDer);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(null);
			abeja6.setImage(abejaDer);
			abeja7.setImage(null);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 19) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(abejaDer);
			abeja3.setImage(abejaDer);
			abeja4.setImage(null);
			abeja5.setImage(null);
			abeja6.setImage(abejaDer);
			abeja7.setImage(null);
			abeja8.setImage(null);
			abeja9.setImage(null);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 20) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(null);
			abeja4.setImage(null);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(null);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 21) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(null);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(null);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 22) {
			abeja1.setImage(null);
			abeja2.setImage(null);
			abeja3.setImage(null);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(null);
			abeja6.setImage(null);
			abeja7.setImage(null);
			abeja8.setImage(null);
			abeja9.setImage(null);
			abeja10.setImage(null);
		} 
		if (contador == 23) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(abejaDer);
			abeja3.setImage(abejaDer);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 24) {
			abeja1.setImage(abejaIzq);
			abeja2.setImage(abejaDer);
			abeja3.setImage(null);
			abeja4.setImage(abejaIzq);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
		if (contador == 25) {
			abeja1.setImage(null);
			abeja2.setImage(abejaDer);
			abeja3.setImage(abejaDer);
			abeja4.setImage(null);
			abeja5.setImage(abejaIzq);
			abeja6.setImage(abejaDer);
			abeja7.setImage(abejaIzq);
			abeja8.setImage(abejaIzq);
			abeja9.setImage(abejaDer);
			abeja10.setImage(abejaDer);
		} 
	}

	public void manejoBotones() {
		if (contador == 0) {
			boton2.setDisable(true);
			boton3.setDisable(true);
			boton4.setDisable(true);
			boton5.setDisable(true);
			boton6.setDisable(true);
			boton7.setDisable(true);
			boton8.setDisable(true);
			boton9.setDisable(true);
			boton10.setDisable(true);
			boton11.setDisable(true);
			boton12.setDisable(true);
			boton13.setDisable(true);
			boton14.setDisable(true);
			boton15.setDisable(true);
			boton16.setDisable(true);
			boton17.setDisable(true);
			boton18.setDisable(true);
			boton19.setDisable(true);
			boton20.setDisable(true);
			boton21.setDisable(true);
			boton22.setDisable(true);
			boton23.setDisable(true);
			boton24.setDisable(true);
			boton25.setDisable(true);
			boton26.setDisable(true);
			boton27.setDisable(true);
			boton28.setDisable(true);
			boton29.setDisable(true);
			boton30.setDisable(true);
			boton31.setDisable(true);
			boton32.setDisable(true);
			boton33.setDisable(true);
			boton34.setDisable(true);
			boton35.setDisable(true);
			boton36.setDisable(true);
			boton37.setDisable(true);
			boton38.setDisable(true);
			boton39.setDisable(true);
			boton40.setDisable(true);
			boton41.setDisable(true);
			boton42.setDisable(true);
			boton43.setDisable(true);
			boton44.setDisable(true);
			boton45.setDisable(true);
			boton46.setDisable(true);
			boton47.setDisable(true);
			boton48.setDisable(true);
			boton49.setDisable(true);
		}
		if (contador == 1) {
			boton2.setDisable(false);
			boton3.setDisable(false);
			boton4.setDisable(false);
			boton5.setDisable(false);
			boton6.setDisable(false);
			boton7.setDisable(false);
			boton8.setDisable(false);
			boton9.setDisable(false);
			boton10.setDisable(false);
			boton11.setDisable(false);
			boton12.setDisable(false);
			boton13.setDisable(false);
			boton14.setDisable(false);
			boton15.setDisable(false);
			boton16.setDisable(false);
			boton17.setDisable(false);
			boton18.setDisable(false);
			boton19.setDisable(false);
			boton20.setDisable(false);
			boton21.setDisable(false);
			boton22.setDisable(false);
			boton23.setDisable(false);
			boton24.setDisable(false);
			boton25.setDisable(false);
			boton26.setDisable(false);
			boton27.setDisable(false);
			boton28.setDisable(false);
			boton29.setDisable(false);
			boton30.setDisable(false);
			boton31.setDisable(false);
			boton32.setDisable(false);
			boton33.setDisable(false);
			boton34.setDisable(false);
			boton35.setDisable(false);
			boton36.setDisable(false);
			boton37.setDisable(false);
			boton38.setDisable(false);
			boton39.setDisable(false);
			boton40.setDisable(false);
			boton41.setDisable(false);
			boton42.setDisable(false);
			boton43.setDisable(false);
			boton44.setDisable(false);
			boton45.setDisable(false);
			boton46.setDisable(false);
			boton47.setDisable(false);
			boton48.setDisable(false);
			boton49.setDisable(false);
		}
	}

}
