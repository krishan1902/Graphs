public class Edge {
    private Vertex _first;
    private Vertex _second;
    private int _value; //_value = weight

    public Edge(Vertex first, Vertex second, int value){
        _first = first;
        _second = second;
        _value =value;
    }

    public int GetWeight(){return _value;}
    public Vertex GetFirst(){return _first;}
    public Vertex GetSecond(){return _second;}

}