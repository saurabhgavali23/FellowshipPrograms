package Test;

import java.util.Scanner;

public class TicTacToeGame {
	
	
	public static void player1Move(int arr[][],char arr1[][],int pos)
	{
		int a=(pos-1)/3;
		int b=(pos-1)%3;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==a && j==b)
				{
					arr[i][j]=1;
					arr1[i][j]='X';
				}
			}
		}
	}
	
	public static void player2Move(int arr[][],char arr1[][],int pos)
	{
		int a=(pos-1)/3;
		int b=(pos-1)%3;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==a && j==b)
				{
					arr[i][j]=2;
					arr1[i][j]='O';
				}
			}
		}
	}
	
	
	public static boolean checkWhoWins(int arr[][],int player)
	{
		if(player==1)
		{
			if(arr[0][0]+arr[0][1]+arr[0][2]==3 || arr[1][0]+arr[1][1]+arr[1][2]==3 || arr[2][0]+arr[2][1]+arr[2][2]==3
					|| arr[0][0]+arr[1][0]+arr[2][0]==3 || arr[0][1]+arr[1][1]+arr[2][1]==3 || arr[0][2]+arr[1][2]+arr[2][2]==3
					|| arr[0][0]+arr[1][1]+arr[2][2]==3 || arr[0][2]+arr[1][1]+arr[2][0]==3)
			{
				return true;
			}
		}
		
		if(player==2)
		{
			if(arr[0][0]+arr[0][1]+arr[0][2]==6 || arr[1][0]+arr[1][1]+arr[1][2]==6 || arr[2][0]+arr[2][1]+arr[2][2]==6
					|| arr[0][0]+arr[1][0]+arr[2][0]==6 || arr[0][1]+arr[1][1]+arr[2][1]==6 || arr[0][2]+arr[1][2]+arr[2][2]==6
					|| arr[0][0]+arr[1][1]+arr[2][2]==6 || arr[0][2]+arr[1][1]+arr[2][0]==6)
			{
				return true;
			}
		}
		return false;
		
	}
	
	public static void display(char arr1[][])
	{
		int n=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(++n+"=| "+arr1[i][j]+" |");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		

		int arr[][]=new int[3][3];
		char arr1[][]=new char[3][3];
		int len=arr.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				arr1[i][j]='_';
				arr[i][j]='_';
			}
		}
		
		System.out.println("====TicTocToeGame====");
		display(arr1);
		System.out.println();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the player 1 position");
			Scanner s=new Scanner(System.in);
			int pos=s.nextInt();
			player1Move(arr, arr1, pos);
			display(arr1);
			if(checkWhoWins(arr, 1))
			{
				System.out.println("Player 1 is won");
				break;
			}
			if(i==4)
			{
				System.out.println("NoBudy won");
				break;
			}
			
			System.out.println("Enter the player 2 position");
			int pos1=s.nextInt();
			player2Move(arr, arr1, pos1);
			display(arr1);
			if(checkWhoWins(arr, 2))
			{
				System.out.println("Player 2 is won");
				break;
			}
		}
	}
}