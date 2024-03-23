/**
 * 
 */
package ntu_63131868;

/**
 * 
 */
public class Student {
	private String ID  ; 
	private String name  ; 
	private int age ; 
	
	
	public Student (String ID, String name , int age) {
	this.ID = ID ; 
	this.name = name ; 
	this.age = age ; 
	
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	

}
