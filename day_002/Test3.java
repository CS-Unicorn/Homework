/**
	Homework_Day_002
	problem_03
	@author programmerX
	@version default
*/
public class Test3{
	public static void main(String[] args){
		int a1=10, a2=11;
		boolean result1 = a1%2==0 ? true : false;
		boolean result2 = a2%2==0 ? true : false;
		System.out.println("ÅÐ¶Ïa1=10ÊÇ·ñÎªÅ¼?  " + result1);
		System.out.println("ÅÐ¶Ïa2=11ÊÇ·ñÎªÅ¼?  " + result2);
		
		int a3=12, a4=13;
		System.out.println("ÅÐ¶Ïa3=12ÊÇ·ñÎªÆæ?  " + (a3%2==1));
		System.out.println("ÅÐ¶Ïa3=13ÊÇ·ñÎªÆæ?  " + (a4%2==1));
	}
}