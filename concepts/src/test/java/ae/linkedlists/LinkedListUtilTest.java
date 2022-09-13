package ae.linkedlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListUtilTest {

    public LinkedList newLinkedList(int[] values) {
        LinkedList ll = new LinkedList(values[0]);
        LinkedList current = ll;
        for (int i = 1; i < values.length; i++) {
            current.next = new LinkedList(values[i]);
            current = current.next;
        }
        return ll;
    }

    public void addMany(LinkedList ll, int[] ints) {
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        addMany(ll,list);
    }

    public LinkedList addMany(LinkedList ll, List<Integer> values) {
        LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }
    public boolean compare(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public LinkedList getNthNode(LinkedList ll,int n) {
        int counter = 1;
        LinkedList current = ll;
        while (counter < n) {
            current = current.next;
            counter++;
        }
        return current;
    }






}
