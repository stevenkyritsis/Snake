package snake;


import java.util.Random;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.Timer;

public Snake()
{
	dim = Toolkit.getDefaultToolkit().getScreenSize();
	jframe = new JFrame("Snake");
	jframe.setVisible(true);
	jframe.setSize(805, 700);
	jframe.setResizable(false);
	jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getHeight() / 2);
	jframe.add(renderPanel = new RenderPanel());
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.addKeyListener(this);
	startGame();
}
	

	public void startGame()
	{
		over = false;
		paused = false;
		time = 0;
		score = 0;
		tailLength = 14;
		ticks = 0;
		direction = DOWN;
		head = new Point(0, -1);
		random = new Random();
		snakeParts.clear();
		cherry = new Point(random.nextInt(79), random.nextInt(66));
		timer.start();
	}
	
	public static void main(String[] args)
	{
		snake = new Snake();
	}