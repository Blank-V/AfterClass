import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileIO {

  public static void main(String[] args) {
  RandomAccessFile in =null;

  System.out.println("请输入要处理的文件名:");
  Scanner Reader = new Scanner(System.in);
  String name = Reader.nextLine();
  System.out.println("本程序的任务是:");
  System.out.println("将\""+name+"\"中的姓名“李善”改成“王山”。");
  System.out.println("将\""+name+"\"中原有信息之后继续添加学生信息");
  
  try {
   
    in = new RandomAccessFile(name, "rw");
    long length =in.length();
    long position= 0;
    long pre=0;
    in.seek(position);
    while(position<length)
    { 
      String str = in.readLine();
      byte b[]=str.getBytes("iso-8859-1");
      str = new String(b);
      pre=position; 
      position = in.getFilePointer();
      if(str.contains("李善"))
      {
        System.out.println("position :"+position);
        String str2 =str.replace("李善","王山");
        byte c[] =str2.getBytes();
        in.seek(pre);
        in.write(c);
        in.writeBytes("\r\n");  //写入换行
        position = in.getFilePointer();
        System.out.println("position :"+position);
      } 
    }
    System.out.println("文件\""+name+"\"中的姓名“李善”已经改成“王山”。请查阅！");
    System.out.println("请继续向文件\""+name+"\"中添加心得学生信息，以finish结束");
    String info =null;
    while(!(info=Reader.nextLine()).equals("finish"))
    {
      in.seek(position);
      in.write(info.getBytes());
      in.writeBytes("\r\n");  //写入换行
      position=in.getFilePointer();
    }
  } catch (Exception e) {
    // TODO: handle exception
  }
  }
}
