package ex1.subex3;

public class Numbers implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
