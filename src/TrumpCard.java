import javax.swing.*;

public class TrumpCard {
	public static void main(String[] args) {
	
		JFrame f = new JFrame("The Trump Card");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Paint p = new Paint();
		f.add(p); 
		f.setSize(957, 928);;
		f.setVisible(true);
	}
}
