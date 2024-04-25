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
    }

    public void breadthFirstTraversal(Vertex start){
        ArrayList<Vertex> visited = new ArrayList<>();
        visited.add(start);

        Queue<Vertex> visitQueue = new LinkedList<>();
        visitQueue.add(start);
        while(!visitQueue.isEmpty()){
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

    public void depthFirstTraversal(Vertex start){

    }
}