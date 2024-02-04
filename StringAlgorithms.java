package com.example.myproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAlgorithms {

	static String reverseString(String s) {
		char[] c = s.toCharArray();

		for (int i = 0, j = c.length - 1; i < j; i++, j--) {

			char k = c[i];
			c[i] = c[j];
			c[j] = k;

		}

		return new String(c);
	}

	static Map<String, Integer> countVowelsInString(String s) {
		Map<String, Integer> map = new HashMap<>();

		String vowels = "aeiouAEIOU";

		for (char c : s.toCharArray()) {

			if (vowels.contains(String.valueOf(c))) {

				map.put(String.valueOf(c), map.getOrDefault(String.valueOf(c), 0) + 1);

			}
		}
		return map;
	}
	
	

    public static int occurrenceOfString(String str, String subStr) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String currentSubstring = str.substring(i, i + 3);
            System.out.println(currentSubstring);

            if (currentSubstring.equals(subStr)) {
                count++;
            }
        }

        return count;
    }

	public static void main(String[] args) {

		String s = "hello i am here";
		s = reverseString(s);
		Map<String, Integer> map = countVowelsInString(s);
		System.out.println(s);
		
		System.out.println(map);
		
		
		String inputString = "abababab";
        String substringToFind = "aba";
        int occurrences = occurrenceOfString(inputString, substringToFind);

        System.out.println("Occurrences of '" + substringToFind + "': " + occurrences);


	}

}
