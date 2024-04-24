public class Main {
    public static void main(String[] args) {
        System.out.println("Graphen in Java \n");

        Graph graph = new Graph();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);

        Edge e1 = new Edge(1);
        Edge e2 = new Edge(2);
        Edge e3 = new Edge(3);
        Edge e4 = new Edge(4);
        Edge e7 = new Edge(7);

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addEdge(v1,v2,e2);
        graph.addEdge(v1,v3,e4);
        graph.addEdge(v2,v3,e1);
        graph.addEdge(v2,v4,e7);
        graph.addEdge(v3,v4,e3);

        // Breitensuche
        System.out.println("Breitensuche: ");
        graph.breadthFirstTraversal(v1);

        System.out.println("Tiefensuche: ");
        graph.depthFirstTraversal(v1);
    }
}