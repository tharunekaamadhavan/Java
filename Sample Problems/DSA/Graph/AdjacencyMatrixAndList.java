import java.util.*;

public class AdjacencyMatrixAndList {
    static class AdjacencyMatrix {
        int[][] adjMatrix;
        int size;

        AdjacencyMatrix(int s) {
            size = s;
            adjMatrix = new int[s][s];
        }

        void add(int r, int c) {
            adjMatrix[r][c] = 1;
            adjMatrix[c][r] = 1; // For undirected graph
        }

        void del(int r, int c) {
            adjMatrix[r][c] = 0;
            adjMatrix[c][r] = 0;
        }

        void print() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    static class AdjacencyList {
        int size;
        List<List<Integer>> adjList;

        AdjacencyList(int s) {
            size = s;
            adjList = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        void add(int u, int v) {
            adjList.get(u).add(v);
            adjList.get(v).add(u); // For undirected graph
        }

        void del(int u, int v) {
            adjList.get(u).remove(Integer.valueOf(v));
            adjList.get(v).remove(Integer.valueOf(u));
        }

        void print() {
            for (int i = 0; i < size; i++) {
                System.out.print(i + ": ");
                for (int neighbor : adjList.get(i)) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Adjacency Matrix:");
        AdjacencyMatrix matrixGraph = new AdjacencyMatrix(5);
        matrixGraph.add(0, 1);
        matrixGraph.add(1, 2);
        matrixGraph.add(3, 4);
        matrixGraph.print();
        System.out.println("After deletion:");
        matrixGraph.del(1, 2);
        matrixGraph.print();

        System.out.println("\nAdjacency List:");
        AdjacencyList listGraph = new AdjacencyList(5);
        listGraph.add(0, 1);
        listGraph.add(1, 2);
        listGraph.add(3, 4);
        listGraph.print();
        System.out.println("After deletion:");
        listGraph.del(1, 2);
        listGraph.print();
    }
}
