import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class Window_3_CPU extends JFrame implements ActionListener{
		public	Window_3_CPU(ArrayList <String> Save_data){
			 for (int j =0;j<Save_data.size();j++) { 
		           	System.out.println(Save_data.get(j));
		           }   
			setSize(300,360);
	        setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setVisible(true);
			String[] item = new String[Save_data.size()];
			JPanel p1 = new JPanel ();
			JPanel p2 = new JPanel ();

			add(p1);
			add(p2,BorderLayout.SOUTH);

			try  {
		        ImageIcon icone = new ImageIcon("C:/Users/T7bra/OneDrive - Groupe INSEEC (POCE)/ERASMUS/Programme Languages/exo/Projet Team2/Image projet/téléchargement (3).jpg");
		        JLabel image = new JLabel(icone);
		        p1.add(image,BorderLayout.NORTH);
				} catch(Exception b) {
					System.out.println("??");
				}
			JTextField text = new JTextField ("    CPU     ");
			p1.add(text);
			
			JButton back = new JButton ("BACK TO MENU");
			Integer[] number_item = { 1, 2, 3, 4, 5 };
			JComboBox c1 = new JComboBox(number_item);
			p1.add(c1);
			
			JButton shop = new JButton ("ADD TO BAG");
			p1.add(shop);
			p2.add(back);
			 String qual = "CPU";
	         Integer compteur_parse=0;
	         int compteur = 0;  
			shop.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed (ActionEvent d ) {
					// Declaration of String class Objects.
	                String qual = "CPU";
	                Integer compteur_parse=0;
	                int compteur = 0;  
	

	                    compteur =   (Integer) c1.getSelectedItem() ;
	                    for (int i=0;i<compteur;i++) {
	                    	Save_data.add(qual);
	                    }
	    					dispose();	 
	         				new Window_2(Save_data);
				}
			});
			p2.add(back);
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed (ActionEvent d ) {
					dispose();
					new Window_2(Save_data);

				}});
		}

	

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//if (other== null) {
		//other = new Window2(Window.this)
	}

	}