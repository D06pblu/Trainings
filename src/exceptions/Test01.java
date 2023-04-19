package exceptions;

/**
 * что будет выброшено?
 */
public class Test01 {
    public static void main(String[] args) {

        try {
            throw null;
        } finally {
            return;
        }
    }
}

/*
 * в трай кидается NPE, но оно подавляется в файнали
 */
