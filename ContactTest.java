import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    void validContactCreation() {
        // Arrange
        String contactID = "1234567890";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567890";
        String address = "123 Main St";

        // Act
        Contact contact = new Contact(contactID, firstName, lastName, phone, address);

        // Assert
        assertEquals(contactID, contact.getContactID());
        assertEquals(firstName, contact.getFirstName());
        assertEquals(lastName, contact.getLastName());
        assertEquals(phone, contact.getPhone());
        assertEquals(address, contact.getAddress());
    }

    @Test
    void invalidContactID() {
        // Arrange
        String invalidContactID = "12345678901"; // More than 10 characters

        // Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(invalidContactID, "John", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    void invalidFirstName() {
        // Arrange
        String invalidFirstName = "InvalidFirstNameMoreThan10Characters";

        // Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", invalidFirstName, "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    void invalidLastName() {
        // Arrange
        String invalidLastName = "InvalidLastNameMoreThan10Characters";

        // Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", invalidLastName, "1234567890", "123 Main St");
        });
    }

    @Test
    void invalidPhone() {
        // Arrange
        String invalidPhone = "12345678901"; // More than 10 characters

        // Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", invalidPhone, "123 Main St");
        });
    }

    @Test
    void invalidAddress() {
        // Arrange
        String invalidAddress = "InvalidAddressMoreThan30Characters";

        // Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "1234567890", invalidAddress);
        });
    }
}
