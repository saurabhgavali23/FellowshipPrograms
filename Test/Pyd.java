package Test;

import java.util.*;

class Pyd {
	public static void main(String ar[]) {
		int m, k = 2, flag = 0, row;
		for (row = 1; row <= 3; row++) 
		{
			for (int i = 1; i <= 3 - row; i++) 
			{
				System.out.print(" ");
			}
			m = 1;
			while (m <= row) {
				flag = 0;
				for (int i = 2; i <= k / 2; i++) {
					if (k % i == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out.print(k + " ");
					m++;

				}

				k++;

			}
			System.out.println();
		}
	}
}
