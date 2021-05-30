package src.flappyBird;
import render.*;

import javax.swing.JFrame;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlappyBird implements ActionListener {

	public static FlappyBird flappyBird;   // static instance of FlappyBird

	public final int WIDTH = 800, HEIGHT = 800;

	public Renderer renderer;

	public FlappyBird() {

		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);

		renderer = new Renderer();
		jframe.add(renderer);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		timer.start();

	}

	public void actionPerformed(ActionEvent e) {

		renderer.repaint();
	}

	public static void repaint(Graphics g) {

	}

	public static void main(String[] args) {
		flappyBird = new FlappyBird();
	}


}
