package week2.day2.snacks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    private Television television;

    @BeforeEach
    void setUp() {
        television = new Television();
    }

    @Test
    @DisplayName("Test television can be turned on")
    void testTelevisionCanBeTurnedOn() {
        television.togglePower();
        assertTrue(television.isOn());
    }

    @Test
    @DisplayName("Test volume increases when television is on")
    void testVolumeIncreases() {
        television.togglePower();
        television.setVolume(10);
        television.increaseVolume();
        assertEquals(11, television.getVolume());
    }

    @Test
    @DisplayName("Test volume does not exceed one hundred")
    void testVolumeDoesNotExceedOneHundred() {
        television.togglePower();
        television.setVolume(100);
        television.increaseVolume();
        assertEquals(100, television.getVolume());
    }

    @Test
    @DisplayName("Test volume does not go below zero")
    void testVolumeDoesNotGoBelowZero() {
        television.togglePower();
        television.setVolume(0);
        television.decreaseVolume();
        assertEquals(0, television.getVolume());
    }

    @Test
    @DisplayName("Test channel can be changed forward")
    void testChannelCanBeChangedForward() {
        television.togglePower();
        television.setChannel(5);
        television.changeChannelForward();
        assertEquals(6, television.getChannel());
    }

    @Test
    @DisplayName("Test channel can be changed backward")
    void testChannelCanBeChangedBackward() {
        television.togglePower();
        television.setChannel(5);
        television.changeChannelBackward();
        assertEquals(4, television.getChannel());
    }
}