/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Louis
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Cal extends Application {
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();
	private Label lbN1 = new Label("number 1");
	private Label lbN2 = new Label("number 2");
	private Label lbResult = new Label("result");
	
	Button addButton = new Button("Add");
	Button subtractButton = new Button("Subtract");
	Button multiplyButton = new Button("Multiply");
	Button divideButton = new Button("divide");
	
	
	public void start(Stage primaryStage) {
		
		GridPane gridpane = new GridPane();
		gridpane.setHgap(5);
		gridpane.setVgap(5);
		gridpane.add(lbN1, 0, 0);
		gridpane.add(tfNumber1, 0, 1);
		gridpane.add(lbN2, 0, 2);
		gridpane.add(tfNumber2, 0, 3);
		gridpane.add(lbResult, 0, 4);
		gridpane.add(tfResult, 0, 5);
		
		gridpane.add(addButton, 1, 0);
		gridpane.add(subtractButton, 1, 1);
		gridpane.add(multiplyButton, 1, 2);
		gridpane.add(divideButton, 1, 3);
		
		gridpane.setAlignment(Pos.CENTER);
		tfNumber1.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumber2.setAlignment(Pos.BOTTOM_RIGHT);
		tfResult.setAlignment(Pos.BOTTOM_RIGHT);
		
		addButton.setOnAction(e -> addHandler());
		
		subtractButton.setOnAction(e -> subtractHandler());
		divideButton.setOnAction(e -> divideHandler());
		multiplyButton.setOnAction(e -> multiplyHandler());
		
		
		Scene scene = new Scene(gridpane, 400, 250);
		primaryStage.setTitle("calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

        public static void main(String [] args){
        Application.launch(args);
        
        }
        
        
	 private void addHandler() {
		 
		
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result = number1 + number2;
		
		tfResult.setText((String.format("$%.2f", result)));
	
	
		
	}
	
private void subtractHandler() {
		
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result = number1 - number2;
		
		tfResult.setText((String.format("$%.2f", result)));
	
	
		
	}
	
private void multiplyHandler() {
	
	double number1 = Double.parseDouble(tfNumber1.getText());
	double number2 = Double.parseDouble(tfNumber2.getText());
	double result = number1 * number2;
	
	tfResult.setText((String.format("$%.2f", result)));


	
}
	
private void divideHandler() {
	
	double number1 = Double.parseDouble(tfNumber1.getText());
	double number2 = Double.parseDouble(tfNumber2.getText());
	double result = number1 / number2;
	
	tfResult.setText((String.format("$%.2f", result)));


	
}
	
	
}
