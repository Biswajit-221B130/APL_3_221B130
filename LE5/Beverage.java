abstract class Beverage
{
	void pour (int qty) {
	    System.out.println("Add " + qty + "ml of Beverage");
	}
	
	protected abstract void addCompliment();
	protected void stir() {};
	private void serve () {
	    System.out.println("Serve through waiter");
	   
	} 
	
	public void templateMethod(int qty) {
	    pour(qty);
	    addCompliment();
	    stir();
	    serve();
	}
}
