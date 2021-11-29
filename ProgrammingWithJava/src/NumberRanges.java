
public class NumberRanges {

	public static void main(String[] args) {
		
		String str = "Navin Reddy";
		MyPrinter mp = new MyPrinter();
//		mp.print(str, new Parser() // THis is inner class (we doing this because we cannot create and object of an interface
//				{
//					public String parse(String s) {
//						
//						return StringParser.convert(s);
//					}
//				});
		
		mp.print(str, (StringParser::convert)); // Method reference

	}

}

class MyPrinter
{
	public void print(String str, Parser p) {
		
		str = p.parse(str);
		System.out.print(str);
	}
}

interface Parser
{
	String parse(String str);
}

class StringParser
{
	public static String convert(String s) {
		
		if (s.length() <= 3)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		
		return s;
	}
}

