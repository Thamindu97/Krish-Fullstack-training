import java.math.BigDecimal;

public class ReverseSentence{

	public static void main(String args[]){

		//----------------------------------------------------------------------------------------------------
		System.out.println("Using Doubles----------");

		//Initialize double array consists prices of 5 grocery items 
		double[] priceArray = {90.75,120.45,499.99,99,25.20};
		
		//Get size of the array
		int arraySize = priceArray.length;

		//Initialize discount
		double discount = 0.19;		
		
		//Calculate and print total price
		double totalPrice = 0.0;
		for(int tempNum = 0; tempNum < arraySize; tempNum++){
			totalPrice += priceArray[tempNum];
		}

		System.out.println("Total Price: " + totalPrice);
		
		//Calculate final price 
		double finalPrice = totalPrice * (1 - discount);
		System.out.println("Selling Price: " + finalPrice);

		System.out.println();
		


		//----------------------------------------------------------------------------------------------------
		System.out.println("Using BigDecimals----------");

		//Initialize string array consists prices of 5 grocery items 
		String[] strPriceArray = {"90.75","120.45","499.99","99","25.20"};

		//Get size of the array
		int strArraySize = strPriceArray.length;	

		//Initialize discount
		String strDiscount = "0.19";

		//Calculate and print total price
		BigDecimal bdTotalPrice = new BigDecimal("0");
		for(int tempNum = 0; tempNum < strArraySize; tempNum++){
			BigDecimal bdTotalPriceTemp = new BigDecimal(strPriceArray[tempNum]);
			bdTotalPrice = bdTotalPrice.add(bdTotalPriceTemp);	 
		} 

		System.out.println("Total Price: " + bdTotalPrice.toString());	

		//Calculate and print final price
		BigDecimal bdDiscount = new BigDecimal(strDiscount);
		BigDecimal bdFinalPrice = new BigDecimal("0");
		bdFinalPrice = bdTotalPrice.subtract(bdTotalPrice.multiply(bdDiscount));
		
		System.out.println("Final Price: " + bdFinalPrice.toString());	
	}

}