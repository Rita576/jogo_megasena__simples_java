
package jogo;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class megasena extends JFrame {
    JLabel titulo, jogo = new JLabel();
    JButton jogada;
    private JLabel numjogo;
    private JLabel numjogada;
    private JTextField meuTextField;
    private JTextField meuTextField2;
    
	public megasena() {
		super("Meganasena");
		Container tela = getContentPane();
		getContentPane().setLayout(new GridBagLayout());

                numjogo = new JLabel(" Quantd de numeros: \n");               
                meuTextField = new JTextField(5);       
                add(numjogo);
                add(meuTextField);
                
                numjogada = new JLabel(" Quantd de jogadas: \n");               
                meuTextField2 = new JTextField(5);       
                add(numjogada);
                add(meuTextField2);
                
		titulo = new JLabel("\n Megasena: " );
		jogada = new JButton("jogar");              
                

		jogada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                                int valor [] = new int[6];
                                int jogadas [] = new int[6];
				int num = 5;
                                int num2;
                                int i = 0;
                                int j =  0;
                                num = Integer.parseInt(meuTextField.getText());                                
                                num2 = Integer.parseInt(meuTextField2.getText());                        
                                
                                String jogo = "\n";
                                for (i = 0; i < num; i++){   
                                    for (j = 0; j < num2; j++){  
                                if(num >= 6 && num <= 15){        
                                valor[i] = (int) (Math.random()*60);
                                     jogo +=+ valor[i]+"-";
                                }else{
                                    JOptionPane.showMessageDialog(null,"Favor digite a quantidade entre 6 e 15!");
                                }                                                                                                 				
                                }}
                                                             
                                                                 
                                JOptionPane.showMessageDialog(null,"\n Numeros: "+jogo);
                                
                                                                                                                            
                          
                                
                                
			}
		}

		);

		tela.add(titulo);
		
		tela.add(jogo);
		tela.add(jogada);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(500, 200);
		

	}
}
