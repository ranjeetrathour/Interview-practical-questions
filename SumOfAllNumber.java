package com.codedecode.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b); // sum
		System.out.println(sum);

		Integer avg = (int) list.stream().mapToInt(o -> o).summaryStatistics().getAverage(); // average
		System.out.println(avg);

		int temp = 0;
		for (int i = 0; i < list.size(); i++) {
			temp = temp + list.get(i);
		}
		System.out.println(temp);
	}

}
