package palindrome;

public class PalindromeFounder {
	public String toNBased(int dec,int base,String rslt){
		int rem = dec%base;
		int quo = (dec-rem)/base;
		if(quo<base){
			rslt=Integer.toString(quo)+Integer.toString(rem)+rslt;
			return rslt;
		}else{
			rslt=Integer.toString(rem)+rslt;
			return toNBased(quo,base,rslt);
		}
		
	}
}
