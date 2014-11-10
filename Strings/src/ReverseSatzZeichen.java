
public class ReverseSatzZeichen {

	public String reverse(String text) {
		int strLength = text.length() - 1;
		String reverse = "", temp = "";

		for (int i = 0; i <= strLength; i++) {
			if (Character.isLetter(text.charAt(i))) {
				temp += text.charAt(i);
			}
			if (Character.isLetter(text.charAt(i)) == false) {
				for (int j = temp.length() - 1; j >= 0; j--) {
					reverse += temp.charAt(j);
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
					reverse += temp.charAt(j);
				}
				temp = "";
			}
		}

		return reverse;
	}
}