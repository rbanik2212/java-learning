package Graphs;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A");

        graph.printGraph();
        graph.addVertex("B");
        graph.addEdge("A", "B");
        graph.printGraph();

    }
}
