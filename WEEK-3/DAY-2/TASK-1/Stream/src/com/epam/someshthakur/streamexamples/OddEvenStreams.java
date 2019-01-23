package com.epam.someshthakur.streamexamples;

import java.util.IntSummaryStatistics;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class OddEvenStreams.
 */
public class OddEvenStreams {

    /**
     * The main method.
     *
     * @param args the arguments
     */
	public static void main(String[] args) {
		Supplier<Stream<Integer>> supplier = () -> Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11);

	Stream<Integer> oddStream = supplier.get().filter(num -> num % 2 != 0);
	IntSummaryStatistics oddStat = oddStream.collect(Collectors.summarizingInt(num -> num));
	System.out.println("Odd numbers count : " + oddStat.getCount());
	System.out.println("Odd numbers sum : " + oddStat.getSum());

	Stream<Integer> evenStream = supplier.get().filter(num -> num % 2 == 0);
	IntSummaryStatistics evenStat = evenStream.collect(Collectors.summarizingInt(num -> num));
	System.out.println("Even numbers count : " + evenStat.getCount());
	System.out.println("Even numbers sum : " + evenStat.getSum());
    }
}