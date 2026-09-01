package day10;

import java.util.Arrays;

class Job {
    char id;
    int deadline;
    int profit;

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {

    public static void main(String[] args) {

        Job[] jobs = {
            new Job('A', 2, 100),
            new Job('B', 1, 50),
            new Job('C', 2, 200),
            new Job('D', 1, 80)
        };

        
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

              int maxDeadline = 2;

        
        char[] slots = new char[maxDeadline];

        
        Arrays.fill(slots, '-');

        int totalProfit = 0;

        
        for (Job job : jobs) {

            
            for (int j = job.deadline - 1; j >= 0; j--) {

                if (slots[j] == '-') {

                    slots[j] = job.id;

                    totalProfit += job.profit;

                    break;
                }
            }
        }

        System.out.println("Scheduled Jobs:");

        for (int i = 0; i < slots.length; i++) {
            System.out.println("Slot " + (i + 1) + ": " + slots[i]);
        }

        System.out.println("\nMaximum Profit: ₹" + totalProfit);
    }
}