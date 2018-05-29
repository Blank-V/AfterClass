import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileIO {

  public static void main(String[] args) {
  RandomAccessFile in =null;

  System.out.println("������Ҫ������ļ���:");
  Scanner Reader = new Scanner(System.in);
  String name = Reader.nextLine();
  System.out.println("�������������:");
  System.out.println("��\""+name+"\"�е����������ơ��ĳɡ���ɽ����");
  System.out.println("��\""+name+"\"��ԭ����Ϣ֮��������ѧ����Ϣ");
  
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
      if(str.contains("����"))
      {
        System.out.println("position :"+position);
        String str2 =str.replace("����","��ɽ");
        byte c[] =str2.getBytes();
        in.seek(pre);
        in.write(c);
        in.writeBytes("\r\n");  //д�뻻��
        position = in.getFilePointer();
        System.out.println("position :"+position);
      } 
    }
    System.out.println("�ļ�\""+name+"\"�е����������ơ��Ѿ��ĳɡ���ɽ��������ģ�");
    System.out.println("��������ļ�\""+name+"\"������ĵ�ѧ����Ϣ����finish����");
    String info =null;
    while(!(info=Reader.nextLine()).equals("finish"))
    {
      in.seek(position);
      in.write(info.getBytes());
      in.writeBytes("\r\n");  //д�뻻��
      position=in.getFilePointer();
    }
  } catch (Exception e) {
    // TODO: handle exception
  }
  }
}
