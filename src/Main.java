public class Main {
    public static void main(String[] args) {

        Graph g = new Graph();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Edge e1 = new Edge(v1,v2,2);
        Edge e2 = new Edge(v1, v3, 4);
        Edge e3 = new Edge(v2,v3,1);
        Edge e4 = new Edge(v2,v4,7);
        Edge e7 = new Edge(v3,v4,3);
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        g.addEdge(e1);
        g.addEdge(e2);
        g.addEdge(e3);
        g.addEdge(e4);
        g.addEdge(e7);

        System.out.println("Breitensuche: ");
        g.breadthFirstTraversal(v1);


        System.out.println("\nTiefensuche: ");
        g.depthFirstTraversal(v1);
    }
}