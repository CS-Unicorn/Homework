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
		System.out.println("��������2,100���Ժ�����" + (week == 0? "��" : week));
	}
}