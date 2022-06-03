package dsa.others.slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInWindow {

    public static void main(String[] args) {
        int[] a = {-1, -1, -3, -4, 5, 6, 7};


        System.out.println(findFirstNve_SW(a, 3));

    }

    static List findFirstNve_SW(int[] a, int k) {

        List output = new ArrayList<>();
        Queue queue = new LinkedList();

        for (int i = 0, j = 0; j < a.length; j++) {
            if (a[j] < 0) {
                queue.add(a[j]);
            }

            if (j - i + 1 == k) {
                if (queue.isEmpty())
                    output.add(0);
                else {
                    output.add(queue.peek());

                    if (a[i] == (int) queue.peek()) {
                        queue.remove();
                    }
                }
                i++;
            }
        }
        return output;
    }
}
