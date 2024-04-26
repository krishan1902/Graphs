import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        System.out.println("Graphen in Java - Krishan");
        Graph g = new Graph();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        Vertex v7 = new Vertex(7);
        Vertex v8 = new Vertex(8);
        Vertex v9 = new Vertex(9);
        Vertex v10 = new Vertex(10);

        Edge e1 = new Edge(v1,v2,1);
        Edge e2 = new Edge(v2,v3,1);
        Edge e3 = new Edge(v3,v4,1);
        Edge e4 = new Edge(v1,v5,1);
        Edge e5 = new Edge(v5,v6,1);
        Edge e6 = new Edge(v6,v7,1);
        Edge e7 = new Edge(v5,v8,1);
        Edge e8 = new Edge(v1,v9,1);
        Edge e9 = new Edge(v9,v10,1);


        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);
        g.addVertex(v6);
        g.addVertex(v7);
        g.addVertex(v8);
        g.addVertex(v9);
        g.addVertex(v10);


        g.addEdge(e1);
        g.addEdge(e2);
        g.addEdge(e3);
        g.addEdge(e4);
        g.addEdge(e5);
        g.addEdge(e6);
        g.addEdge(e7);
        g.addEdge(e8);
        g.addEdge(e9);



        System.out.println("Breitensuche: ");
        g.breadthFirstTraversal(v1);

        System.out.println("\nTiefensuche: ");
        g.initdFT(v1);

    }
}