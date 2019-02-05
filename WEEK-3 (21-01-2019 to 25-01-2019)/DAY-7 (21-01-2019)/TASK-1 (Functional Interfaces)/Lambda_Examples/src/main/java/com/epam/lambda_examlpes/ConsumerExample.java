package com.epam.lambda_examlpes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Class ConsumerExample.
 */
public class ConsumerExample {

	/**
	 * Consume for each element .
	 *
	 * @param strList  the string list
	 * @param Consumer the consumer
	 */
	public void forEach(List<String> strList, Consumer<String> consumer) {
		strList.stream().forEach(consumer);
	}
}
