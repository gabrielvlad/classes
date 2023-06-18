package ex2.subex2;

public class ListRunnable implements Runnable {
    private ListContainer listContainer;

    public ListRunnable(ListContainer listContainer) {
        this.listContainer = listContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100000; i++) {
            listContainer.add(i);
        }
        System.out.println("Count: " + listContainer.getSize());
    }
}
