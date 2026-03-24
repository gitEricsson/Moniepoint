package week2.day1.snacks;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PersonProblemTest {
    private PersonProblem person;

    @BeforeEach
    void setUp() {
        person = new PersonProblem();
    }

    @Test
    @DisplayName("Test a person can successfully add a problem to their list")
    void testPersonCanAddProblemToTheirList() {
        Problem moneyIssue = new Problem("Rent", ProblemType.FINANCIAL);
        person.addProblem(moneyIssue);
        assertEquals(1, person.tellUnsolvedProblems().size());
    }

    @Test
    @DisplayName("Test adding a null problem throws an exception")
    void testAddingNullProblemThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> person.addProblem(null));
    }

    @Test
    @DisplayName("Test a person can solve an existing problem")
    void testPersonCanSolveExistingProblem() {
        person.addProblem(new Problem("Math", ProblemType.EDUCATION));
        person.solveProblem("Math");
        assertTrue(person.tellUnsolvedProblems().isEmpty());
    }

    @Test
    @DisplayName("Test solving a non-existent problem throws an exception")
    void testSolvingNonExistentProblemThrowsException() {
        assertThrows(java.util.NoSuchElementException.class, () -> person.solveProblem("Ghost Problem"));
    }
}