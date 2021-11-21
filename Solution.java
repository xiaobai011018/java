import java.util.Iterator;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class Solution {
    public int maxDepth(Node root) {
        int ans = 0;
        Iterator<Node> iterator = root.children.iterator();
        while (iterator.hasNext()){
            Node node = iterator.next();
            
        }
    }
}
