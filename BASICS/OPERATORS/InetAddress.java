import java.net.InetAddress;
public class InetAddress
{
	public static void main(String args[])
	{
	    try{
	        InetAddress ip = InetAddress.getByName("https://www.apnacollege.in/?msg=not-logged-in");
	        System.out.println(ip.getHostName());
	        System.out.println(ip.getHostAddress());
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	}
}