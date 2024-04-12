package br.com.senaisp.bauru.henrique.app;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class MinhaAppController {

	@FXML MenuItem mnItTela01;
	@FXML Button btnSalvar;
	@FXML Button btnCancelar;
	
	@FXML public void mnItTela01Act() throws IOException {
		System.out.println("Chamando tela 01");
		Tela01Main tela01 = new Tela01Main();
		Main.mainStage.setScene(tela01.getScene());
		
	}

	@FXML public void btnSalvarAct() {
		System.out.println("Salvando dados");
	}

	@FXML public void btnCancelarAct() {
		System.out.println("Cancelando dados");
	}


	
}
