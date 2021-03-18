package processor;

public class App {
    public static void main(String[] args) {
        System.out.println(process("Hello World", String::toLowerCase));
    }

    private static String process(String str, Processor processor_parameter) {
        return processor_parameter.process(str);
    }
}

interface Processor {
    String process(String str);
}
