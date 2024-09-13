
public class ReverseWord {
	public static void main(String[] args) {
		String input="welcome to java";
		String[] word=input.split("  ");//splitting string in to to words
		//logic to reverse the given above string 
		String revstring="";
		for(String w:word) {
		String revword="";
		for(int i=w.length()-1;i>=0;i--) //welcome
		{
			revword=revstring+revword+w.charAt(i);
			
		}
		revstring=revstring+revword+" ";
		}
		
		System.out.println(revstring);
		
	}

}
