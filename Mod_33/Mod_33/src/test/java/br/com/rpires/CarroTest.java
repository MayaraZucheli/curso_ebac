package br.com.zuch;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.zuch.dao.ICarroDao;
import br.com.zuch.dao.CarroDao;
import br.com.zuch.domain.Carro;
import br.com.zuch.domain.Marca;

public class CarroTest {

    private ICarroDao carroDao;

    public CarroTest() {
        carroDao = new CarroDao();
    }

    @Test
    public void cadastrarCarro() {
        Carro carro = new Carro();
        carro.setModelo("Modelo Teste");
        
        
        Marca marca = new Marca();
        marca.setId(1L);
        carro.setMarca(marca);

        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
