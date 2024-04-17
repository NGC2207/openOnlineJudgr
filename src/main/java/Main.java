import util.FileHelper;
import util.Hub;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String code = "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello World\");\n" +
                "    }\n" +
                "}";
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Hub.submit(currentTimeMillis, 0, code);
    }
}
