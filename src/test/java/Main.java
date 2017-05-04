public class Main {

    public static void main(String[] args) {
        int pid = 23342;
        String script = "ThreadCounter.java";
        String javaHome = System.getenv("JAVA_HOME");
        String scriptPath = Main.class.getResource("/").getPath() + "/../../src/test/java/com/sun/btrace/samples/";
        String argument = String.format("-cp %s/lib/tools.jar -p 2021 %d %s%s", javaHome, pid, scriptPath, script);
        com.sun.btrace.client.Main.main(argument.split("\\s+"));
    }

}
