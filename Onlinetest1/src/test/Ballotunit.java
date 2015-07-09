package test;

public class Ballotunit extends EVM{
	//Controlunit c= new Controlunit();
	
	
	boolean readylamp;
	
	public boolean lightglows(){
		if(powerunit==true){
			System.out.println("ready light glows");
		return true;}
		else
			System.out.println("ready light doesnt glow and power is off");
		return false;
		
	}
	
}
