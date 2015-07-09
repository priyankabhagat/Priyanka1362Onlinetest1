package test;

public class Controlunit extends EVM {
	private	State state;
	public State getState() {
			return state;
		}

	public void setState(State state) {
		this.state = state;
	}

	//Ballotunit b= new Ballotunit();
	 boolean onlamp, busylamp;
	 int totalvote=0;
	 
	 public boolean onlamp(){
		 if(powerunit==true){
			System.out.println("on lamp glows when the power is on"); 
		 return true;}
		 else 
				System.out.println("on lamp is off when the power is off"); 

			 return false;
	 }
	 
	 
}
