package IterativeDeepeningDFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private int depthLevel = 0;

    private List<Vertex> neighbourList;

    public Vertex(String name) {
        this.name = name;
        this.neighbourList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.neighbourList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
