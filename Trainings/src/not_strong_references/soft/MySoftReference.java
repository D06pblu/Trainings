package not_strong_references.soft;

import java.lang.ref.SoftReference;

public class MySoftReference {
    Cat cat;
    SoftReference<Cat> softReference = new SoftReference<>(cat);

}
