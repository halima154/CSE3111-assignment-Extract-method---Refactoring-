package refactoring;

public class Refactor{
	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	
	void printOwing(){
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		printBanner();
		printDetails(outstanding);
	}
        while(e.hasMoreElements()){
                Order each = (Order) e.nextElement();
                outstanding += each.getAmount();	
        }
	public void printDetails(double outstanding) {
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
	}

	public void printBanner() {
		System.out.println("***************************");
		System.out.println("***** Customer Owes *******");
		System.out.println("***************************");
	}
}