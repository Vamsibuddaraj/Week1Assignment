package Strings;

public class Solution7 {
	
	int modelYear;
	  String modelName;

	  public Solution7(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
		  Solution7 myCar = new Solution7(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
}
