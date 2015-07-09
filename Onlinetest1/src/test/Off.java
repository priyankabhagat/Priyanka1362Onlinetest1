package test;

public class Off implements State {

		  
		@Override
		public void dofunction(Controlunit control) {
			// TODO Auto-generated method stub
			System.out.println("Power unit is state");
		      control.setState(this);	
		}
}
