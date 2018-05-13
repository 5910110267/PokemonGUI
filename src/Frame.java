import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{
	public Frame() {
		super("Pokemon App");
		Container c = getContentPane();
		makeMenuBar();
		JLabel label = new JLabel("I am a label. I can display some text");
		c.add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280,720);
		setLocation(200,300);
		setVisible(true);
	}
	private void makeMenubar = new JMenuBar()
}
