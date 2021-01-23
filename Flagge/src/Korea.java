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

public class Korea implements ActionListener,KeyListener{
     JFrame frame;
     ImageIcon icon;
     JLabel label;
     JTextField field;
     JButton next;
     JButton reset;
     JButton back;
     JButton show;
     JLabel answer;
     Korea(){
    	 frame = new JFrame();
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setLayout(null);
    	 frame.setSize(250,280);
    	 frame.setTitle("12");
    	 frame.getContentPane().setBackground(Color.black);
    	 
    	 icon = new ImageIcon("src/Korea-Flag-icon.png");
    	 
    	 label = new JLabel();
    	 label.setBounds(50,30,150,80);
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
    	 answer.setBounds(100,220,220,25);
    	 answer.setFont(new Font(null,Font.ITALIC,11));
    	 answer.setForeground(Color.red);
    	 frame.add(answer);
    	 
    	 frame.setVisible(true);
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = field.getText();
		if((input.equals("korea") || input.equals("KOREA")) && e.getSource()==next) {
			frame.dispose();
			new USA();
		}else {
			answer.setText("wrong");
		}
		if(e.getSource()==reset) {
			field.setText("");
		}
		if(e.getSource()==back) {
			frame.dispose();
			new Japan();
		}
		if(e.getSource()==show) {
			answer.setText("korea");
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
		if((input.equals("korea") || input.equals("KOREA")) && e.getKeyCode()==KeyEvent.VK_ENTER) {
			frame.dispose();
			new USA();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
