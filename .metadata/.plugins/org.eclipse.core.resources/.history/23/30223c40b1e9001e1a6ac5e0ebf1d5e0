package ntu_63131868;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import pkg2dgamesframework.AFrameOnImage;
import pkg2dgamesframework.Animation;
import pkg2dgamesframework.GameScreen;

public class Cau1_GameFlappyBird extends GameScreen {
	private  BufferedImage birds ;
	private Animation bird_anim  ;  
	
	
	//Trong luc 
	public static float g = 0.1f ; 
	
	public Bird bird ; 
	
	private Ground ground  ; 
	public Cau1_GameFlappyBird() {
		super(800,600) ; 
		try {
			birds = ImageIO.read(new File("Asset/bird_sprite.png")) ; 
		} catch (IOException ex ) {}
		
		bird_anim = new Animation(70) ; 
		AFrameOnImage f ; 
		f = new AFrameOnImage(0, 0, 60, 60) ;
		bird_anim.AddFrame(f) ;
		
		f = new AFrameOnImage(60, 0, 60, 60) ;
		bird_anim.AddFrame(f) ;

		f = new AFrameOnImage(120, 0, 60, 60) ;
		bird_anim.AddFrame(f) ;

		f = new AFrameOnImage(60, 0, 60, 60) ;
		bird_anim.AddFrame(f) ;
		
		bird =  new Bird( 350 ,250 , 50 , 50) ; 
		ground = new Ground () ; 

		BeginGame(); 
	}

	public static void main(String[] args) {
		new Cau1_GameFlappyBird() ; 
		

	}

	@Override
	public void GAME_UPDATE(long deltaTime) {
		bird_anim.Update_Me(deltaTime);
		bird.update(deltaTime);
		
	}

	@Override
	public void GAME_PAINT(Graphics2D g2) {
		if(bird.getIsFlying())	
	 bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, -1);
		else 
			 bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, 0);

		ground.Paint(g2);
	}

	@Override
	public void KEY_ACTION(KeyEvent e, int Event) {
		if(Event == KEY_PRESSED) {
			bird.fly();
		}
		
	}

}
