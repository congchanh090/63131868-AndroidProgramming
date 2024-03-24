package ntu_63131868;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import pkg2dgamesframework.GameScreen;

public class Cau1_GameFlappyBird extends GameScreen {
	
	public Cau1_GameFlappyBird() {
		super(800,600) ; 
		BeginGame(); 
	}

	public static void main(String[] args) {
		new Cau1_GameFlappyBird() ; 
		

	}

	@Override
	public void GAME_UPDATE(long deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GAME_PAINT(Graphics2D g2) {
		g2.setColor(Color.red);
		g2.fillRect(50, 100, 100, 100);
		
	}

	@Override
	public void KEY_ACTION(KeyEvent e, int Event) {
		// TODO Auto-generated method stub
		
	}

}
