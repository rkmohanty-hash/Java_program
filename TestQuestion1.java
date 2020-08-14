package com.sriman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestQuestion1 {
	public String getHashTag(String str) {

		return null;

	}

	public static void main(String[] args) {

		System.out.println("Please enter the title");

		Scanner sc = new Scanner(System.in);

		String hashTagTitle = sc.nextLine();

		String array[] = hashTagTitle.split("\\s+");

		List<String> sortedHAstagList = Arrays.asList(array);

		Collections.sort(sortedHAstagList, new Comparator() {

			@Override

			public int compare(Object o1, Object o2) {

				// TODO Auto-generated method stub

				String obj1 = (String) o1;

				String obj2 = (String) o2;

				return obj2.compareTo(obj1);

			}

		});

		Map<Integer, String> map = new HashMap<Integer, String>();

		for (String str : sortedHAstagList) {

			int len = str.length();

			map.put(len, str);

		}

		List<String> arrayList = new ArrayList<String>();

		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			arrayList.add(entry.getValue());

		}

		Collections.reverse(arrayList);

		List<String> hashTagList = null;

		if (arrayList.size() > 3) {

			hashTagList = arrayList.subList(0, 3);

		} else {

			hashTagList = arrayList;

		}

		System.out.println(hashTagList);

	}

}
