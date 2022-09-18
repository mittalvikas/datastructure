package ae.linkedlists;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private int maxSize;
    Map<String, Integer> keyValMap;
    ArrayDeque<String> dq;

    public LRUCache(int maxSize) {
        this.maxSize = maxSize > 1 ? maxSize : 1;
        this.dq = new ArrayDeque<String>(maxSize);
        this.keyValMap = new HashMap<>();
    }


    public void insertKeyValuePair(String key, int value) {

        if (keyValMap.get(key) != null) {
            dq.remove(key);
            keyValMap.put(key, value);
            dq.offerFirst(key);
        } else {
            if (dq.size() == maxSize) {
                String k = dq.removeLast();
                keyValMap.remove(k);

            }
            keyValMap.put(key, value);
            dq.offerFirst(key);
        }
    }

    public LRUResult getValueFromKey(String key) {
        if (keyValMap.get(key) != null) {
            dq.remove(key);
            dq.offerFirst(key);
            return new LRUResult(true, keyValMap.get(key));
        } else {
            return null;
        }


    }

    public String getMostRecentKey() {
        return dq.peek();
    }


}
class LRUResult {
    boolean found;
    int value;

    public LRUResult(boolean found, int value) {
        this.found = found;
        this.value = value;
    }
}


