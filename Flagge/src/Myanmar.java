import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Myanmar implements ActionListener,KeyListener{
     JFrame frame;
     JLabel label;
     ImageIcon icon;
     JTextField field;
     JButton next;
     JButton reset;
     JButton back;
     JButton show;
     JLabel answer;
     JLabel label1;
     ImageIcon icon1;
     Myanmar(){
    	 frame = new JFrame();
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setLayout(null);
    	 frame.setSize(250,280);
    	 frame.getContentPane().setBackground(Color.black);
    	 frame.setTitle("1");
    	 
    	 icon = new ImageIcon("src/Myanmar-Flag-icon.png");
    	 
    	 label = new JLabel();
    	 label.setBounds(50,30,120,80);
    	 label.setIcon(icon);
    	 frame.add(label);
    	 
    	 field = new JTextField(20);
    	 field.setBounds(55,120,120,25);
    	 field.addKeyListener(this);
    	 frame.add(field);
    	 
    	 next = new JButton("next");
    	 next.setBounds(50,150,60,25);
    	 next.setFont(new Font(null,Font.BOLD,12));
    	 next.setForeground(Color.green);
    	 next.addActionListener(this);
    	 //next.addKeyListener(this);
    	 frame.add(next);
    	 
    	 reset = new JButton("reset");
    	 reset.setBounds(120,150,60,25);
    	 reset.setFont(new Font(null,Font.BOLD,12));
    	 reset.setForeground(Color.green);
    	 reset.addActionListener(this);
    	 frame.add(reset);
    	 
    	 back = new JButton("back");
    	 back.setBounds(80,170,70,25);
    	 back.setFont(new Font(null,Font.BOLD,12));
    	 back.setForeground(Color.green);
    	 back.addActionListener(this);
    	 frame.add(back);
    	 
    	 show = new JButton("Show Answer");
    	 show.setBounds(60,190,110,25);
    	 show.setFont(new Font(null,Font.BOLD,12));
    	 show.setForeground(Color.cyan);
    	 show.addActionListener(this);
    	 frame.add(show);
    	 
    	 answer = new JLabel("");
    	 answer.setBounds(100,220,100,25);
    	 answer.setFont(new Font(null,Font.ITALIC,12));
    	 answer.setForeground(Color.red);
    	 frame.add(answer);
    	 
    	 icon1 = new ImageIcon("src/pic1.jpg");
    	 
    	 label1 = new JLabel(icon1);
    	 label1.setSize(250,280);
    	 frame.add(label1);
    	 
    	 frame.setVisible(true);
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = field.getText();
		if((input.equals("myanmar") || input.equals("MYANMAR")) && e.getSource()==next){
			frame.dispose();
			new Germany();
		}
		
		else {
			answer.setText("Wrong");
			//new Myanmar();
		}
		if(e.getSource()==reset) {
			field.setText("");
		}
		if(e.getSource()==back) {
			frame.dispose();
			new Gamestart();
		}
		if(e.getSource()==show) {
			answer.setText("myanmar");
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String input = field.getText(); 
			if((input.equals("myanmar") || input.equals("MYANMAR")) && e.getKeyCode()==KeyEvent.VK_ENTER){
				frame.dispose();
				new Germany();
			}
			
			/*else {
				answer.setText("Wrong");
				//new Myanmar();
			}*/
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
