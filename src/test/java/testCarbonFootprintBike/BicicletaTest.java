package testCarbonFootprintBike;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.ClassesAbstratas_e_Interfaces.Ex2_e_Ex3.Bicicleta;
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
public class BicicletaTest {
    static void biciTest(){
        Bicicleta bike = new Bicicleta("Gabriel", 10);
        Double carbonFootprint = bike.getCarbonFootprint();
        
        Assertions.assertEquals(100, carbonFootprint);
    }
    
}
