package Test;

public class RandomNumberDemo {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
		long  rd=(long)(1000000000*Math.random()*10);
		System.out.println(rd+i);
		}
	}

}
