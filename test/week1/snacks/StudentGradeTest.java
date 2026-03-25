package week1.snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week1.snacks.StudentGrade;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {

    private StudentGrade studentGrade;

    @BeforeEach
    void setUp() {
        studentGrade = new StudentGrade();
    }

    @Test
    @DisplayName("Test total score calculation for student is correct")
    void testTotalScoreCalculationIsCorrect() {
        int[] scores = {67, 21, 49};
        assertEquals(137, studentGrade.calculateTotalScore(scores));
    }

    @Test
    @DisplayName("Test average score calculation for student is correct")
    void testAverageScoreCalculationIsCorrect() {
        int[] scores = {67, 21, 49};
        assertEquals(45.67, studentGrade.calculateAverageScore(scores), 0.01);
    }

    @Test
    @DisplayName("Test position calculation for all students is correct")
    void testPositionCalculationIsCorrect() {
        int[] totalScores = {137, 216, 154, 227};
        int[] expectedPositions = {4, 2, 3, 1};
        assertArrayEquals(expectedPositions, studentGrade.calculatePositions(totalScores));
    }

    @Test
    @DisplayName("Test highest score in subject is identified correctly")
    void testHighestScoreInSubjectIsIdentified() {
        int[] subjectScores = {67, 98, 93, 78};
        assertEquals(1, studentGrade.findHighestScorerIndex(subjectScores));
    }

    @Test
    @DisplayName("Test lowest score in subject is identified correctly")
    void testLowestScoreInSubjectIsIdentified() {
        int[] subjectScores = {67, 98, 93, 78};
        assertEquals(0, studentGrade.findLowestScorerIndex(subjectScores));
    }

    @Test
    @DisplayName("Test number of passes in subject is calculated correctly")
    void testNumberOfPassesCalculationIsCorrect() {
        int[] subjectScores = {21, 62, 34, 83};
        assertEquals(2, studentGrade.countPassesIn(subjectScores));
    }

    @Test
    @DisplayName("Test number of fails in subject is calculated correctly")
    void testNumberOfFailsCalculationIsCorrect() {
        int[] subjectScores = {21, 62, 34, 83};
        assertEquals(2, studentGrade.countFailsIn(subjectScores));
    }

    @Test
    @DisplayName("Test total score calculation returns zero for empty scores")
    void testTotalScoreCalculationReturnsZeroForEmptyScores() {
        int[] scores = {};
        assertEquals(0, studentGrade.calculateTotalScore(scores));
    }

    @Test
    @DisplayName("Test average calculation returns zero for empty scores")
    void testAverageCalculationReturnsZeroForEmptyScores() {
        int[] scores = {};
        assertEquals(0.0, studentGrade.calculateAverageScore(scores));
    }
}