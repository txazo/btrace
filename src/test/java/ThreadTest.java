public class ThreadTest {

    public static void main(String[] args) {
        while (true) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    System.out.println("New thread");
                }

            }).start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
