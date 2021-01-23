import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Won implements ActionListener{
    JFrame frame;
    JLabel label;
    JButton back;
    JButton start;
    Won(){
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(null);
    	frame.setSize(200,200);
    	frame.setTitle("Good job");
    	frame.getContentPane().setBackground(Color.green);
    	
    	label = new JLabel("Congratulation!!!");
    	label.setBounds(30,30,165,35);
    	label.setFont(new Font(null,Font.BOLD,15));
    	label.setForeground(Color.BLACK);
    	frame.add(label);
    	
    	back = new JButton("back");
    	back.setBounds(20,80,60,25);
    	back.setFont(new Font(null,Font.BOLD,12));
    	back.setForeground(Color.red);
    	back.addActionListener(this);
    	frame.add(back);
    	
    	start = new JButton("start menu");
    	start.setBounds(80,80,100,25);
    	start.setFont(new Font(null,Font.BOLD,12));
    	start.setForeground(Color.red);
    	start.addActionListener(this);
    	frame.add(start);
    	
    	
    	frame.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			frame.dispose();
			new French();
		}
		if(e.getSource()==start) {
			frame.dispose();
			new Gamestart();
		}
	}
}
