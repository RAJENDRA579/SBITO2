
public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
class breakFastTimeExceedException extends Exception{
	
}
class eating{
	int x;
	String eatingTime;
	
	public eating(int x, String eatingTime) throws breakFastTimeExceedException{
		super();
		this.x = x;
		this.eatingTime = eatingTime;
	
	if (x>10) {
		throw breakFastTimeExceedException("breakFast time over");

	}
	else if(x<10) {
		System.out.println("breakfast ready");
	}
	
	if (x>10) {
		throw breakFastTimeExceedException("breakFast time over");

	}
	else if(x<10) {
		System.out.println("breakfast ready");
	}
	
	}
}
	

	
