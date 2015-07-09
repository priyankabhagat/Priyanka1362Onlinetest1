package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c1= new Candidate("priyanka","areoplane",1);
		Candidate c2= new Candidate("tanvi","bullock cart",2);
		Candidate c3= new Candidate("ashish","cycle",3);
		Candidate c= new Candidate();
		c.getCandidate();
		c1.toString();
		//System.out.println("Candidate:[Name:"+name+",logo:"+logo+",candidate id"+candidateId+"]");
		Controlunit con= new Controlunit();
		con.powerunit=true;
		con.onlamp();
		c1.display();
		c2.display();
		c3.display();
		
	}

}
