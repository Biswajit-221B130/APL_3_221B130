//Biswajit Kabi 221B130
public class Main
{
	public static void main(String[] args) {
		Mother m = new Mother();
		m.show();
		Child ch = new Child();
		ch.show();
		//polymorphism
		Mother m1 = new Child();
		m1.show();
	}
}
