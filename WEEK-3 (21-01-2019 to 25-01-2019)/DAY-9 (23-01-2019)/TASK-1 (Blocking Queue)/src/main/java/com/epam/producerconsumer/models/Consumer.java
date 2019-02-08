package com.epam.producerconsumer.models;

import java.util.concurrent.BlockingQueue;

/**
 * The Class Consumer.
 *
 * @author Somesh_Thakur
 */
public class Consumer implements Runnable {

	/** The queue. */
	private BlockingQueue<Food> queue;

	/**
	 * Instantiates a new consumer.
	 *
	 * @param queue the queue
	 */
	public Consumer(BlockingQueue<Food> queue) {
		this.queue = queue;
	}

	/*
	 * Consumer thread run
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			Food msg;
			// Consuming food till last one
			while (!(msg = queue.take()).getFood().equalsIgnoreCase("exit")) {
				Thread.sleep(10);
				System.out.println("Consumed " + msg.getFood());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
