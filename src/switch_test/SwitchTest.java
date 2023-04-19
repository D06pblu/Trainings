package switch_test;

public class SwitchTest {

    enum Pet {
        DOG, CAT, PARROT, GOLDFISH
    }

    public int defineLegs(Pet pet) {
        int legs = switch (pet) { //теперь весь свитч это просто объявление переменной legs
            case DOG, CAT -> legs = 4;
            case PARROT -> legs = 2;
            case GOLDFISH -> legs = 0;
//            default: //не нужен, поскольку покрыты все варианты енама
//                throw new AssertionError("Неопределенное количество ног");
        };
        return legs;
    }
}

