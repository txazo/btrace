import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

import java.util.List;

public class ThreadTest {

    public static void main(String[] args) {
        System.out.println("Pid: " + getCurrentPid());

        while (true) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    // System.out.println("New thread");
                }

            }).start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getCurrentPid() {
        List<VirtualMachineDescriptor> vms = VirtualMachine.list();
        for (VirtualMachineDescriptor vmd : vms) {
            if (ThreadTest.class.getName().equals(vmd.displayName())) {
                return vmd.id();
            }
        }
        return "";
    }

}
