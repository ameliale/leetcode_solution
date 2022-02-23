package easy;

public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "11";
		String str2 = "9";
		String str3 = "8";
		String str4 = "15";
		
		System.out.println(solution(str1, str2));
		System.out.println(solution(str3, str4));
			
	}
	
	public static String solution(String a, String b) {
	    
	    String result = "";
	    char[] tempA = a.toCharArray();
	    char[] tempB = b.toCharArray();
	    
	    int length = 0;
	    
	    if(tempA.length < tempB.length)
	    {
	        length = tempA.length;
	    }
	    else{
	        length = tempB.length;
	    }
	    
	    int[] sum = new int[length];
	    
	    for(int i = 0; i < length; i++)
	    {
	        if(tempA.length > tempB.length)
	        {
	            sum[i] = Integer.parseInt(String.valueOf(tempA[i + tempA.length - length])) + Integer.parseInt(String.valueOf(tempB[i]));
	        }
	        else
	        {
	            sum[i] = Integer.parseInt(String.valueOf(tempB[i + tempB.length - length])) + Integer.parseInt(String.valueOf(tempA[i]));
	        }
	    }
	    
	    if(tempA.length < tempB.length)
	    {
	        for(int i = 0; i < tempB.length - length; i++)
	        {
	            result = result + tempB[i];
	        }
	        for(int i = 0; i < sum.length; i++)
	        {
	            result = result + sum[i];
	        }
	    }
	    else{
	        for(int i = 0; i < tempA.length - length; i++)
	        {
	            result = result + tempA[i];
	        }
	        for(int i = 0; i < sum.length; i++)
	        {
	            result = result + sum[i];
	        }
	    }


	    return result;
	}


}

