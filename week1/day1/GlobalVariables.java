package week1.day1;

public class GlobalVariables {
	
	String mobileModel = "honor 8x";
	int mobileWeight = 250;
	boolean isFullCharged = false;
	double cost = 20.500;
	
	private void makeCall() {
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		System.out.println(isFullCharged);
		System.out.println(cost);
		System.out.println("calling mom");

	}
	 public static void main(String[] args) {
		GlobalVariables honor = new GlobalVariables();
		 
		honor.makeCall();
	}
	}