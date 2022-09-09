package ae.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBFS {

    public List<String> breadthFirstSearch(List<String> array, Node node) {

        // BFS == Iterative approach
        // BFS == use Queue

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            array.add(currentNode.name);
            queue.addAll(currentNode.children);
        }

        return array;
    }
}
