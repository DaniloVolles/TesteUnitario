import org.junit.jupiter.api.*
import java.lang.NullPointerException

// Se você rodar isso aqui com "coverage" vc recebe status de análises
class MainTest {

    @Test
    fun provocacao() {
        Assertions.assertNotNull(countXO("alkdjsbcskhjvbs"))
        Assertions.assertNotNull(countXO("xxoo"))
        // Esse é um teste que não faz sentido, por que o retorno da função countXO nunca será nulo
        // Não adianta fazer um teste inútil
    }

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {

        // Nessas primeiras condições, CASO o primeiro FALHE, a função teste INTEIRA falha
        Assertions.assertTrue(countXO("xxoo")) // Vou passar uma função e uma entrada esperando que dê certo
        Assertions.assertEquals(countXO("xxoo"), true) // Método equivalente ao anterior
        Assertions.assertTrue(countXO("xXoo"))
        Assertions.assertTrue(countXO("xxOo"))
        Assertions.assertFalse(countXO("xxoox"))

    }

    @Test
    @DisplayName("Teste com todos")
    fun testCountXOAll(){

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