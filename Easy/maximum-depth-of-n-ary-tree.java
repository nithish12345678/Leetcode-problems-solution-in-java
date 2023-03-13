/*
// Definition for a Node.
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
};
*/

class Solution {
    public int maxDepth(Node root) {
          if(root==null)  return 0;
          int max=0;

        for(int i=0;i<root.children.size();i++){
            int val=maxDepth(root.children.get(i) ) ;
            System.out.println(root.children.get(i).val );
            if(val>max){
                max=val;
            }

        }
        return 1+max;
    }
}