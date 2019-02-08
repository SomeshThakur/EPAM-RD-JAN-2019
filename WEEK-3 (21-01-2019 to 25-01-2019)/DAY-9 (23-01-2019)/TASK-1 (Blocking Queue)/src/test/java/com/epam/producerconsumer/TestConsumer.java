package com.epam.producerconsumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.producerconsumer.models.Consumer;
import com.epam.producerconsumer.models.Food;
import com.epam.producerconsumer.models.Producer;

class TestConsumer {
	static Consumer consumer;
	private static Producer producer;
	private static BlockingQueue<Food> queue;

	@BeforeAll
	public static void init() {
		queue = new ArrayBlockingQueue<Food>(3);
		consumer = new Consumer(queue);
		producer = new Producer(queue);
	}

	@Test
	@DisplayName("Test Consumer consuming food")
	public void testConsumer() throws InterruptedException {
		new Thread(producer).start();
		new Thread(consumer).start();
		Thread.sleep(1000);
		assertEquals(0, queue.size());
	}
}
