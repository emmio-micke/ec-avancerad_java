package machine;

import java.util.List;

public class Machine {
    private List versions;

    @Deprecated
    public void test_something(String version) {
        versions.add(version);
    }

    public void addVersion(String version) {
        this.test_something(version);
    }
}

class Test {
    public static void main(String[] args) {
        Machine obj = new Machine();

        obj.test_something("version");
    }
}