import javax.swing.JFrame;
public stactic void main (String[]args)
public class gameframe extends JFrame{

	private static final long serialVersionUID = 1L;

	gameframe() {
		gamepanel panel = new gamepanel();
		this.add(panel);
		this.setTitle("snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}