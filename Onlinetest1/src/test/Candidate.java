package test;
import java.util.List;
import java.util.ArrayList;

public class Candidate {
	String name;
	String logo;
	int candidateId;
	int vote;
	private List<Candidate> candidate;
	
	public Candidate(){
		
	}
	
	public Candidate(String name,String logo,int candidateId){
		this.candidateId=candidateId;
		this.name=name;
		this.logo=logo;
		candidate = new ArrayList<Candidate>();
	}

	public List<Candidate> getCandidate() {
		return candidate;
	}
	
	public void display(){
		System.out.println("Name:"+name+",logo:"+logo+",id:"+candidateId);
	}
	
}
