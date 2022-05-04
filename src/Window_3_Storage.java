import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Component;
import java.awt.GridLayout;
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

public class Window_3_Storage extends JFrame implements ActionListener{
	

	public	Window_3_Storage(ArrayList <String> Save_data){

		setSize(300,360);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
		JPanel p1 = new JPanel ();
		JPanel p2 = new JPanel ();
		add(p2,BorderLayout.CENTER);
		add(p1,BorderLayout.NORTH);
		try  {
	        ImageIcon icone = new ImageIcon("C:/Users/T7bra/OneDrive - Groupe INSEEC (POCE)/ERASMUS/Programme Languages/exo/Projet Team2/Image projet/store.jpg");
	        JLabel image = new JLabel(icone);
	        p1.add(image,BorderLayout.NORTH);
			} catch(Exception b) {
				System.out.println("??");
			}
		//JTextField text = new JTextField ("SSD");
		//JTextField text2 = new JTextField ("HDD");
		//p1.add(text);
		//p2.add(text2);
		String[] item = { "SSD", "HDD" };
		JComboBox c3 = new JComboBox(item);
		p2.add(c3);
		Integer[] number_item = { 1, 2, 3, 4, 5 };
		JComboBox c1 = new JComboBox(number_item);
		p1.add(c1);
		Integer[] number_item2 = { 1, 2, 3, 4, 5 };
		JComboBox c2 = new JComboBox(number_item2);
		p2.add(c2);

		JButton shop = new JButton ("ADD TO BAG");
		JButton shop2 = new JButton ("ADD TO BAG");

		JButton back = new JButton ("BACK TO MENU");
		p1.add(shop);
		p2.add(shop2);

		p2.add(back);
		 String qual = "SSD";
         Integer compteur_parse=0;
         int compteur = 0;  
		shop2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent d ) {
				// Declaration of String class Objects.
                String qual = "SSD";
                Integer compteur_parse=0;
                int compteur = 0;  
               // System.out.println(c3.getSelectedItem().toString());
                //System.out.print((Integer) c2.getSelectedItem());
                // If condition to check if jRadioButton2 is selected.
                if (c3.getSelectedItem().toString()==qual) {
                    //System.out.println(c3.getSelectedItem().toString());

                    compteur =   (Integer) c2.getSelectedItem() ;
                    for (int i=0;i<compteur;i++) {
                    	Save_data.add(qual);
                    }
    					dispose();
         				new Window_2(Save_data);
                    }
                else {
                    qual = "HDD";
                    compteur = (Integer) c2.getSelectedItem() ;
                    for (int i=0;i<compteur;i++) {
                    	Save_data.add(qual);
                    }
    					dispose();
        				new Window_2(Save_data);
                    }
                
			}
		});
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent d ) {
				dispose();
				new Window_2(Save_data);

			}});
		setVisible(true);


}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//if (other== null) {
		//other = new Window2(Window.this)
	}
}

