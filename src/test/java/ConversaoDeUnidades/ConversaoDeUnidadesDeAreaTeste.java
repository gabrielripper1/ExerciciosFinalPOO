package ConversaoDeUnidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.Atributos_e_MetodosEstaticos.ConversaoDeUnidadesDeArea;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gabri
 */

public class ConversaoDeUnidadesDeAreaTeste {

      
    static void testeConver(){
        ConversaoDeUnidadesDeArea teste = new ConversaoDeUnidadesDeArea(8.500);
        double temp = teste.getMetros();
        double temp2 = teste.metroPes(temp);
        
        Assertions.assertEquals(91.46, temp2);
        
        //double pes = teste.metroPes(Double.teste);
   
    }
}