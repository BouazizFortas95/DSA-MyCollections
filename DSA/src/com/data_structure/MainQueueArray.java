package com.data_structure;

public class MainQueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray<String> queue = new QueueArray<String>(4);
		queue.queue("Ahmed");
		queue.queue("Bouaziz");
		queue.queue("Camilia");
		System.out.println(queue.deQueue());
	}

}
