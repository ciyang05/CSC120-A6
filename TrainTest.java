import static org.junit.Assert.*;
import org.junit.Test;

public class TrainTest {

    // Engine Tests
    @Test
    public void testEngineConstructor() {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 50.0, 150);

        assertEquals(50.0, myEngine.getCurrentFuel(),0.0);
        assertEquals(FuelType.ELECTRIC, myEngine.getFuelType());
        assertEquals(150.0, myEngine.getMaxFuel(), 0.0);
    }

    @Test
    public void testEngineGo() {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 50.0, 150);

        assertTrue(myEngine.go());
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
        Car myCar = new Car(70);

        assertTrue(myCar.addPassenger(null));

    }

    @Test
    public void testCarRemovePassenger() {
        Car myCar = new Car(70);

        assertTrue(myCar.removePassenger(null));
        // assertNotEquals(-70.0, 70.0, 0.0);

        assertEquals()

    }

    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        fail();
    }

    @Test
    public void testPassengerBoardCarFull() {
        fail();
    }

    // Train Tests
    @Test
    public void testTrainConstructor() {
        fail();
    }

    @Test
    public void testTrainPassengerCount() {
        fail();
    }

    @Test
    public void testTrainGetCar() {
        fail();
    }

    @Test
    public void testTrainPrintManifest() {
        fail();
    }
    
}
