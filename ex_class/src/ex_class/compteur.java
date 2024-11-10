package ex_class;

public abstract class compteur {
	public static int min = 0;
	protected int courant;
	public compteur (int c) 
	{this.courant= min;}
	 
	public void raz () {
		this.courant = 0; 
	}
	public  abstract void incremeter();

	public int getCourant() {
		return courant;
	}

	
	

}


