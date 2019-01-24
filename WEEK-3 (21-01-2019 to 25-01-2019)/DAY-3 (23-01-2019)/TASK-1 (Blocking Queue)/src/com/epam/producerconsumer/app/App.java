package com.epam.producerconsumer.app;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.epam.producerconsumer.models.Consumer;
import com.epam.producerconsumer.models.Food;
import com.epam.producerconsumer.models.Producer;

public class App {
	public static void main(String[] args) {
		// Creating BlockingQueue of size 10
		BlockingQueue<Food> queue = new ArrayBlockingQueue<>(3);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		// Producer started producing
		new Thread(producer).start();
		// Consumer started consuming
		new Thread(consumer).start();
		System.out.println("Producer and Consumer has been started");
	}
}
