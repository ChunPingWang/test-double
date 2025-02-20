package com.example;

import com.example.dummy.Grades;
import com.example.dummy.Score;
import com.example.dummy.Teacher;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTests {

    @Test
    public void should_return_by_null() {
        // Arrange
        Score scoreXXX = new Score(null, "XXX", new BigDecimal("76.4"));
        Score scoreOOO = new Score(null, "OOO", new BigDecimal("89.1"));
        Score scoreAAA = new Score(null, "AAA", new BigDecimal("63.9"));

        List<Score> scores = new ArrayList<>();
        scores.add(scoreXXX);
        scores.add(scoreOOO);
        scores.add(scoreAAA);

        Teacher teacher = new Teacher();

        // Act
        Grades grades = teacher.generateGrade(scores);

        // Assert
        assertEquals(Grades.VeryGood, grades);




    }
}
