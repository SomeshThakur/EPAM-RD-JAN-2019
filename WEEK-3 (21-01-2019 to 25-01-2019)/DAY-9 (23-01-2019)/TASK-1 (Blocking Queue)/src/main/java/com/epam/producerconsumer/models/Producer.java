package com.epam.producerconsumer.models;

import java.util.concurrent.BlockingQueue;

/**
 * The Class Producer.
 *
 * @author Somesh_Thakur
 */
public class Producer implements Runnable {

	/** The queue. */
	private BlockingQueue<Food> queue;

	/**
	 * Instantiates a new producer.
	 *
	 * @param queue the queue
	 */
	public Producer(BlockingQueue<Food> queue) {
		this.queue = queue;
	}

	/*
	 * Producer Thread run
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// Producing Food
		for (int i = 0; i < 10; i++) {
			Food msg = new Food("" + i);

			try {
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced " + msg.getFood());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Add last food
		Food msg = new Food("exit");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
