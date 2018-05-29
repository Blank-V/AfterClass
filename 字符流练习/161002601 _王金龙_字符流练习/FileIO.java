
import java.util.Scanner;
import java.io.*;


public class FileIO {
 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String filename1,filename2;
		System.out.println("请输入第一个文件的路径与文件名:");
		filename1=in.nextLine();
		System.out.println("请输入第二个文件的路径与文件名:");
		filename2 = in.nextLine();
		
		System.out.println("第一个文件存放学生的姓名，数学成绩和计算机成绩，各项之间用空格隔开");
		File file =new	File(filename1);
		
		FileWriter fw =null;
		BufferedWriter bw = null;
		System.out.println("请向第一个文件输入内容，以finish结束");
		String info=null;
		try
		{
		fw = new FileWriter(file,true);
		bw = new BufferedWriter(fw);
		while(!(info=in.nextLine()).equals("finish"))
		{
				bw.write(info);
				bw.newLine();
		}
		bw.flush();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//读写文件 
		
		File file2 =new File(filename2);
		
		String info2=null;
		try
		{
			BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file2,true));
			while((info2 = read.readLine())!=null)
			{
			    if(info2.charAt(0)=='张')
			    {
			    	writer.write(info2);
			    	writer.newLine();
			    }
			}
			read.close();
			writer.flush();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("第一个文件中姓\"张\"的学生的信息已经存放到第二个文件,请到其存放路径查询");
		in.close();
	}	
	
	
	
}
