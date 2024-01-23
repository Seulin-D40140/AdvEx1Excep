import java.util.*;

public class FoundExeption {

	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		
		try 
		{
			System.out.println(date.getClass().getName());
		}
		catch (NullPointerException e) 
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println(today.getClass().getName());
		}
	}
}
// la methode getclass() fait parti de la librairie Date 