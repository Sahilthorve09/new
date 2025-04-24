package com.practice_session;

public class TeacherDetails {

	public static void main(String[] args) {
        MathTeacher mt = new MathTeacher();

        mt.teach();            // Inherited method
        mt.solveEquations();   // Subclass method
    }
	
}
