package br.senaisp.bauru.henrique.licao09.exemplo02;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AplicacaoJavaFX extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
             //Criar o nó raiz ou cantainer principal
		Group root = new Group ();
		//Criar componentes da tela
		criarComponentes(root);
		//Criando a Scene e configurando a janela
		Scene scena = new Scene (root,600,400,Color.WHITE);
		primeiraStage.setTitle("Java FX");
		primeiraStage.setScene(scena);
		primeiraStage.show();
		
	}

	private void criarComponentes(Group root) {
        HBox hbox = new HBox() ;
        //Criando os botoes 
        Button btn01 = new Button("Olá Mundo!");
        Button btn02 = new Button("222");
        Button btn03 = new Button("33333");
        //Ajustando os tamanhos dos botoes
        HBox.setHgrow(btn01, Priority.ALWAYS);
        HBox.setHgrow(btn02, Priority.ALWAYS);
        HBox.setHgrow(btn03, Priority.ALWAYS);
        //indicando o maximo que pode ajustar
        btn01.setMaxWidth(Double.MAX_VALUE);
        btn02.setMaxWidth(Double.MAX_VALUE);
        btn03.setMaxWidth(Double.MAX_VALUE);
        
        
        //Adicionando botoes no Hbox
        hbox.getChildren() .addAll(btn01,btn02,btn03);
        //dimensionando o hbox
        hbox.setPrefWidth(600);
        //adicionando o hbox ao nó root
        root.getChildren().addAll(hbox);
        //posicionando nosso hbox em uma determinada altura
        hbox.setLayoutY(300);
        //Criando o retangulo
        Rectangle rec = new Rectangle(150, 150, Color.BLUE);
        rec.setLayoutX(50);
        rec.setLayoutY(50);
        //Colocando contorno
        rec.setStroke(Color.ORANGE);
        rec.setStrokeWidth(10);
        //Adicionar o rectangle ao nó root
        root.getChildren().add(rec);
        //Adicionando o texto
        Text txt = new Text ("Dorme 6:\n200");
        txt.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        txt.setFill(Color.RED);
        txt.setLayoutX(250);
        txt.setLayoutY(100);
        txt.setStroke(Color.BLACK);
        txt.setStrokeWidth(5);
        txt.setStrokeType(StrokeType.OUTSIDE);
        txt.setStrokeLineCap(StrokeLineCap.ROUND);
        txt.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Adicionando ao nó root
        root.getChildren().add(txt);
        
        	
	}

	public static void main(String[] args) {
         launch (args);
         
	}

}
