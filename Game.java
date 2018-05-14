
public class Game {

	static int _zeilen = 3;
	static int _spalten = 3;

	public static void main(String[] args) {
		String[][] feld = spielfeldAnlegen(3, 3);
		// feld = mineSetzen(0,3);
		SpielfeldAnzeigen(feld, _zeilen, _spalten);
	}

	public static String[][] spielfeldAnlegen(int zeilen, int spalten) {
		String[][] mineField = new String[zeilen][spalten];
		for (int z = 0; z < zeilen; z++) {
			for (int s = 0; s < spalten; s++) {
				mineField[z][s] = "[ ]";
			}
		}
		return mineField;
	}

	public static void SpielfeldAnzeigen(String[][] Feld, int zeilen, int spalten) {
		for (int z = 0; z < zeilen; z++) {
			for (int s = 0; s < spalten; s++) {
				System.out.print(Feld[z][s]);
			}
			System.out.println();
		}

	}
}
