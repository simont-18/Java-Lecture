public class Main {
	public static void main(String args[]) {
		Employee a = new HourlyEmployee("David", "Tran", "12322323", 8.23, 8);
		System.out.println(a + "\ntotal earning: $" + a.earnings());
	}
}