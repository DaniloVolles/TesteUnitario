import org.junit.jupiter.api.*
import java.lang.NullPointerException

class MainTest {

    @Test
    @DisplayName("Teste método xxoo")
    fun testCountXO() {

        // Nessas primeiras condições, caso o primeiro falhe, a função teste inteira falha
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertTrue(countXO("xXoo"))
        Assertions.assertTrue(countXO("xxOo"))
        Assertions.assertFalse(countXO("xxoox"))

        // Assim, todos serão executados, independente se um falha ou não
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxxxoo"))},
            {Assertions.assertTrue(countXO("xX0023ddxxoo"))},
            {Assertions.assertTrue(countXO("xxxoxooooxoxoooxOo"))},
            {Assertions.assertFalse(countXO("xxoox"))}
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse método")
    }

    @Test
    fun assumption () {
        // Se o assumptions não for cumprido, o restante do teste não vai ser executado
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception () {
        assertThrows<NullPointerException> { xyz() }
    }


}