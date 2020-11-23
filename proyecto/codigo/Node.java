
/**
 * Write a description of class Nodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node
{
    String var;
    boolean leaf;
    double val;
    int dec;
    Node right;
    Node left;
    public Node(){}
    public Node(String var, int dec){
        this.var = var;
        this.dec = dec;
        right = null;
        left = null;
    }
    public Node(boolean leaf){
        this.leaf = leaf;
        dec = 0;
        right = null;
        left = null;
    }
    public Node(double val, int dec){
        this.val = val;
        this.dec = dec;
        right = null;
        left = null;
    }
}
