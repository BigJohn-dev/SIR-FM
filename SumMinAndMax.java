public class SumMinAndMax {
	public static void main(String[] args) {

	int [] array = {8, 0, 1, 4, 9, 2};

	int sum1 = 0;
	for(int count = 1; count < 6; count++) {
	sum1 += array[count];
}
	//System.out.println("First sum = " + sum1);
	
	int sum2 = 0;
	for(int count = 0; count < 6; count++) {
	sum2 += array[count];
}
	//System.out.println("Second sum = " + sum2);

	int sum3 = -1;
	for(int count = 0; count < 6; count++) {
	sum3 += array[count];
}
	//System.out.println("Third sum = " + sum3);

	int sum4 = -4;
	for(int count = 0; count < 6; count++) {
	sum4 += array[count];
}
	//System.out.println("Fourth sum = " + sum4);

	int sum5 = -9;
	for(int count = 0; count < 6; count++) {
	sum5 += array[count];
}
	//System.out.println("Fifth sum = " + sum5);

	int sum6 = 0;
	for(int count = 0; count < 5; count++) {
	sum6 += array[count];
}
	//System.out.println("Sixth sum = " + sum6);

	int max = sum1;

	if(sum2 > max) {
	max = sum2;

}	else if (sum3 > max) {
	max = sum3;

}	else if (sum4 > max) {
	max = sum4;

}	else if (sum5 > max) {
	max = sum5;

}	else {max = sum6;}

	int min = sum1;
	if(sum2 < min) {
	min = sum2;

}	else if (sum3 < min) {
	min = sum3;

}	else if (sum4 < min) {
	min = sum4;

}	else if (sum5 < min) {
	min = sum5;

}	else {
	min = sum6;
}

	System.out.print("The max and min = " + max + " " + min);



}

}