package switch_test;

public class SwitchTest {

    enum Pet {
        DOG, CAT, PARROT, GOLDFISH
    }

    public int defineLegs(Pet pet) {
        int legs;

        switch (pet) {
            case DOG:
            case CAT:
                legs = 4;
                break;
            case PARROT:
                legs = 2;
                break;
            case GOLDFISH:
                legs = 0;
                break;
            default:
                throw new AssertionError("Неопределенное количество ног");
        }
        return legs;
    }
}

