import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * @ Wesam Al-Shaibani
 * since 11.11.2017
 * 
 * This class takes an input between -9999 to +9999 from type Integer and display them in word in English.
 * 
 * */
class Trafo {
	public static int x;
	public static int y;
	public static String vorzeichen;
	public static String output;

	public static String sign(int x) {
		if ((x < 0) && (x >= -9999)) {
			vorzeichen = "minus";
			return vorzeichen;
		} else
			vorzeichen = " ";
		return vorzeichen;
	}

	public static String intToString1(int x) {
		y = x % 10;

		if (x == 0) {
			return " zero ";
		}

		else if ((x == 10) || (x == (-10))) {
			return " ten ";
		} else {
			switch (y) {
			case 1:
			case -1:
				return " one ";

			case 2:
			case -2:
				return " two ";

			case 3:
			case -3:
				return " three ";

			case 4:
			case -4:
				return " four ";

			case 5:
			case -5:
				return " five ";

			case 6:
			case -6:
				return " six ";
			case 7:
			case -7:
				return " seven ";

			case 8:
			case -8:
				return " eight ";
			case 9:
			case -9:
				return " nine ";

			default:
				return " ";
			}
		}
	}

	public static String intToString11(int x) {
		y = x % 20;

		switch (y) {
		case 11:
		case -11:
			return " eleven ";
		case 12:
		case -12:
			return " twelve ";
		case 13:
		case -13:
			return " thirteen ";
		case 14:
		case -14:
			return " fourteen ";
		case 15:
		case -15:
			return " fifteen ";
		case 16:
		case -16:
			return " sixteen ";
		case 17:
		case -17:
			return " seventeen ";
		case 18:
		case -18:
			return " eighteen ";
		case 19:
		case -19:
			return " nineteen ";

		default:
			return " ";
		}
	}

	public static String intToString10(int x) {
		y = x % 100;

		if (((y > 20) && (y < 30)) || ((y > (-30)) && (y < (-20)))) {
			return " twenty " + intToString1(x);
		} else if (((y > 30) && (y < 40)) || ((y > (-40)) && (y < (-30)))) {
			return " thirty " + intToString1(x);
		} else if (((y > 40) && (y < 50)) || ((y > (-50)) && (y < (-40)))) {
			return " forty " + intToString1(x);
		} else if (((y > 50) && (x < 60)) || ((y > (-50)) && (y < (-60)))) {
			return " fifty " + intToString1(x);
		} else if (((y > 60) && (y < 70)) || ((y > (-70)) && (y < (-60)))) {
			return " sixty " + intToString1(x);
		} else if (((y > 70) && (y < 80)) || ((y > (-80)) && (y < (-70)))) {
			return " seventy " + intToString1(x);
		} else if (((y > 80) && (y < 90)) || ((y > (-90)) && (y < (-80)))) {
			return " eighty " + intToString1(x);
		} else if (((y > 90) && (y < 100)) || ((y > (-100)) && (y < (-90)))) {
			return " ninety " + intToString1(x);
		}
		switch (y) {

		case 20:
		case -20:
			return " twenty ";

		case 30:
		case -30:
			return " thirty ";

		case 40:
		case -40:
			return " forty ";

		case 50:
		case -50:
			return " fifty ";

		case 60:
		case -60:
			return " sixty ";

		case 70:
		case -70:
			return " seventy ";

		case 80:
		case -80:
			return " eighty ";

		case 90:
		case -90:
			return " ninety ";

		default:
			return " ";

		}
	}

