import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.BoxLayout;

public class SingleThread implements ActionListener {

	public static void main(String[] args) {
		SingleThread app = new SingleThread();
		app.makeGui();
	}

	@SuppressWarnings({ "nls", "static-method" })
	

	static void Add3Panels(JFrame frame , ImagePanel p1 )//, ImagePanel p2 , ImagePanel p3)
	{

		frame.add(p1);
		//frame.add(p2);
		//frame.add(p3);
		
		
	}
	void makeGui() {
		// Create the window.
		JFrame frame = new JFrame("Hello World Of Threading!");
		// Set the window size.
		frame.setMinimumSize(new Dimension(800, 400));
		// Close when you click the X.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Stack our components vertically.
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		ImagePanel panel1 = new ImagePanel();
//		ImagePanel panel2 = new ImagePanel();
	//	ImagePanel panel3 = new ImagePanel();		
	//	Add3Panels(frame , panel1 )//, panel2 , panel3 );
		frame.add(panel1);

		// To set the image to a file named `wts1.jpg` in the same directory:
		// panel1.setPath("wts1.jpg");
		try {
			panel1.setPath("Tiger1");
		//	panel2.setPath("jag1.jpeg");
			//panel3.setPath("lion.jpeg");
			
		} catch (Exception e) {
			// FIXME Auto-generated catch block
			e.printStackTrace();
		}

		//
		// You can name your images whatever you want!

		// Show our window.
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//TODO
	}
}
