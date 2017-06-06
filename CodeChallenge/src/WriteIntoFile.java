import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class WriteIntoFile 
{
	public void writeEntry(ArrayList al) throws IOException
	{
		File file=new File("demo.txt");
		FileOutputStream fout=new FileOutputStream(file);
		BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(fout));
		
		for(int i=0;i<al.size();i++)
		{
			bfw.write((String)al.get(i));
			bfw.newLine();
		}
		bfw.close();
	}
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<40;i++)
		{
			al.add("This is a string");
		}
		try
		{
			new WriteIntoFile().writeEntry(al);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
