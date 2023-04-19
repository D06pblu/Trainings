package constructors;

import java.time.LocalDateTime;

public class Test {
    static Test staticTest;
    public int i;
    public String string;
    LocalDateTime localDateTime;

    public Test(int i, String string, LocalDateTime localDateTime) {
        this.i = i;
        this.string = string;
        staticTest = this;

        if (i < 10) {
            throw new IllegalArgumentException();
        }
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "TestSubstring{" +
                "i=" + i +
                ", string='" + string + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
