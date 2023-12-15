import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    void testAddContact() {
        // Arrange
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

        // Act
        boolean added = contactService.addContact(contact);

        // Assert
        assertTrue(added);
        assertTrue(contactService.getContacts().contains(contact));
    }

    @Test
    void testAddDuplicateContact() {
        // Arrange
        ContactService contactService = new ContactService();
        Contact contact1 = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Contact contact2 = new Contact("1234567890", "Jane", "Doe", "9876543210", "456 Second St");

        // Act
        contactService.addContact(contact1);
        boolean added = contactService.addContact(contact2);

        // Assert
        assertFalse(added);
        assertTrue(contactService.getContacts().contains(contact1));
        assertFalse(contactService.getContacts().contains(contact2));
    }

    @Test
    void testDeleteContact() {
        // Arrange
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        // Act
        boolean deleted = contactService.deleteContact("1234567890");

        // Assert
        assertTrue(deleted);
        assertFalse(contactService.getContacts().contains(contact));
    }

    @Test
    void testUpdatePhone() {
        // Arrange
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        // Act
        boolean updated = contactService.updatePhone("1234567890", "9876543210");

        // Assert
        assertTrue(updated);
        assertEquals("9876543210", contact.getPhone());
    }

    @Test
    void testUpdateFirstName() {
        // Arrange
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        // Act
        boolean updated = contactService.updateFirstName("1234567890", "Jane");

        // Assert
        assertTrue(updated);
        assertEquals("Jane", contact.getFirstName());
    }

    @Test
    void testUpdateLastName() {
        // Arrange
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        // Act
        boolean updated = contactService.updateLastName("1234567890", "Smith");

        // Assert
        assertTrue(updated);
        assertEquals("Smith", contact.getLastName());
    }

    @Test
    void testUpdateAddress() {
        // Arrange
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        // Act
        boolean updated = contactService.updateAddress("1234567890", "456 Second St");

        // Assert
        assertTrue(updated);
        assertEquals("456 Second St", contact.getAddress());
    }
}
