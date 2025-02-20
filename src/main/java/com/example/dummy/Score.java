package com.example.dummy;

import java.math.BigDecimal;

public class Score {
    private Student student;
    private BigDecimal score;
    private String subjectId;


    public Score(Student student, String subjectId, BigDecimal score) {
        this.student = student;
        this.score = score;
        this.subjectId = subjectId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }
}
