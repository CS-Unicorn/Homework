/**
	Homework_Day_002
	problem_06
	@author programmerX
	@version default
*/
public class Test7{
	public static void main(String[] args){
		int year = 2023;
		boolean judge = (year%4==0 && year%100!=0)||(year%400==0);
		System.out.println(year + (judge==true ? "是" : "不是") + "闰年");
	}
}