	public static String intToString100(int x) {
		y = x % 1000;

		if ((y > 100 && y < 200) || (y > (-200) && y < (-100))) {
			return " one hundred " + intToString10(x);
		} else if ((y > 200 && y < 300) || (y > (-300) && y < (-200))) {
			return " two hundred " + intToString10(x);
		} else if ((y > 300 && y < 400) || (y > (-400) && y < (-300))) {
			return " three hundred " + intToString10(x);
		} else if ((y > 400 && y < 500) || (y > (-500) && y < (-400))) {
			return " four hundred " + intToString10(x);
		} else if ((y > 500 && y < 600) || (y > (-600) && y < (-500))) {
			return " five hundred " + intToString10(x);
		} else if ((y > 600 && y < 700) || (y > (-700) && y < (-600))) {
			return " six hundred " + intToString10(x);
		} else if ((y > 700 && y < 800) || (y > (-800) && y < (-700))) {
			return " seven hundred " + intToString10(x);
		} else if ((y > 800 && y < 900) || (y > (-900) && y < (-800))) {
			return " eight hundred " + intToString10(x);
		} else if ((y > 900 && y < 1000) || (y > (-1000) && y < (-900))) {
			return " nine hundred " + intToString10(x);
		}
		switch (y) {
		case 100:
		case -100:
			return " one hundred ";

		case 200:
		case -200:
			return " two hundred ";

		case 300:
		case -300:
			return " three hundred ";

		case 400:
		case -400:
			return " four hundred ";

		case 500:
		case -500:
			return " five hundred ";

		case 600:
		case -600:
			return " six hundred ";
		case 700:
		case -700:
			return " seven hundred ";

		case 800:
		case -800:
			return " eight hundred ";
		case 900:
		case -900:
			return " nine hundred ";

		default:
			return " ";

		}
	}

	public static String intToString1000(int x) {
		y = x % 10000;

		if ((y > 1000 && y < 2000) || (y > (-2000) && y < (-1000))) {
			return " one thousand " + intToString100(x);
		} else if ((y > 2000 && y < 3000) || (y > (-3000) && y < (-2000))) {
			return " two thousand " + intToString100(x);
		} else if ((y > 3000 && y < 4000) || (y > (-4000) && y < (-3000))) {
			return " three thousand " + intToString100(x);
		} else if ((y > 4000 && y < 5000) || (y > (-5000) && y < (-4000))) {
			return " four thousand " + intToString100(x);
		} else if ((y > 5000 && y < 6000) || (y > (-6000) && y < (-5000))) {
			return " five thousand " + intToString100(x);
		} else if ((y > 6000 && y < 7000) || (y > (-7000) && y < (-6000))) {
			return " six thousand " + intToString100(x);
		} else if ((y > 7000 && y < 8000) || (y > (-8000) && y < (-7000))) {
			return " seven thousand " + intToString100(x);
		} else if ((y > 8000 && y < 9000) || (y > (-9000) && y < (-8000))) {
			return " eight thousand " + intToString100(x);
		} else if ((y > 9000 && y < 10000) || (y > (-10000) && y < (-9000))) {
			return " nine thousand " + intToString100(x);
		}
		switch (y) {
		case 1000:
		case -1000:
			return " one thousand ";

		case 2000:
		case -2000:
			return " two thousand ";

		case 3000:
		case -3000:
			return " three thousand ";

		case 4000:
		case -4000:
			return " four thousand ";

		case 5000:
		case -5000:
			return " five thousand ";

		case 6000:
		case -6000:
			return " six thousand ";
		case 7000:
		case -7000:
			return " seven thousand ";

		case 8000:
		case -8000:
			return " eight thousand ";
		case 9000:
		case -9000:
			return " nine thousand ";

		default:
			return " ";

		}
	}

	public static String chooseMethod(int x) {

		if ((x >= (-10)) && (x <= 10)) {
			return sign(x) + intToString1(x);
		} else if (((x >= (-19)) && (x <= (-11))) || ((x >= 11) && (x <= 19))) {
			return sign(x) + intToString11(x);
		} else if (((x >= (-99)) && (x <= (-20))) || (((x >= (20)) && (x <= (99))))) {
			return sign(x) + intToString10(x);
		} else if (((x >= (-999)) && (x <= -100)) || ((x >= 100) && (x <= 999))) {
			return sign(x) + intToString100(x);
		} else if ((x >= (-9999)) && (x <= (-1000)) || ((x >= 1000) && (x <= 9999))) {
			return sign(x) + intToString1000(x);
		} else
			
		{
			return "Nur Zahlen zwischen -9999 und +9999 !";
		}
	}

	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);

		//System.out.println("Geben Sie eine Zahl zwischen -9999 und +9999 ein:      ");
		 x = Integer.parseInt(JOptionPane.showInputDialog("Input a number between -9999 and +9999"));
		//x = scanner.nextInt();
		chooseMethod(x);
		JOptionPane.showMessageDialog(null,chooseMethod(x)," ",JOptionPane.INFORMATION_MESSAGE);
		//System.out.println(chooseMethod(x));
		//scanner.close();
	}
}