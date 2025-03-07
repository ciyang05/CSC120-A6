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
        
        // has capacity and passenger not already on board
        Car myCar = new Car(1);
        Passenger p = new Passenger("Jordan");

        assertTrue(myCar.addPassenger(p));

        // has a capacity of 0 and passenger not already on board
        Car myCars = new Car (0);
        Passenger c = new Passenger ("Chiashi");

        assertFalse(myCars.addPassenger(c));

        // has capacity and passenger already on board 
        Car car = new Car (2);
        Passenger k = new Passenger("Kassidy");

        car.addPassenger(k);

        assertFalse(car.addPassenger(k));

    }

    @Test
    public void testCarRemovePassenger() {
        
        // passenger is on board
        Car myCars = new Car(1);
        Passenger c = new Passenger ("Chiashi");

        myCars.addPassenger(c);
        
        assertTrue(myCars.removePassenger(c));


        // passenger is not on board
        Car cars = new Car (1);
        Passenger k = new Passenger("Kassidy");

        assertFalse(cars.removePassenger(k));

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
