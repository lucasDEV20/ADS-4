package codigos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x, y;
    //variaveis para a entrada 
    String sX, sY;
	
    sX = JOptionPane.showInputDialog("Digite o Valor 1:");
	x = Integer.parseInt(sX);
	
	sY = JOptionPane.showInputDialog("Digite o Valor 2:");
	y = Integer.parseInt(sY);
	
	Cauculadora c = new Cauculadora();
	
	JOptionPane.showMessageDialog(null, "Soma: " + c.somar(x, y));
	JOptionPane.showMessageDialog(null, "Subtra��o: " + c.subtrair(x, y));
	JOptionPane.showMessageDialog(null, "Multiplica��o: " + c.multiplica�ao(x, y));
	JOptionPane.showMessageDialog(null, "Divis�o" + c.divisao(x, y));
	
	}


}
