/*Assignment - 87 : 30th July'2024
print a method to find whether given Strings are anagram.
write solution one with sorting another without sorting.

input : listen, silent
output : Anagram

input : techno, echtoo
output : Not an angram*/

package anagram;

import java.util.Arrays;

public class Assignment87 {

	void isStringAnagram(String str1, String str2) {
		String orgStr1 = str1;
		String orgStr2 = str2;

		boolean flag = true;
		if (str1.length() != str2.length()) {
			flag = false;
		}

		while (str1.length() > 0) {
			char ch = str1.charAt(0);
			str1 = str1.replace(String.valueOf(ch), "");
			str2 = str2.replace(String.valueOf(ch), "");

			if (str1.length() != str2.length()) {
				flag = false;
			}
		}

		if (flag) {
			System.out.println(orgStr1 + " and " + orgStr2 + " are anagram");
		} else {
			System.out.println(orgStr1 + " and " + orgStr2 + " are not anagram");
		}

	}

	void isStringAnagramWithSort(String str1, String str2) {
		boolean flag = true;
		if (str1.length() == str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				flag = false;
			}
		}
		if (!flag) {
			System.out.println(str1 + " and " + str2 + " are anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram");
		}
	}

	public static void main(String[] args) {
		Assignment87 assignment87 = new Assignment87();
		assignment87.isStringAnagram("listen", "silent");
		assignment87.isStringAnagram("techno", "echtoo");
		assignment87.isStringAnagramWithSort("naman", "maann");
		assignment87.isStringAnagramWithSort("dessert", "stressed");
	}
}
