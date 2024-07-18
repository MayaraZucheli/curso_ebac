package filtrarMulheres;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.*;

public class FiltrarMulheresTest {

    @Test
    public void testFiltrarMulheres() {
        List<FiltrarMulheres.Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new FiltrarMulheres.Pessoa("Ana", 'F'));
        pessoas.add(new FiltrarMulheres.Pessoa("Maria", 'F'));
        pessoas.add(new FiltrarMulheres.Pessoa("João", 'M'));

        List<FiltrarMulheres.Pessoa> mulheres = pessoas.stream()
            .filter(pessoa -> pessoa.getSexo() == 'F')
            .collect(Collectors.toList());

        assertTrue(mulheres.stream().allMatch(pessoa -> pessoa.getSexo() == 'F'));


        assertEquals(2, mulheres.size());

        assertEquals("Ana", mulheres.get(0).getNome());
        assertEquals("Maria", mulheres.get(1).getNome());
    }
}

