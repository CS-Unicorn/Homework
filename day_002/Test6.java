/**
	Homework_Day_002
	problem_06
	@author programmerX
	@version default
*/
public class Test6{
	public static void main(String[] args){
		int x=3, y=4, z=1;
		int max = x>y ? x : y;
		max = max>z ? max : z;
		System.out.println(x+","+y+","+z+"中最大的是:"+max);
	}
}