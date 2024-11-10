package ex_class;

public class compteurCycl extends compteur {
	public compteurCycl(int c) {
		super(c);
	}
	private static final int max=4;

	@Override
	public void incremeter() {
	if(this.courant<max) {
		this.courant++;
	}
	else {
		this.courant=min;
	}
		
	}
	
}
	
