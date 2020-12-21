package com.company;

import java.time.temporal.Temporal;

public class Main {

    public static void main(String[] args) {

       Teacher teacher = new Teacher();

       Student student = teacher.createStudent("Samandar", "1234");
       Lesson lesson = teacher.createLesson("Geografiya", "Afrika qit'asi");

       student.asignLessonToStudent(student, lesson);
    }
}
