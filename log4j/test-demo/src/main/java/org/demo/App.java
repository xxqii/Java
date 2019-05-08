package org.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = LoggerFactory.getLogger(App.class);

        Map<Integer, Long> costMap = new HashMap<>();
        for (int a = 1; a <= 10; a++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                //200B
                logger.info("hellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohello");
            }
            long end = System.currentTimeMillis();
            System.out.println("cost=" + (end - start));

            costMap.put(a, (end - start));
        }
        costMap.entrySet().stream().forEach(entry -> System.out.print(entry.getValue() + " "));
    }
}
