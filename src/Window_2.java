import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Window_2 extends JFrame implements ActionListener {
	  Window_2(ArrayList <String> Save_data) { 
		  
		   for (int j =0;j<Save_data.size();j++) { 
           	System.out.println(Save_data.get(j));
           }   
		setSize(300,360);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel p1 = new JPanel();
		add(p1,BorderLayout.CENTER);
		try  {
	        ImageIcon icone = new ImageIcon("C:/Users/T7bra/OneDrive - Groupe INSEEC (POCE)/ERASMUS/Programme Languages/exo/Projet Team2/Image projet/images.jpg");
	        JLabel image = new JLabel(icone);
	        p1.add(image,BorderLayout.NORTH);
			} catch(Exception b) {
				System.out.println("??");
			}
		JTextField text = new JTextField ("             CLICK  AND  SHOP           ");
		
		JButton b1 = new JButton ("     CPU       ");
		JButton b2 = new JButton ("   MotherBoard ");
		JButton b3 = new JButton ("    Storage     ");
		JButton b4 = new JButton ("        My Shopping Bag         ");

		p1.add(text);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4,BorderLayout.SOUTH);

		setVisible(true);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent d ) {
				dispose();
				new Window_3_CPU(Save_data);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e ) {
				dispose();
				new Window_3_Motherboard(Save_data);
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent c ) {
				dispose();
				new Window_3_Storage(Save_data);
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent c ) {
				dispose();
				new Window_Shopping_bag(Save_data);
			}
		});
	

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//if (other== null) {
		//other = new Window2(Window.this)
	}
}

 

// static data 