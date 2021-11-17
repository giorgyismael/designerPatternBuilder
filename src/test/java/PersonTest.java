import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void createPersonWithNewTest() {
        final String expectedName = "Giorgy";
        final LocalDate expectedBirthDay = LocalDate.of(1987, 6, 6);

        final Person person = new Person("Giorgy", LocalDate.of(1987, 6, 6));

        assertEquals(expectedName, person.getName());
        assertEquals(expectedBirthDay, person.getBirthdayDate());
    }

    @Test
    public void createPersonAllAttributesTest() {
        final String expectedName = "Giorgy";
        final LocalDate expectedBirthDay = LocalDate.of(1987, 6, 6);

        final Person person =
                Person.builder()
                .name("Giorgy")
                .birthdayDate(LocalDate.of(1987, 6, 6))
                .build();

        assertEquals(expectedName, person.getName());
        assertEquals(expectedBirthDay, person.getBirthdayDate());
    }

    @Test
    public void createPersonWithNameTest() {
        final String expectedName = "Giorgy";
        final Person person =
                Person.builder()
                .name("Giorgy")
                .build();

        assertEquals(expectedName, person.getName());
    }

    @Test
    public void createPersonWithoutAttributsTest() {

        final Person person = Person.builder().build();
        assertEquals(Person.class, person.getClass());
    }
}
