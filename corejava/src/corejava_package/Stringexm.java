package corejava_package;

public class Stringexm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String ("Hello");
		
		str = str.concat(" Fahad");
		System.out.println(str);
		String str2 = " Fahad";
		str = str.concat(str2);
		System.out.println(str);
		System.out.println(str.charAt(1));
	}

}
