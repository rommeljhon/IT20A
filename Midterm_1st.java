package midterm_1st;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Midterm_1st {

    public static void main(String[] args) {
        
        Queue<String[]> arrivalQueue = new LinkedList<>();

        
        arrivalQueue.add(new String[]{"Anna", "3"});
        arrivalQueue.add(new String[]{"Bob", "1"});
        arrivalQueue.add(new String[]{"Carla", "2"});
        arrivalQueue.add(new String[]{"Dave", "1"});

        
        System.out.println("=== Arrival Order ===");
        for (String[] p : arrivalQueue) {
            System.out.println(p[0] + " (Severity: " + p[1] + ")");
        }

        
        PriorityQueue<String[]> priorityQueue = new PriorityQueue<>(
            (a, b) -> Integer.parseInt(a[1]) - Integer.parseInt(b[1])
        );
        
        priorityQueue.addAll(arrivalQueue);

        
        System.out.println("\n=== Treatment Order ===");
        while (!priorityQueue.isEmpty()) {
            String[] p = priorityQueue.poll();
            System.out.println("Treating: " + p[0] + " (Severity: " + p[1] + ")");
        }
        
    }
    
}
