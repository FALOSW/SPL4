
public class Game {

	public static void main(String[] args) {
		String[][] feld = spielfeldAnlegen(3,3);
		// feld = mineSetzen(0,3);
		System.out.println(feld.toString());
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
	
	
}
