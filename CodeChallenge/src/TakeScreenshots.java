import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class TakeScreenshots 
{
	public static void main(String[] args) 
	{
		String format="jpg";
		String filename="screenshot."+format;
		Rectangle screenRect,captureRect;
		BufferedImage screenImage;
		try
		{
			screenRect=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			screenImage=new Robot().createScreenCapture(screenRect);
			ImageIO.write(screenImage,format,new File(filename));
			
			System.out.println("Screenshot saved");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
