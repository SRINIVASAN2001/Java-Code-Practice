import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class MainClass1
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("C:\\Users\\ELCOT\\Desktop\\java practice prog\\Eclipse\\Interface\\src\\Interface\\InterfaceMainClass.java");
		File f2 = new File("C:\\Users\\ELCOT\\Desktop\\abc\\sample.txt");
		
		try
		{
			f2.createNewFile();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try
		{
			int size= (int) f1.length();
			char[] arr = new char[size];
			FileReader fr = new FileReader(f1);
			BufferedReader bfr = new BufferedReader(fr);
			bfr.read(arr);
			String data = new String(arr);
			fr.close();
			
			//------------------------------------------------------------------------
			
			f1.setReadable(true);
			f2.setReadable(true);
			f2.setWritable(true);
		
			//------------------------------------------------------------------------
			
			FileWriter fw = new FileWriter(f2);
			fw.write(data);		
			fw.flush();
			fw.close();
			System.err.println("Done");
			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}	
	}
}
