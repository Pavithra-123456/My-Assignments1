package week1.day1;

public class Mobile {
	public void sendSms() {
		String mobilemodel= "Iphone7";
		float mobileweight=138.0f;
		System.out.println("mobilemodel:"+ mobilemodel);
		System.out.println("mobileweight:"+ mobileweight);
	}
public void makeCall() {
boolean fullcharged=true;
int mobilecost=12000;
System.out.println("It is fullcharged:"+ fullcharged);
System.out.println("cost:"+ mobilecost);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile iphone=new Mobile();
iphone.sendSms();
iphone.makeCall();
System.out.println("This is my mobile");
	}

}
