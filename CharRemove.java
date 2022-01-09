package hackathon;

public class CharRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  String str = "California";  
        System.out.println(charRemoveAt(str, 7));  
      } 
	
     public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);

	}

}
