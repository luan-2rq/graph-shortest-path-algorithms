public class Vertex {
    
    int id;

    //dist is the same as d from Cormen's book
    double dist;
    //pred is the same as pi from Cormen's book
    Vertex pred;

    public Vertex(int id){
        this.id = id;
    }
}
