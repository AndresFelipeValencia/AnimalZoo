package com.example.zooanimals

import android.util.Log

class StudentObject(
    val nameStudent: String, val gradeStudent: String, val listSubjects:
    MutableList<EnumSubject> = mutableListOf()
) {


    fun isMathematic(): Boolean {
        return if (listSubjects.contains(EnumSubject.MATHEMATICS)) {
            true
        } else listSubjects.contains(EnumSubject.MATHEMATICS)
    }

    fun isScience(): Boolean {
        return if (listSubjects.contains(EnumSubject.SCIENCES)) {
            true
        } else listSubjects.contains(EnumSubject.SCIENCES)
    }

    fun isSpanish(): Boolean {
        return if (listSubjects.contains(EnumSubject.SPANISH)) {
            true
        } else listSubjects.contains(EnumSubject.SPANISH)
    }

    fun printStudent(i: Int) {
        Log.d(
            "StudentObject", "Student's name: " + nameStudent + " " + "Its grade is: "
                    + gradeStudent
        )
        for (subject in listSubjects) {
            Log.d("StudentObject", "Your registered subjects are: $listSubjects")
        }
    }

}