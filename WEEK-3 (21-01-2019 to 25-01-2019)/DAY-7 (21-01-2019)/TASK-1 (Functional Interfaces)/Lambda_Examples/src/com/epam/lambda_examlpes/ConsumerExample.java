package com.epam.lambda_examlpes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Class ConsumerExample.
 */
public class ConsumerExample {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ConsumerExample consumerExample = new ConsumerExample();

		String[] strArr = { "", "Hello", "", "World", "I", "am", "practicing", "lambda", "and", "predicate.", "", };
		List<String> strList = Arrays.asList(strArr);
		System.out.println("Intial List :" + strList);

		consumerExample.forEach(strList, (str) -> {
			if (!str.isEmpty())
				System.out.print(str + " ");
		});
	}

	/**
	 * Consume for each element .
	 *
	 * @param strList  the string list
	 * @param Consumer the consumer
	 */
	private void forEach(List<String> strList, Consumer<String> consumer) {
		for (String str : strList)
			consumer.accept(str);
	}
}
