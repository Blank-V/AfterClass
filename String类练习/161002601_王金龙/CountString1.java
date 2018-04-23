import java.util.Scanner;
class CountSubString
{
	//【变量声明】
	//方法实现
	void countSubString(String s, String substring)
	{
		String []words = s.split(" ");
		int count=0;
		for (String word:words) {
			if(word.contains(substring))
				count++;
		}
		System.out.println("检索到"+count+"个"+substring);
	}
}

public class CountString1 {
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入字符串：");
		String s=reader.nextLine();
		System.out.println("请输入你要检索的子串：");
		String substring=reader.nextLine();
		CountSubString a=new CountSubString();
		a.countSubString(s, substring);
	}

}
