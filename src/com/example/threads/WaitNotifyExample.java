package com.example.threads;
class SharedResource {
    private boolean isAvailable = false;

    public synchronized void produce() throws InterruptedException {
        while (isAvailable) {
            wait(); // wait if the resource is already produced
        }
        System.out.println("Produced item");
        isAvailable = true;
        notify(); // notify consumer that an item is available
    }

    public synchronized void consume() throws InterruptedException {
        while (!isAvailable) {
            wait(); // wait if there is no item to consume
        }
        System.out.println("Consumed item");
        isAvailable = false;
        notify(); // notify producer that the item has been consumed
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                while (true) {
                    resource.produce();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    resource.consume();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}