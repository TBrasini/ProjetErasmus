import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; // import the ArrayList class
import javax.swing.JTextField;

// motherboard.
//A Central Processing Unit (CPU)
//A Graphics Processing Unit (GPU), also known as a video card.
//Random Access Memory (RAM), also known as volatile memory.
//Storage: Solid State Drive (SSD) or Hard Disk Drive (HDD)
public class Window extends JFrame  implements ActionListener  {

	Window() {
		
		setSize(300,360);
		JPanel p1 = new JPanel();
		ArrayList <String> Save_data= new ArrayList <String>();
		JTextField text = new JTextField ("HOW YOUR COMPUTER IS COMPOSED ?! ");
		add(p1);
		p1.add(text,BorderLayout.NORTH);
        setLocationRelativeTo(null);
		JButton b1 = new JButton ("MY COMPUTER COMPONENT");
		p1.add(b1);
		try  {
        ImageIcon icone = new ImageIcon("C:/Users/T7bra/OneDrive - Groupe INSEEC (POCE)/ERASMUS/Programme Languages/exo/Projet Team2/Image projet/computer.jpg");
        JLabel image = new JLabel(icone);
        p1.add(image,BorderLayout.CENTER);
		} catch(Exception b) {
			System.out.println("??");
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window_2 other = null;
		//pack();
		setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent d ) {
				dispose();
				new Window_2(Save_data);
			}
		});
	}
			
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//if (other== null) {
			//other = new Window2(Window.this)
		}
	
	
public class ComputerComponent extends Window {
	ArrayList <String> Computer_Component= new ArrayList <String>();
	Motherboard motherboard = new Motherboard ();
	CPU cpu = new CPU ();
	RAM ram = new RAM ();
	GPU gpu = new GPU ();
	SSD ssd = new SSD ();
	ComputerComponent(){
		Computer_Component.add(motherboard.Integrate());
		Computer_Component.add(cpu.Integrate());
		Computer_Component.add(ram.Integrate());
		Computer_Component.add(gpu.Integrate());
		Computer_Component.add(ssd.Integrate());
		for (int i = 0; i < Computer_Component.size(); i++) {
		      System.out.println(Computer_Component.get(i));
		}
	}
}

	class Motherboard extends ComputerComponent { 
		String Motherboard = "Motherboard";
		JButton b2 = new JButton ();

		String Integrate () {
			
			return Motherboard;
		}
		void WindowAd (){
			JButton b1 = new JButton ();
		}
		
	}
	
	class CPU extends ComputerComponent{
		String CPU = "CPU";
		String Integrate () {
			return CPU;	
		}
	}
	
	class RAM extends ComputerComponent{
		String RAM = "RAM";
		String Integrate () {
			return RAM;	
		}
	}
	
	class GPU extends ComputerComponent{
		String GPU = "GPU";
		String Integrate () {
			return GPU;
	}
	}
	class SSD extends ComputerComponent {
		String SSD = "SSD";
		String Integrate () {
			return SSD;
		}}
	}



