package week1.day1;

public class Mobile {
	
	String mobileModel = "honor 8x";
	int mobileWeight = 250;
	boolean isFullCharge = false;
	double mobileCost = 20.500;
	
	public void makeCall() {
		System.out.println("calling mom");
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		System.out.println(isFullCharge);
		System.out.println(mobileCost);
		}
	
	public static void main(String[] args) {
		Mobile honor = new Mobile();
		
		honor.makeCall();
	}
	
	

}
