package LAB_ASSIGNMENT_4;

public class Stock {
	
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	
	Stock(){
		this.symbol= "D";
		this.name= "DuttSoftware.ltd";
	}
	
	Stock(String symbol, String name, double previousClosingPrice, double currentPrice ) {
		this.symbol=symbol;
		this.name=name;
		this.previousClosingPrice=previousClosingPrice;
		this.currentPrice=currentPrice;
	}
	
	
	public double getChangePercent() {
		return ((currentPrice-previousClosingPrice) / previousClosingPrice)*100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s1= new Stock();
		System.out.println(" "+s1.symbol + " " + s1.name + " " + " the price change is "+s1.getChangePercent()+ " % ");
		Stock s2= new Stock("ORCL","Oracle Corporatin",34.5,34.35);
		System.out.println(" "+s2.symbol + " " + s2.name + " " + " the price change is "+s2.getChangePercent()+ " % ");
		
	}

}
