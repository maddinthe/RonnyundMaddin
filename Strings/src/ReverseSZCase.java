
public class ReverseSZCase {

	public String reverse(String text) {
		int strLength = text.length() - 1;
		String reverse = "", temp = "";
		boolean upper = false;
		for (int i = 0; i <= strLength; i++) {
			if (Character.isLetter(text.charAt(i))) {

				temp += Character.toLowerCase(text.charAt(i));

				if (Character.isUpperCase(text.charAt(i))) {
					upper = true;
				}

			}
			if (Character.isLetter(text.charAt(i)) == false) {
				for (int j = temp.length() - 1; j >= 0; j--) {
					if ((upper == true) && (j == temp.length() - 1)) {
						reverse += Character.toUpperCase(temp.charAt(j));
						upper = false;
					} else {
						reverse += temp.charAt(j);
					}
					if (j == 0) {
						if (text.charAt(i) == ' ') {
							reverse += text.charAt(i);
						} else {
							reverse += text.charAt(i);
							reverse += ' ';
						}
					}
				}
				temp = "";
			} else if (i == strLength) {
				for (int j = temp.length() - 1; j >= 0; j--) {
					if ((upper == true) && (j == temp.length() - 1)) {
						reverse += Character.toUpperCase(temp.charAt(j));
						upper = false;
					} else {
						reverse += temp.charAt(j);
					}
				}
				temp = "";
			}
		}

		return reverse;
	}
}