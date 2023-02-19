package com.masum;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicesExample {
    public static void main(String arg[]){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("ExecutorService");
            }
        });
        executorService.shutdown();
    }
}
