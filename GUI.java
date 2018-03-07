package GaraW;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import GaraW.Gara;
public class GUI {
	 public GUI( Gara g)
	 { initialize(g);}
	 
private JFrame frame;
private JTextField textIdT;
	 private void initialize(Gara g){
		 
		 frame = new JFrame();
			
			
			frame.setBounds(100, 100, 250, 300);
			frame.setSize(400, 400);
			frame.getContentPane().setLayout(null);
			JPanel panel = new JPanel();
			panel.setSize(600,600);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JLabel lblIdTren= new JLabel(" Cod Tren");
			lblIdTren.setBounds(10, 11, 78, 20);
			panel.add(lblIdTren);
			textIdT = new JTextField();
			textIdT.setBounds(100, 11, 90, 20);
			panel.add(textIdT);
			JTextArea ta = new JTextArea();
			ta.setBounds(10, 58, 330, 40);
			
			panel.add(ta);
			JButton btnCustomer = new JButton("AfisareTren");
			btnCustomer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try{
					String IdT= textIdT.getText();
					int IdInt=Integer.parseInt(IdT);
					
					for(Tren temp: g.getTrenuri())
						{  
						  
						if(temp.getCod()==IdInt)
							{ta.setText(temp.toString());
							 break;}
							
						else	ta.setText("Nu este tren!");
							
									
						}
					}catch(NumberFormatException ex){ // handle your exception
						ta.setText("Introduceti id-ul trenului in format numeric!");
						}
				}
			});
			btnCustomer.setBounds(220, 11, 120, 20);
			panel.add(btnCustomer);
			
			frame.setVisible(true);
		 
		 
	 }
	 }
