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
	
	private BufferedImage chimney  ; 
	//Trong luc 
	public static float g = 0.1f ; 
	
	public Bird bird ; 
	private Ground ground  ; 
	private Chimney cnObjects ; 
	
	private int Begin_Screen = 0  ; 
	private int GAMEPLAY_Screen = 1  ; 
	private int GAMEOVER_Screen = 2  ; 
	private int CurrentScreen = Begin_Screen ;  


	public Cau1_GameFlappyBird() {
		super(800,600) ; 
		try {
			birds = ImageIO.read(new File("Asset/bird_sprite.png")) ; 
		
			chimney  = ImageIO.read(new File("Asset/chimney.png")) ; 
		
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
		cnObjects = new Chimney (700 , 300,74,400) ; 

		BeginGame(); 
	}

	public static void main(String[] args) {
		new Cau1_GameFlappyBird() ; 
		

	}
	private void resetGame() {
     bird.setPos(350, 250);
		bird.setVt(0);
		
	}

	@Override
	public void GAME_UPDATE(long deltaTime) {
		
		if(CurrentScreen == Begin_Screen) {
			resetGame(); 
		}else if(CurrentScreen == GAMEPLAY_Screen) {
				
		bird_anim.Update_Me(deltaTime);
		bird.update(deltaTime);
		ground.Update(); 
		cnObjects.Update(); 
		
		if(bird.getPosY() + bird.getH() > ground.getYGround())  CurrentScreen = GAMEOVER_Screen ; 
		}
		else {
			
		}
	}

	@Override
	public void GAME_PAINT(Graphics2D g2) {
		g2.drawImage( chimney ,(int ) cnObjects.getPosX() ,(int) cnObjects.getPosY(),this) ; 

		ground.Paint(g2);

		
		if(bird.getIsFlying())	
	         bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, -1);
		else 
			 bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, 0);

		
		if(CurrentScreen == Begin_Screen) {
			g2.setColor(Color.red);
			g2.drawString("Press apace to play game",200,300) ; 
		}
		if(CurrentScreen == GAMEOVER_Screen) {
			g2.setColor(Color.red);
			g2.drawString("Press space to turn back screen",200,300) ; 
		}
		
		
	}

	@Override
	public void KEY_ACTION(KeyEvent e, int Event) {
		if(Event == KEY_PRESSED) {
			if(CurrentScreen == Begin_Screen) {
				CurrentScreen = GAMEPLAY_Screen ; 
			}else if(CurrentScreen == GAMEPLAY_Screen) {
				bird.fly();

			}else if(CurrentScreen == GAMEOVER_Screen ) {
				CurrentScreen = Begin_Screen ; 
			}
		}
		
	}

}
