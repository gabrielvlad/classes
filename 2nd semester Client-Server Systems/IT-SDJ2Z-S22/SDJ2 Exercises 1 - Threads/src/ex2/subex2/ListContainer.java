
package ex2.subex2;

import java.util.ArrayList;
import java.util.List;

public class ListContainer {
    private List<Integer> list;

    public ListContainer() {
        list = new ArrayList<>();
    }

    /*before synchronization fix
    public void add(int i) {
        list.add(i);
    }
    */

    //after synchronization fix
    public synchronized void add(int i) {
        list.add(i);
    }

    public int getSize() {
        return list.size();
    }
}
