package project2016;

import java.util.Arrays;

public class Payment extends Ticket {
protected boolean discount;
protected char payment;

	public Payment(String time, char dimension, String typ, int price, int[][] platz, boolean discount, char payment) {
		super(time, dimension, typ, price, platz);
	setDiscount(discount);
	setPayment(payment);
	}

	public boolean isDiscount() {
		
		return discount;
	}

	public void setDiscount(boolean discount) {

		this.discount = discount;
		
	}

	public char getPayment() {
		return payment;
	}

	public void setPayment(char payment) {
		if(payment=='K' || payment=='B')
		this.payment = payment;
	}
	
	
	@Override
	public String toString() {
		return "Payment [discount=" + discount + ", payment=" + payment + ", getTime()=" + getTime()
				+ ", getDimension()=" + getDimension() + ", getTyp()=" + getTyp() + ", getPrice()=" + getPrice()
				+ ", getPlatz()=" + Arrays.toString(getPlatz()) + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	public void printInfo(){
		System.out.println(toString());
	}
}
