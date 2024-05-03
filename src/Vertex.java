import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {
    private int _value;
    private ArrayList<Edge> _edges;

    public Vertex(int value){
        _edges = new ArrayList<>();
        _value = value;
    }
    public void addEdge(Edge edge){
        _edges.add(new Edge(edge.GetFirst(), edge.GetSecond(), edge.GetWeight()));
    }

    public ArrayList<Edge> GetEdges(){return _edges;}
    public int GetValue(){return _value;}

    @Override
    public int compareTo(Vertex other) {
        return Integer.compare(this.GetValue(), other.GetValue());
    }
}
