import java.util.*;

public class Graph {
    private List<List<Vertex>> _adj;
    private ArrayList<Vertex> _vertices;

    public Graph() {
        _vertices = new ArrayList<>();
    }

    public void addVertex(Vertex v) {
        _vertices.add(v);
    }

    public void addEdge(Edge e) {
        e.GetFirst().addEdge(e);
        e.GetSecond().addEdge(e);
    }

    public void breadthFirstTraversal(Vertex start) {
        System.out.println("Breitensuche \n");
        //Liste der besuchten Knoten
        ArrayList<Vertex> VertexVisited = new ArrayList<>();
        VertexVisited.add(start);

        //Liste der zu besuchende Knoten in der Reihenfolge
        Queue<Vertex> visiting = new LinkedList<>();
        visiting.add(start);
        while (!visiting.isEmpty()) {
            //Knoten wird aus der Liste entfernt und der Wert des Knotens ausgegeben
            Object current = visiting.remove();
            System.out.println(((Vertex) current).GetValue());
            for (Edge e : ((Vertex) current).GetEdges()) {
                Vertex neighbor = e.GetSecond();
                if (!VertexVisited.contains(neighbor)) {
                    VertexVisited.add(neighbor);
                    visiting.add(neighbor);
                }
            }
        }
    }

    public void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedvertices) {
        System.out.println(start.GetValue());
        for (Edge e : start.GetEdges()) {
            Vertex neighbor = e.GetSecond();
            if (!visitedvertices.contains(neighbor)) {
                visitedvertices.add(neighbor);
                depthFirstTraversal(neighbor, visitedvertices);
            }
        }
        System.out.println();
    }

    public void dFT(Vertex start) {
        ArrayList<Vertex> visited = new ArrayList<>();
        depthFirstTraversal(start, visited);
    }

    public void shortestPath(Edge start, Edge end) {
        System.out.println("Shortest Path | Dijkstra \n");


        HashMap<Edge, Integer> distance = new HashMap<>();
        HashMap<Vertex, Vertex> previous = new HashMap<>();
        PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(distance::get));

        for (Vertex vertex : start.GetEdges().get(0).end.GetEdges()) {
            distance.put(vertex, Integer.MAX_VALUE);
            previous.put(vertex, null);
        }

        distance.put(start, 0);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();
            if (current == end) {
                LinkedList<Vertex> path = new LinkedList<>();
                while (previous.get(current) != null) {
                    path.addFirst(current);
                    current = previous.get(current);
                }
                path.addFirst(start);
                System.out.println("Shortest path from " + start.GetValue() + " to " + end.GetValue() + ": " + path);
                return;
            }

            for (Edge edge : current.GetEdges()) {
                Vertex neighbor = edge.GetSecond();
                int newDist = distance.get(current) + edge.GetWeight();
                if (newDist < distance.get(neighbor)) {
                    distance.put(neighbor, newDist);
                    previous.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println("There is no path from " + start.GetValue() + " to " + end.GetValue());


    }
}