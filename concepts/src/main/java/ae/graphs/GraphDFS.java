package ae.graphs;

import java.util.List;

public class GraphDFS {

    public List<String> depthFirstSearch(List<String> array,Node node) {

        array.add(node.name);
        for (int i=0; i<node.children.size(); i++){
            depthFirstSearch(array,node.children.get(i));
        }
        return array;
    }
}
