public class Munchies {

//number 1
	public static int findMultiple(int number) {
	int result = number * 5;
	return result;
}

// number 2
	//public static int displayPrimeNumbers(int number) {
	
}
// number 3
	public static String dispalyAge(int ageYears) {
	double month = ageYears * 12;
	return "Your age " + ageYears + " in month is " + month;

	double days = month * 365.25;
	return "Your age " + ageYears + " in days is " + days;
 
	double minutes = days * 1440;
	return "Your age " + ageYears + " in minutes is " + minutes;

	double seconds = minutes * 86400;
	return "Your age " + ageYears + " in seconds is " + seconds;

}

// number 4
		

// number 5
	public static String findMultiplesOf7Not5(int number) {
	if (number < 2000 || number > 3200) {
	return "invalid input..";

}	else if (number % 7 == 0) {
		if (number % 5 == 0) {
	return "number is divisible by 7 and is a multiple of 5";
}
	return "number is divisible by 7 but not a multiple of 5";
}
	return " ";
}

// number 6
	public static int computeSumOfNumber(int number) {
	int num1 = (number / 1000) % 10;
	int num2 = (number / 100) % 10;
	int num3 = (number / 10) % 10;
	int num4 = (number / 1) % 10;

	int total = num1 + num2 + num3 + num4;
	return total;
}

// number 7
	public static boolean isLeapYear(int year) {
	
	if (year % 4 == 0){
	return true;
}
	return false;
}




}