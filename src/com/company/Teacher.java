package com.company;

public class Teacher {


    public Student createStudent(String name, String id){
        Student student = new Student(name, id);
        return student;
    }
    public Lesson createLesson(String subject, String theme){
        Lesson lesson = new Lesson(subject, theme);
        return lesson;
    }
}

