import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		String userNum;
		String userEmail;
		String userBday;

		System.out.println("Enter your birthday in a numerical expression: ");
		userBday = scan.nextLine();
		if (birthDate(userBday)) {
			System.out.println("Birthday is Valid");
		} else {
			System.out.println("Birthday is not Valid");
		}

		System.out.println("Enter your email address: ");
		userEmail = scan.nextLine();
		if (eMail(userEmail)) {
			System.out.println("Email address is Valid");
		} else {
			System.out.println("Email is not Valid");
		}

		System.out.println("Enter a phone number: ");
		userNum = scan.nextLine();
		if (testPhoneNum(userNum)) {
			System.out.println("Number is valid");
		} else {
			System.out.println("Number is not Valid");
		}

		System.out.println("Enter your name: ");
		userName = scan.nextLine();
		if (correctName(userName)) {
			System.out.println("Name is Valid");
		} else {
			System.out.println("Name is not Valid");
		}
	}

	private static boolean correctName(String userName) {
		boolean isValid = false;
		if (userName.matches("[A-Z][a-z]{1,29}")) {
			isValid = true;
		}
		return isValid;

	}

	public static boolean testPhoneNum(String userNum) {
		boolean isValid = false;
		if (userNum.matches("\\d{3}-\\d{3}-\\d{4}")) {
			isValid = true;
		}
		return isValid;
	}

	public static boolean eMail(String userEmail) {
		boolean isValid = false;
		if (userEmail.matches("[a-z]{5,30}\\@[a-z]{5,10}\\.[a-z]{0,3}")) {
			isValid = true;
		}
		return isValid;
	}

	public static boolean birthDate(String userBday) {
		boolean isValid = false;
		if (userBday.matches("\\d{2}\\/\\d{2}\\/\\d{4}")) {
			isValid = true;
		}
		return isValid;
	}
}
