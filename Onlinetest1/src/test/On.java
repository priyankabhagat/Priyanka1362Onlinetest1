package test;

public  class On implements State{

	@Override
	public void dofunction(Controlunit control) {
		// TODO Auto-generated method stub
		control.setState(this);
		
	}

}
