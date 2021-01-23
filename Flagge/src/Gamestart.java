import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gamestart implements ActionListener{
      JFrame frame;
      JLabel label;
      JButton button;
      JLabel label1;
      JLabel label2;
      Gamestart(){
    	  frame = new JFrame();
    	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  frame.setLayout(null);
    	  frame.setSize(250,250);
    	  frame.setBackground(Color.red);
    	  frame.getContentPane().setBackground(Color.gray);
    	  
    	  label = new JLabel("Let play game");
    	  label.setBounds(60,20,150,25);
    	  label.setFont(new Font(null,Font.BOLD,15));
    	  label.setForeground(Color.green);
    	  frame.add(label);
    	  
    	  button = new JButton("Play");
    	  button.setBounds(75,60,70,40);
    	  button.setFont(new Font(null,Font.BOLD,13));
    	  button.setForeground(Color.green);
    	  button.addActionListener(this);
    	  frame.add(button);
    	  
    	  label1 = new JLabel("Game Info :");
    	  label1.setBounds(75,120,120,25);
    	  frame.add(label1);
    	  
    	  label2 = new JLabel("Just guess the flag and spell it right");
    	  label2.setBounds(20,160,220,25);
    	  label2.setFont(new Font(null,Font.ITALIC,12));
    	  label2.setForeground(Color.red);
    	  frame.add(label2);
    	  
    	  frame.setVisible(true);
      }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			frame.dispose();
			new Myanmar();
		}
	}
}
