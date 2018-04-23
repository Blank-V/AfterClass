package Test;

import java.util.Scanner;
class CountSubString
{
	//【变量声明】
	//方法实现
	void countSubString(String s, String substring)
	{
		int index = s.indexOf(substring);
		if(index==-1) {
			System.out.println("未检测到" + substring);
			return;
		}
		int count = 0;
		while(index!=-1) {
			count++;
			index=s.indexOf(substring,index+1);
		}
		System.out.println("检测到"+count+"个"+substring);
	}
}

public class CountString2 {
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
