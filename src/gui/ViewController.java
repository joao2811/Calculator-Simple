package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {

	private int num1 = 0, num2 = 0, num3 = 0, clear = 1;
	private String operador = "";
	
	@FXML
	private Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
	
	@FXML
	private Button bt_mais, bt_menos, bt_vezes, bt_por, bt_igual, bt_div;
	
	@FXML
	private Label lb1, lb2;
	
	//Numbers ===========================================//
	@FXML
	public void onBt0Action() {
		numbers("0");
	}
	@FXML
	public void onBt1Action() {
		numbers("1");
	}
	@FXML
	public void onBt2Action() {
		numbers("2");
	}
	@FXML
	public void onBt3Action() {
		numbers("3");
	}
	@FXML
	public void onBt4Action() {
		numbers("4");
	}
	@FXML
	public void onBt5Action() {
		numbers("5");	}
	@FXML
	public void onBt6Action() {
		numbers("6");
	}
	@FXML
	public void onBt7Action() {
		numbers("7");
	}
	@FXML
	public void onBt8Action() {
		numbers("8");
	}
	@FXML
	public void onBt9Action() {
		numbers("9");
	}
	//==========================//
	
	@FXML
	public void onBtMaisAction() {	
		numberTools("+");		
	}
	
	@FXML
	public void onBtMenosAction() {
		numberTools("-");
	}
	
	@FXML
	public void onBtVezesAction() {
		numberTools("*");
	}
	
	@FXML
	public void onBtPorAction() {
		numberTools("%");
	}
	
	@FXML
	public void onBtDivAction() {
		numberTools("/");
	}
	
	@FXML
	public void onBtIgualAction() {
		numberTools("=");
	}
	
	public void numberTools(String op) {
		
		if(op.equals("=")) {
			try {
				num2 = Integer.parseInt(lb1.getText().substring(lb1.getText().indexOf(operador) + 1, lb1.getText().length()));
				
				switch(operador) {
				case "+":
					num3 = num1 + num2;
					break;
				case "-":
					num3 = num1 - num2;
					break;
				case "*":
					num3 = num1 * num2;
					break;
				case "/":
					num3 = num1 / num2;
					break;
				case "%":
					num3 = num1 % num2;
					break;
				}
					
				lb1.setText(num3 + "");
				lb2.setText("");
				num1 = num3;
				clear = 0;
					
			}
			catch(Exception ex){
					
			}			
			
			num1 = 0;
			num2 = 0;
			num3 = 0;
		}
		else if(lb1.getText().contains("+")) {
			num2 = Integer.parseInt(lb1.getText().substring(lb1.getText().indexOf("+") + 1, lb1.getText().length()));
			num3 = num1 + num2;
			num1 = num3;
			operador = op;
			lb2.setText(num3 + "");
			lb1.setText(num3 + op);
			clear = 1;
		}
		else if(lb1.getText().contains("-")) {
			num2 = Integer.parseInt(lb1.getText().substring(lb1.getText().indexOf("-") + 1, lb1.getText().length()));
			num3 = num1 - num2;
			num1 = num3;
			operador = op;
			lb2.setText(num3 + "");
			lb1.setText(num3 + op);
			clear = 1;
		}
		else if(lb1.getText().contains("*")) {
			num2 = Integer.parseInt(lb1.getText().substring(lb1.getText().indexOf("*") + 1, lb1.getText().length()));
			num3 = num1 * num2;
			num1 = num3;
			operador = op;
			lb2.setText(num3 + "");
			lb1.setText(num3 + op);
			clear = 1;
		}
		else if(lb1.getText().contains("/")) {
			num2 = Integer.parseInt(lb1.getText().substring(lb1.getText().indexOf("/") + 1, lb1.getText().length()));
			num3 = num1 / num2;
			num1 = num3;
			operador = op;
			lb2.setText(num3 + "");
			lb1.setText(num3 + op);
			clear = 1;
		}
		else if(lb1.getText().contains("%")) {
			num2 = Integer.parseInt(lb1.getText().substring(lb1.getText().indexOf("%") + 1, lb1.getText().length()));
			num3 = num1 % num2;
			num1 = num3;
			operador = op;
			lb2.setText(num3 + "");
			lb1.setText(num3 + op);
			clear = 1;
		}		
		else{
			try {
				num1 = Integer.parseInt(lb1.getText());
				operador = op;
				lb1.setText(num1 + op);
				lb2.setText("");
				clear = 1;
			}
			catch(Exception ex){
				
			}
		}
	}
	
	public void numbers(String number) {
		lb1.setText(clear == 0 ? number : lb1.getText() + number);
		clear = 1;
	}
}
