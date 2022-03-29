	//import java.awt.FlowLayout;
	//import java.awt.Frame;
	//import java.awt.TextField;

	public class thread {

		public static void main(String[] args) {
			Message m1 = new Message("Ping"); 
			Message m2 = new Message("\tPong"); 
			Message m3 = new Message("\t\tPang");
			Message m4 = new Message("\t\t\tPung"); 
			
			m1.start();
			m2.start();
			m3.start();
			m4.start(); 
	
		}
}
class Message extends Thread //1 - isA
{
	String msg;

	public Message(String msg) {
		super();
		this.msg = msg;
	}
	
	public void run() { //2
		for(int i=1;i<300;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(""+msg+i);
		}
	}
	
}
