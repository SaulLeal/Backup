package prueba;

import java.util.List;

public class WildcardError {
    // error
//    void foo(List<?> i) {
//        i.set(0, i.get(0));
//    }

    // fixed
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
}