import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.awt.desktop.*;
import java.net.URI;
import javax.swing.*;
public class ChatBot extends JFrame{
static JTextArea txt = new JTextArea();
static JTextField field = new JTextField();
static JTextField button ;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);       //starting the application to be executed
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); //for closing the operation.
		frame.setSize(400,900);           //size of the box
		frame.setLayout(null);
		frame.setTitle("Assist Bot");                 //name to be displayed of ur chatbot
	frame.add(field);            //user textField
	frame.add(txt);                  //user text
		txt.setLocation(1,5);            
txt.setSize(400,1000);                      
field.setLocation(8,300);
field.setSize(400,70);
field.addActionListener(new ActionListener(){             //to perform the activity
	
	public void actionPerformed(ActionEvent e) {        
		
		String msg = field.getText();			//getting input
		txt.append("User:" + msg +"\n" );        //output display format
		field.setText("");                        
		if (msg.toLowerCase().contains("hi")) {                    //input user has to be converted into lowercase automatically for easy use
			txt.append("Roxy = hi buddy!It's great to see u here.\n");
		}else if(msg.toLowerCase().contains("hey dude")) {
			txt.append("Roxy:Hey! Buddy..It's great to see you.\n");
		}else if(msg.toLowerCase().contains("cool")) {
			txt.append("Roxy:yupp ! it is.\n");
		}
		else if(msg.toLowerCase().contains("how are you")) {
			
			txt.append("Roxy = i am fine.What about you?\n");
		
		}else if(msg.toLowerCase().contains("open google")) {
			
			txt.append("Roxy:Sorry for that,I can't execute that command as it was not feeded to me.\n");

        }else if(msg.toLowerCase().contains("how do you do")) {
        	
			txt.append("Roxy:i'm good\n");
		}else if(msg.toLowerCase().contains("whats on my schedule")) {
			
			txt.append("Roxy:depends on what you have decided\n");
		}else if(msg.toLowerCase().contains("what is your name")) {
			
			txt.append("Roxy: My name is ROXY\n");
		}else if(msg.toLowerCase().contains("registered email id on my laptop")) {
			
			txt.append("Roxy:none\n");
		}else if(msg.toLowerCase().contains("play a song for me")) {
			
			txt.append("Roxy: sorry but i cannot process your request right at this time.\n");
		}else if(msg.toLowerCase().contains("what is the day today")) {
			
			txt.append("Roxy: calendar is not yet feeded to me.\n");
		}else if(msg.toLowerCase().contains("Are you a machine")) {
			
			txt.append("Roxy: yes,completely.\n");
		}else if(msg.toLowerCase().contains("what are you doing")) {
			
			txt.append("Roxy:Nothing, just Chilling with you.\n");
		}
				else {
			txt.append("Roxy:Sorry,I can't understand what you are saying.\n");
		}
		
	}
	
	});
}
	
}
