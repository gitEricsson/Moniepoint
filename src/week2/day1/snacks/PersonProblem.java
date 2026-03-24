package week2.day1.snacks;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

enum ProblemType {
    FINANCIAL, SPIRITUAL, EDUCATION, BUSINESS, TECHNICAL
}

class Problem {
    private String name;
    private ProblemType type;
    private boolean isSolved;

    public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;
        this.isSolved = false;
    }

    public String getName() { return name; }
    public boolean isSolved() { return isSolved; }
    public void setSolved(boolean solved) { isSolved = solved; }
}

public class PersonProblem {
    private final List<Problem> problems = new ArrayList<>();

    public void addProblem(Problem problem) {
        if (problem == null) throw new IllegalArgumentException("Problem cannot be null");
        problems.add(problem);
    }

    public void solveProblem(String problemName) {
        for (Problem problem : problems) {
            if (problem.getName().equalsIgnoreCase(problemName)) {
                problem.setSolved(true);
                return;
            }
        }
        throw new NoSuchElementException("Problem not found");
    }

    public List<Problem> tellUnsolvedProblems() {
        List<Problem> unsolved = new ArrayList<>();
        for (Problem problem : problems) {
            if (!problem.isSolved()) unsolved.add(problem);
        }
        return unsolved;
    }
}
