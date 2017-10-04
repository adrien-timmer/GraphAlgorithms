package IterativeDeepeningDFS;

import java.util.Stack;

public class IDDFS {

    private Vertex targetVertex;
    private volatile boolean isTargetFound;

    public IDDFS(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }

    public void runDeepeningSearch(Vertex rootVertex) {
        int depth = 0;

        while (!isTargetFound) {
            System.out.println();
            dfs(rootVertex, depth);
            depth++;
        }
    }

    private void dfs(Vertex sourceVertex, int depthLevel) {
        Stack<Vertex> stack = new Stack<>();
        sourceVertex.setDepthLevel(0);
        stack.push(sourceVertex);

        while (!stack.isEmpty()) {
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex);

            if (actualVertex.getName().equals(this.targetVertex.getName())) {
                System.out.println("Vertex has been found");
                this.isTargetFound = true;
                return;
            }

            if (actualVertex.getDepthLevel() >= depthLevel) {
                continue;
            }

            for(Vertex vertex : actualVertex.getNeighbourList()){
                vertex.setDepthLevel(actualVertex.getDepthLevel() + 1);
                stack.push(vertex);
            }
        }

    }
}
