import java.util.TreeSet;

public class ElementRankInStream {

    public static void findRank(int[] stream, int x) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        int rank = 0;

        for (int i = 0; i < stream.length; i++) {
            sortedSet.add(stream[i]);

            // Finding rank for element x
            if (stream[i] == x) {
                rank = sortedSet.headSet(x).size() + 1;
                System.out.println("Rank of " + x + " is: " + rank);
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 20, 15, 3, 4, 4, 1};
        int elementToFindRank = 4;

        findRank(inputArray, elementToFindRank);
    }
}

