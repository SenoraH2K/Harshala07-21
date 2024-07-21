package www.automatiom.IIT;

public class StringEX
{
	public static void main(String[] args) {
		String s = "         + 160.199";
		double d = Double.parseDouble(s.replace("+", ""));
		System.out.println(d);
		String formattedvalue = String.format("%.4f", d);
		System.out.println(formattedvalue);
		
		
		double d1 = 20.00;
		double d2 = 20.000001;
		if(d1==d2)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}