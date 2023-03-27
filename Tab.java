package week1.day1;

public class Tab {
	int tabPrice=20000;
	String tabBrand="Apple ipad";
	
	public int tabPrice() {
	
		return 20000;
	}
	public String tabBrand() {
		
		return "Apple ipad";
	}
	public static void main(String[] args) {
		Tab detail=new Tab();
		detail.tabPrice();
		detail.tabBrand();
		System.out.println(detail.tabBrand());
		
		System.out.println(detail.tabPrice());
		
	}
	}


