import Backend.Submit;

public class Main {
    public static void main(String[] args) {
        String code = "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello World\");\n" +
                "    }\n" +
                "}";
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        try {
            String result = Submit.go(currentTimeMillis, 0, code);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error has occurred: " + e.getMessage());
        }
    }
}
