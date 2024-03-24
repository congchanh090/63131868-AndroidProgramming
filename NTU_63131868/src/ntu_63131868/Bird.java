package ntu_63131868;

import pkg2dgamesframework.Objects;

public class Bird extends Objects  {
	
	private float vt = 0 ; 
	public Bird (int x , int y , int w , int h ) {
		super (x,y,w,h) ; 
	}
	
	//update chim rơi 
	public void update (long detaTime) {
		vt += Cau1_GameFlappyBird.g ; 
		this.setPosY(this.getPosY()+vt); 
		
		
	}

	public void fly () {
		vt = -3 ; 
	}


}
