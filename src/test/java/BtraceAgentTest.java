import com.sun.btrace.client.Main;

public class BTraceAgentTest {

    // Args: <pid> <script>
    public static void main(String[] args) throws Exception {
        int pid = Integer.valueOf(args[0]);
        String script = args[1];
        String javaHome = System.getenv("JAVA_HOME");
        String scriptPath = BTraceAgentTest.class.getResource("/").getPath() + "/../../src/test/java/com/sun/btrace/samples/";
        String argument = String.format("-p 2021 -cp %s/lib/tools.jar %d %s%s", javaHome, pid, scriptPath, script);
        Main.main(argument.split("\\s+"));
    }

}
