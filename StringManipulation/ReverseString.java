package StringManipulation;


class ReverseString{

	public static void main(String[] args) {
		
	String str = "name";
	String nstr = "";
	
	for(int i=0;i<str.length();i++) {
		
		nstr = str.charAt(i)+nstr;
	}
	System.out.println(nstr);
	}
}
