package streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KataEvilSelfMadeTest {

    @Test
    void RegexShouldKeepOnlyLiteralsAndDigits() {
        List<String> expected = List.of("Мама", "мыла", "раму", "123", "раза", "епт");
        List<String> result = KataEvilSelfMade.splitIncomingString("Мама мыла -  раму? 123 раза епт");
        assertEquals(expected, result);

        List<String> expected1 = List.of("Мама", "мыла", "мыла", "мылом", "90");
        List<String> result1 = KataEvilSelfMade.splitIncomingString("Мама мыла-мыла-мылом-90");
        assertEquals(expected, result);
    }

}