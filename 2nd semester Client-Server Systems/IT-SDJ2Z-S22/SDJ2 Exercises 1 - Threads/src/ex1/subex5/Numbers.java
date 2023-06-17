package ex1.subex5;

public class Numbers implements Runnable {
    private final int x;
    private final int y;

    public Numbers(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        for(int i = x; i<= y; i++) {
            System.out.println(i);
        }
    }
}