package com.epam.streams;

import java.util.IntSummaryStatistics;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class Streams.
 *
 * @author Somesh_Thakur
 */
public class NumberUtil {

	/** The stream. */
	Stream<Integer> stream;

	/** The int stats. */
	private IntSummaryStatistics intStats;

	/** The supplier. */
	private Supplier<Stream<Integer>> supplier;

	/**
	 * Sets the supplier.
	 *
	 * @param supplier  the supplier
	 * @param predicate the predicate
	 */
	public void setPredicate(Predicate<Integer> predicate) {
		stream = supplier.get().filter(predicate);
	}

	/**
	 * Gets the sum.
	 *
	 * @return the sum
	 */
	public long getSum() {
		return getIntStats().getSum();
	}

	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public long getCount() {
		return getIntStats().getCount();
	}

	/**
	 * Gets the int stats.
	 *
	 * @return the int stats
	 */
	public IntSummaryStatistics getIntStats() {
		return intStats;
	}

	/**
	 * Collect int stats.
	 */
	public void collectIntStats() {
		intStats = stream.collect(Collectors.summarizingInt(num -> num));
	}

	/**
	 * Sets the supplier.
	 *
	 * @param supplier the new supplier
	 */
	public void setSupplier(Supplier<Stream<Integer>> supplier) {
		this.supplier = supplier;
	}

}