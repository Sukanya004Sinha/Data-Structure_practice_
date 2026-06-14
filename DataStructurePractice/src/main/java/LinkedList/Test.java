package LinkedList;

/**
 * Problem Description
 * <p>
 * A train is passing through a tunnel.
 * You are given two integers:
 * <p>
 * trainSize — the number of compartments in the train
 * <p>
 * tunnelSize — the length of the tunnel
 * <p>
 * As the train moves through the tunnel, each step of movement creates a visual pattern:
 * <p>
 * - (d
 * <p>
 * <p>
 * digits (1, 2, 3, ...) represent the compartments of the train
 * <p>
 * At time 0, the entire tunnel is empty, represented by tunnelSize dashes.
 * <p>
 * The train then moves one unit per step, entering the tunnel from the left and exiting to the right.
 * Print each stage of the movement until the entire train has completely exited the tunnel.
 * <p>
 * <p>
 * <p>
 * Example
 * Input
 * <p>
 * <p>
 * Output
 * --
 * 1-tunnelSize = 2
 * * trainSize = 2
 * 21
 * -2
 * –
 * 0(trainSize+ tunnelSize) * (trainSize+ tunnelSize)
 */
public class Test {
    public static void main(String[] args) {
//        int tunnelSize = 2;
//        int trainSize = 2;
        Train(3, 1);

    }

    public static void Train(int trainSize, int tunnelSize) {
        int totalSteps = tunnelSize + trainSize + 1;


        for (int s = 0; s < totalSteps; s++) {
            char[] tunnel = new char[tunnelSize];

            for (int k = 0; k < tunnelSize; k++) {
                tunnel[k] = '-';

            }
            for (int i = 1; i <= trainSize; i++) {
                int pos = s - i;
                if (pos >= 0 && pos < tunnelSize) {
                    tunnel[pos] = (char) ('0' + i);


                }

            }

            System.out.println(new String(tunnel));

        }
    }
}