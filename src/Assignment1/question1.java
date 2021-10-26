package Assignment1;
import java.util.Scanner;

	public class question1 {

		public static void main(String[] args) {
			System.out.println("press 1 for red light");

			System.out.println("press 2 for yellow light");
			System.out.println("press 3 yor green light");
			System.out.println("enter your choise:");
			Scanner sc = new Scanner(System.in);
			int choise = sc.nextInt();
			question1 n = new question1();
			switch (choise) {
			case 1:
				n.red();
				break;
			case 2:
				n.yellow();
				break;
			case 3:
				n.green();
				break;
			}
			System.out.println("abcd");

		}

		void red() {
			System.out.println("STOP");
		}

		void yellow() {
			System.out.println("READY");
		}

		void green() {
			System.out.println("GO");
		}

	}


