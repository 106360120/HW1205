package test_p35;

import java.io.*;

public class test_p35 {

	public static void main(String[]args) {
		
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("Goodbye");
			
			pw.close();
			
			System.out.println("��Ƥw�g�g�J�ɮפF");
		}
		
		catch(IOException e)
		{
			System.out.println("��J�o�Ϳ��~");
		}
		
		
	}
}
