package IterativeDeepeningDFS;

public class App {
    public static void main(String[] args){
        Vertex vertex0 = new Vertex("A");
        Vertex vertex1 = new Vertex("B");
        Vertex vertex2 = new Vertex("C");
        Vertex vertex3 = new Vertex("D");
        Vertex vertex4 = new Vertex("E");

        vertex0.addNeighbour(vertex1);
        vertex0.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex3);
        vertex3.addNeighbour(vertex4);


        IDDFS iddfs = new IDDFS(vertex1);
        iddfs.runDeepeningSearch(vertex0);
    }
}
