package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("calls can be made here");
	}
	
	public void sendMsg() {
		System.out.println("messages can be sent here");
	}
	public static void main(String[] args) {
		
		Mobile mobObj = new Mobile(); 
		mobObj.sendMsg();
		mobObj.makeCall();

	}

}
