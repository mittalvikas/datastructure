package ae.linkedlists;

/**
 * Remove duplicated from sorted list
 */
public class RemoveDuplicates {

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList currentNode = linkedList;
        while (currentNode != null) {
            LinkedList newCurrentNode = currentNode.next;
            while (newCurrentNode != null && newCurrentNode.value == currentNode.value) {
                newCurrentNode = newCurrentNode.next;
            }

            currentNode.next = newCurrentNode;
            currentNode = newCurrentNode;

        }
        return linkedList;
    }
}
