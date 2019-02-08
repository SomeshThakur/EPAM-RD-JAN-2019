package com.epam.producerconsumer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.producerconsumer.models.Food;
import com.epam.producerconsumer.models.Producer;

class TestProducer {
	private static Producer producer;
	private static BlockingQueue<Food> queue;

	@BeforeAll
	public static void init() {
		queue = new ArrayBlockingQueue<>(3);
		producer = new Producer(queue);
	}

	@Test
	@DisplayName("Test Production of Food")
	public void testProducerProducingFood() throws InterruptedException {
		new Thread(producer).start();
		Thread.sleep(100);
		assertEquals(3, queue.size());
	}
}
