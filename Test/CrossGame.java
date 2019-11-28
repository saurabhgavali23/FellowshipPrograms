package Test;



import java.util.Scanner;

class TicTacToe{
	//initialize the final static variable
	final static int ROW=3;
	final static int COL=3;
	//declare the arr
	int arr[][] = new int[ROW][COL];
	char arr_char[][] = new char[ROW][COL];
	
	//constructor of TicTacToe class is initialize the arrays
	public TicTacToe() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<3;i++)
		{ 
			for(int j=0;j<3;j++)
			{
			  arr[i][j]=9;
			  arr_char[i][j]='_';
			}
		}
		
	}
	
	//show the first table of arrya
	public void showArray()
	{
		int count=1;
		for(int i=0;i<ROW;i++)
		{ 
			for(int j=0;j<COL;j++)
			{
			  System.out.print("  "+(count++)+" = "+arr_char[i][j]);	
			}
			System.out.println();
		}
	}
	
	// show the tictoctoe table 
	public void showArray1()
	{
		for(int i=0;i<ROW;i++)
		{ 
			for(int j=0;j<COL;j++)
			{
			  System.out.print("  "+arr_char[i][j]);	
			}
			System.out.println();
		}
	}
	
	//check for player win or not
	public boolean win(int val)
	{
		boolean win = false;
		//for ist player
		if(val==1)
		{
			//row
			if((arr[0][0]+arr[0][1]+arr[0][2])==3)
				win=true;
			if((arr[1][0]+arr[1][1]+arr[1][2])==3)
				win=true;
			if((arr[2][0]+arr[2][1]+arr[2][2])==3)
				win=true;
			//column
			if((arr[0][0]+arr[1][0]+arr[2][0])==3)
				win=true;
			if((arr[0][1]+arr[1][1]+arr[2][1])==3)
				win=true;
			if((arr[0][2]+arr[1][2]+arr[2][2])==3)
				win=true;
			//diagonals
			if((arr[0][0]+arr[1][1]+arr[2][2])==3)
				win=true;
			if((arr[0][2]+arr[1][1]+arr[2][0])==3)
				win=true;
		}else {//second player
			//row
			if((arr[0][0]+arr[0][1]+arr[0][2])==6)
				win=true;
			if((arr[1][0]+arr[1][1]+arr[1][2])==6)
				win=true;
			if((arr[2][0]+arr[2][1]+arr[2][2])==6)
				win=true;
			//column
			if((arr[0][0]+arr[1][0]+arr[2][0])==6)
				win=true;
			if((arr[0][1]+arr[1][1]+arr[2][1])==6)
				win=true;
			if((arr[0][2]+arr[1][2]+arr[2][2])==6)
				win=true;
			//diagonals
			if((arr[0][0]+arr[1][1]+arr[2][2])==6)
				win=true;
			if((arr[0][2]+arr[1][1]+arr[2][0])==6)
				win=true;
		}
		return win;
	}
	
	//this method set value to perticular position
	public void getPoAndVal(int po,int val,char ch)
	{
		switch(po)
		{
		case 1: arr[0][0]=val;
				arr_char[0][0]=ch;
			break;
		case 2: arr[0][1]=val;
		arr_char[0][1]=ch;
			break;
		case 3: arr[0][2]=val;
		arr_char[0][2]=ch;
			break;
		case 4: arr[1][0]=val;
		arr_char[1][0]=ch;
			break;
		case 5: arr[1][1]=val;
		arr_char[1][1]=ch;
			break;
		case 6: arr[1][2]=val;
		arr_char[1][2]=ch;
			break;
		case 7: arr[2][0]=val;
		arr_char[2][0]=ch;
			break;
		case 8: arr[2][1]=val;
		arr_char[2][1]=ch;
			break;
		case 9: arr[2][2]=val;
		arr_char[2][2]=ch;
			break;
		}
	}
}

public class CrossGame {
	public static void main(String ar[])
	{
		//take input from the console
		Scanner sc =  new Scanner(System.in);
		//class TicTacToe
		TicTacToe ttt = new TicTacToe();
		int po;
		ttt.showArray();
		int i;
		
		for(i=0;i<5;i++)
		{
				
			System.out.println("1st Player Enter the Position");
			po=sc.nextInt();
			ttt.getPoAndVal(po, 1,'X');
			ttt.showArray1();
			if(ttt.win(1))
			{
				System.out.println(".....Congo........First... Player is win the game");
				break;
			}
		
			if(i==4)
			{
				break;
			}
			System.out.println("2nd Player Enter the Position");
		    po=sc.nextInt();
			ttt.getPoAndVal(po, 2,'O');
			ttt.showArray1();
			if(ttt.win(2))
			{
				System.out.println(".....Congo........Second Player is win the game");
				break;
			}
		}
		
		if(i==4)
		{
			System.out.println("Sorry......game end......");
		}
	}
}
