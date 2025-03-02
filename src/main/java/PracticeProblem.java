public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String pyramid(int rows){
		String result = "";
		for (int i = 1; i <= rows; i++){
			if (rows > 1) { // to prevent space before asterisk if rows = 1
				for (int j = 0; j < rows - i; j++){ // the number of spaces decrease as the row number increases
					result += " "; // add spaces for the pyramid before the astrisks
				}
			}
			for (int k = 0; k < i; k++){
				result += "*"; // adds asterisks inbetween the spaces above
				if (k < i - 1){
					result += " "; // space between asterisks
				}
			}
			if (i < rows) {
				result += "\n"; // moves it to the next line
			}
		}
		return result;
	}
	public static String square(int size){
		String result = "";
		for (int i = 0; i < size; i++){ // row
			for (int j = 0; j < size; j++){ // column
				if (i == 0 || i == size - 1 || j == 0 || j == size - 1){ // i == 0 - top border, i == szie - 1 - bottom border, j == 0 - left border
					result += "*";
				}
				else {
					result += " ";
				}
			}
			if (i < size-1) {
				result += "\n"; // moves it to the next line
			}
		}
		return result;
	}
	public static boolean hasLowercase(String str){
		for (int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z'){ // check if character is in lowercase ASCII value ranges
				return true;
			}
		}
		return false; 

	}
}
