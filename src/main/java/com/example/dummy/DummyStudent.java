package com.example.dummy;

public class DummyStudent extends Student{

    public DummyStudent() {
        super(null, null);
    }

    @Override
    public String getName() {
        return "Dummy";
    }

    @Override
    public String getScore() {
        return "Dummy";
    }

}
