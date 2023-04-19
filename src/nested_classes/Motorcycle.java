package nested_classes;

public class Motorcycle {
    public static class Engine{
        public int horsePower;              //public field
        static int pistonsCount;            //package-local static field
        private int pistonVolume;           //private field
        static private int valvesPerPiston; //private static field
        public void twoValves(){
            valvesPerPiston=2;
        }
        public void fourValves(){
            valvesPerPiston=3;
        }
    }
    public static void main(String[] args) {
        Motorcycle.Engine engine = new Engine();
        engine.horsePower=105;
        Engine.pistonsCount=2;
        engine.pistonVolume=600;
        Engine.valvesPerPiston=4;
    }
}
