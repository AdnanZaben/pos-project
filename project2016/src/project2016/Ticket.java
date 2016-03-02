package project2016;

public class Ticket {

	protected String time;
	protected char dimension;
	protected String typ;
	protected int price;
	protected int[][] platz;
	
	
	
	public Ticket(String time, char dimension, String typ, int price, int[][] platz) {
		super();
		setTime(time);
		setDimension(dimension);
		setTyp(typ);
		setPrice(price);
		setPlatz(platz);
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		if(time!=null && time.length()>0){
		this.time = time;}
	}



	public char getDimension() {
		return dimension;
	}



	public void setDimension(char dimension) {
		this.dimension = dimension;
	}



	public String getTyp() {
		return typ;
	}



	public void setTyp(String typ) {
		if(typ!=null && typ.length()>0){
		this.typ = typ;}
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		if(price>=6 && price <= 20){
		this.price = price;}
	}



	public int[][] getPlatz() {
		return platz;
	}



	public void setPlatz(int[][] platz) {
		this.platz = platz;
	}
	
	

	
}


