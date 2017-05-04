public class BTracePremainTest {

    // VM Args: -javaagent:/Users/txazo/TxazoProject/btrace/lib/btrace-agent.jar=debug=true,stdout=true,script=/Users/txazo/TxazoProject/btrace/src/test/java/com/sun/btrace/samples/ThreadCounter.class
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
