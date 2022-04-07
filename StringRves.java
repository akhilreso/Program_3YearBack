
public class StringRves {
	public static String rversString(String str) {
		
		StringBuilder stb = new StringBuilder(str);
		StringBuilder sb = stb.reverse();
		str=sb.toString();
		return str;
		}
}

