package week1.day1;

public class FireFox {
	
	
	public void launchBrowser() {

System.out.println("FireFox Launched Successfully");
	}
	 
	public void maximize() {
	
System.out.println("Browser is maximized");
	}
	
	public static void main(String[] args) {
		
		FireFox obj = new FireFox();
		obj.launchBrowser();
		obj.maximize();
	}

}
