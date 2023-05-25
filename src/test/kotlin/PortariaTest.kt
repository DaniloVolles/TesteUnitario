import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PortariaTest {
    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun idadeTeste() {
        Assertions.assertAll(
            {
                // NEGADO
                Assertions.assertEquals(portaria(23, "batata", "xlkalldoask"), "Negado.")
                Assertions.assertEquals(portaria(22, "COMUM", "xlLkalldoask"), "Negado.")
                Assertions.assertEquals(portaria(12, "Comum", "xtkaosJlKask"), "Negado.")
                Assertions.assertEquals(portaria(14, "PremiuM", "xlkadolask"), "Negado.")
                Assertions.assertEquals(portaria(31, "PrEmIUm", "Danilojksd"), "Negado.")
                Assertions.assertEquals(portaria(31, "", ""), "Negado.")

                // WELCOME
                Assertions.assertEquals(portaria(52, "COMUM", "xTkFJKBNVsk"), "Welcome.")
                Assertions.assertEquals(portaria(26, "Comum", "xTkFJdfNVsk"), "Welcome.")
                Assertions.assertEquals(portaria(80, "luxo", "xlkaoskdoask"), "Welcome.")
                Assertions.assertEquals(portaria(21, "PREmium", "XLskdoask"), "Welcome.")
                Assertions.assertEquals(portaria(18, "PREmium", "XLskdoask"), "Welcome.")
            }
        )
    }
}