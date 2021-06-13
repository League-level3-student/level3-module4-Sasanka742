package _00_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {

	/* 
     * Create a JFrame with a JPanel and a JLabel.
     * 
     * Every time a key is pressed, add that character to the JLabel. It should
     * look like a basic text editor.
     * 
     * Make it so that every time the BACKSPACE key is pressed, the last
     * character is erased from the JLabel.
     * 
     * Save that deleted character onto a Stack of Characters.
     * 
     * Choose a key to be the Undo key. Make it so that when that key is
     * pressed, the top Character is popped  off the Stack and added back to
     * the JLabel.
     */
	JFrame frame;
	JPanel panel;
	JLabel label;
	
	Stack<String> deleted;
	String text = "";
	public static void main(String[] args) {
		_02_TextUndoRedo test = new _02_TextUndoRedo();
		test.run();
	}
	public void run() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		deleted = new Stack<String>();
		
		
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(250,100);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE && text.length()>0) {
			deleted.push(text.substring(text.length()-1,text.length()));
			System.out.println(text.substring(text.length()-1, text.length()));
			text = text.substring(0, text.length()-1);
			
		} else if(e.getKeyChar() == 'z' && !deleted.isEmpty()) {
			text += deleted.pop();
			
		} else{
			text += e.getKeyChar()+"";
			
		}
		label.setText(text);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
