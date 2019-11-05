package tema2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class tF_frio_calor extends JTextField implements KeyListener{
	
	private int numero_elegido;

	public tF_frio_calor() {
		
		numero_elegido = (int) (Math.random() * 100) + 1;
		System.out.println(numero_elegido);
		addKeyListener(this);
		
	}


				@Override
				public void keyPressed(KeyEvent e) {
					
					
				}






				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
					String texto = this.getText();
					System.out.println(texto);
					int value = Integer.valueOf(texto);
					
					int dif = numero_elegido-value;
					
					if (dif >25) {}
					
						
						//Sentencia1
					else if (dif>20) {}
						//Sentencia2
					
					else if (dif >15) {
						
					}
				   
					else if (dif > 10) {
						
					}
					
					else if (dif >5) {
						
						
					}
					else if (dif > 0) {
						
					}else if (dif ==0){
						System.out.print ("¡ACERTASTE!");
				    
					}
					
				}






				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
	
	
}
