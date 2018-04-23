import java.util.Scanner;

interface UnitPrice
{
	public double unitprice();
}

class TV implements UnitPrice {
	private double price;
	public TV() {
		price = 1999;
	}
	public  TV(double pri) {
		price=pri;

	}
	public void setPrice(double price) {
		this.price = price;
	}

	public double unitprice() {
		return price;
	}
}
class Computer implements UnitPrice{
	private double price;

	public Computer() {
		price =5999;

	}

	public Computer(double pri) {
		price=pri;

	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double unitprice() {
		return price;
	}
}
class Phone implements UnitPrice{
	private double price;

	public Phone() {
		price = 3999;
	}
	public Phone(double pri){
		price=pri;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double unitprice() {
		return price;
	}
}

public class Unit {
	static double get(UnitPrice u)
	{
		return u.unitprice();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请分别输入电视、计算机和手机的销售个数：");
		int  tv =in.nextInt();
		int computer =in.nextInt();
		int phone = in.nextInt();
		System.out.printf("总销售额: %.1f",tv*get(new TV(2000))+computer*get(new Computer(6000))+phone*get(new Phone(5000)));

	}

}
