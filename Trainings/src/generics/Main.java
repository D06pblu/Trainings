package generics;

public class Main {
    public static class Box<T> {  //какого хрена работает и так и сяк?
        private T object;

        public static <T> Box<T> getBox() {
            return new Box();
        }
    }
}

