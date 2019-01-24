package com.epam.futureexecutor.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.epam.futureexecutor.models.Calculation;

public class App {
	private static final int THREADS_COUNT = 3;

	public static void main(String[] args) {
		Integer numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Future<Integer>> futuresList = new ArrayList<>();
		List<Integer> numberList = Arrays.asList(numbers);
		ExecutorService executor = Executors.newFixedThreadPool(THREADS_COUNT);
		for (int i = 0; i < 10; i++) {
			Callable<Integer> task = new Calculation(numberList);
			Future<Integer> future = executor.submit(task);
			futuresList.add(future);
		}

		for (Future<Integer> future : futuresList) {

			try {
				Integer result = future.get();
				System.out.println(result);
			} catch (InterruptedException | ExecutionException e) {

			}
		}
	}
}
