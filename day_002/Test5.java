/**
	Homework_Day_002
	problem_05
	@author programmerX
	@version default
*/
public class Test5{
	public static void main(String[] args){
		int week = 2;
		week += 100;
		week %= 7;
		System.out.println("今天是周2,100天以后是周" + (week == 0? "日" : week));
	}
}