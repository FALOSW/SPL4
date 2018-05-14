import javax.swing.JOptionPane;

public class Game {

	static int _zeilen = 3;
	static int _spalten = 3;
	static String[][] minenfeld = spielfeldAnlegen(_zeilen, _spalten, true);
	static String[][] spielfeld = spielfeldAnlegen(_zeilen, _spalten, false);
	static int mines = 0;

	public static void main(String[] args) {
		boolean ende = false;
		while (ende == false) {
			SpielfeldAnzeigen();
			int posZeile = eingabe("Bitte eine Zeile wählen!");
			int posSpalte = eingabe("Bitte eine Spalte wählen!");
			ende = spielfeldPrüfen(posZeile, posSpalte);
		}
	}

	public static boolean spielfeldPrüfen(int zeile, int spalte) {
		if (minenfeld[zeile][spalte] == "[x]") {
			spielfeld[zeile][spalte] = "[X]";
			SpielfeldAnzeigen();
			System.out.println("Bumm, du hast die Bombe erwischt!");
			System.out.println("Game Over!");
			return true;
		} else {
			spielfeld[zeile][spalte] = "[*]";
			return false;
		}

	}

	public static String[][] spielfeldAnlegen(int zeilen, int spalten, boolean minen) {
		String[][] mineField = new String[zeilen][spalten];
		for (int z = 0; z < _zeilen; z++) {
			for (int s = 0; s < _spalten; s++) {
				mineField[z][s] = "[ ]";
			}
		}
		if (minen == true) {
			mineField[0][1] = "[x]";
			mineField[(zeilen - 1)][0] = "[x]";
			mineField[(spalten - 1)][2] = "[x]";
			mines = 3;
		}
		return mineField;
	}

	public static void SpielfeldAnzeigen() {
		for (int z = 0; z < _zeilen; z++) {
			for (int s = 0; s < _spalten; s++) {
				System.out.print(spielfeld[z][s]);
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}

	public static int eingabe(String hinweis) {
		String eingabe = JOptionPane.showInputDialog(hinweis);
		return Integer.parseInt(eingabe);

	}

}
