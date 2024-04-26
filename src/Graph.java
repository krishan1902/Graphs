import java.util.*;

public class Graph {
    private ArrayList<Vertex> _vertices;
    public Graph(){
        _vertices = new ArrayList<>();
    }
    public void addVertex(Vertex v){
        _vertices.add(v);
    }
    public void addEdge(Edge e){
        e.GetFirst().addEdge(e);
        e.GetSecond().addEdge(e);
    }

    public void breadthFirstTraversal(Vertex start){
        //Liste der besuchten Knoten
        ArrayList<Vertex> visited = new ArrayList<>();
        visited.add(start);

        //Liste der zu besuchende Knoten in der Reihenfolge
        Queue<Vertex> visitQueue = new LinkedList<>();
        visitQueue.add(start);
        while(!visitQueue.isEmpty()){
            //Knoten wird aus der Liste entfernt und der Wert des Knotens ausgegeben
            Object current = visitQueue.remove();
            System.out.println(((Vertex)current).GetValue());
            for(Edge e : ((Vertex)current).GetEdges()){
                Vertex neighbor = e.GetSecond();
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    visitQueue.add(neighbor);
                }
            }
        }
    }

    public void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedvertices){
        System.out.println(start.GetValue());
        for(Edge e:start.GetEdges()){
            Vertex neighbor = e.GetSecond();
            if(!visitedvertices.contains(neighbor)){
                visitedvertices.add(neighbor);
                depthFirstTraversal(neighbor, visitedvertices);
            }
        }
    }
    public void initdFT(Vertex start){
        ArrayList<Vertex> visited = new ArrayList<>();
        depthFirstTraversal(start, visited);
    }
}