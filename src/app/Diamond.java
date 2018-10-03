package app;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			int n = 3;
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				if (k % 2 == 0) {
					System.out.print(k + 1);
				} else if (k == 3) {
					System.out.print(k + 2);
				} else {
					System.out.print(k);
				}
			}
			for (int l = 2; l <= i; l++) {
				if (l % 2 == 0) {
					System.out.print(l + 1);
				} else {
					System.out.print(l + 2);
				}
			}
			System.out.println();
		}
		for (int i = 2; i >= 1; i--) {
			int n = 2;
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				if (k % 2 == 0) {
					System.out.print(k + 1);
				} else {
					System.out.print(k);
				}
			}
			for (int l = 2; l <= i; l++) {
				if (l % 2 == 0) {
					System.out.print(l + 1);
				} else {
					System.out.print(l);
				}
			}
			System.out.println();
		}

	}

}
