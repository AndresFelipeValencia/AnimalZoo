package com.example.zooanimals

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ScrollView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.zooanimals.databinding.StudentActivityBinding

class StudentActivity : AppCompatActivity() {
    val instanceOfStudent = School()

    val listSubjectSelected: MutableList<EnumSubject> = mutableListOf()

    lateinit var binding: StudentActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = StudentActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.mathematicalSubject.setOnClickListener {
            if (listSubjectSelected.contains(EnumSubject.MATHEMATICS)) {

                listSubjectSelected.remove(EnumSubject.MATHEMATICS)
                binding.mathematicalSubject.isChecked = false

            } else {
                listSubjectSelected.add(EnumSubject.MATHEMATICS)
            }
        }

        binding.scienceSubject.setOnClickListener {
            if (listSubjectSelected.contains(EnumSubject.SCIENCES)) {

                listSubjectSelected.remove(EnumSubject.SCIENCES)
                binding.scienceSubject.isChecked = false

            } else {
                listSubjectSelected.add(EnumSubject.SCIENCES)
            }
        }

        binding.spanishSubject.setOnClickListener {
            if (listSubjectSelected.contains(EnumSubject.SPANISH)) {

                listSubjectSelected.remove(EnumSubject.SPANISH)
                binding.spanishSubject.isChecked = false

            } else {
                listSubjectSelected.add(EnumSubject.SPANISH)
            }
        }

        binding.saveButtonData.setOnClickListener {
            saveStudentData()
            binding.mathematicalSubject.isChecked = false
            binding.scienceSubject.isChecked = false
            binding.spanishSubject.isChecked = false

        }

        binding.consultMathematic.setOnClickListener {
            buttonConsultMathematic()
        }

        binding.consultScience.setOnClickListener {
            buttonConsultScience()
        }

        binding.consultSpanish.setOnClickListener {
            buttonConsultSpanish()
        }

        binding.consultStudents.setOnClickListener {
            buttonConsultAllStudent()
        }

    }

    @SuppressLint("SetTextI18n")
    fun saveStudentData() {
        val name = binding.enterNameStudent.text.toString()
        val grade = binding.enterGradeStudent.text.toString()

        if (name.isEmpty()) {
            Toast.makeText(this, "Please enter the name.", Toast.LENGTH_SHORT).show()
        } else if (grade.isEmpty()) {
            Toast.makeText(this, "Please enter the course.", Toast.LENGTH_SHORT).show()
        }
        if (listSubjectSelected.isEmpty()) {
            Toast.makeText(this, "Please select subject.", Toast.LENGTH_SHORT).show()
        }

        val studentObject = StudentObject(name, grade, listSubjectSelected.toMutableList())
        instanceOfStudent.listStudents.add(studentObject)

        binding.enterNameStudent.setText("")
        binding.enterGradeStudent.setText("")
        binding.mathematicalSubject.text = "Mathematics"
        binding.scienceSubject.text = "Sciences"
        binding.spanishSubject.text = "Spanish"
        listSubjectSelected.clear()
    }

    fun buttonConsultMathematic() {
        val mathematics = instanceOfStudent.listStudents
        for (i in mathematics.indices) {
            if (mathematics[i].isMathematic()) {
                mathematics[i].printStudent(i)
            }
        }
    }

    fun buttonConsultScience() {
        val sciences = instanceOfStudent.listStudents
        for (i in sciences.indices) {
            if (sciences[i].isScience()) {
                sciences[i].printStudent(i)
            }
        }
    }

    fun buttonConsultSpanish() {
        val spanish = instanceOfStudent.listStudents
        for (i in spanish.indices) {
            if (spanish[i].isSpanish()) {
                spanish[i].printStudent(i)
            }
        }
    }

    fun buttonConsultAllStudent() {
        val allStudent = instanceOfStudent.listStudents
        for (i in allStudent.indices) {
            allStudent[i].printStudent(i)
        }
    }

}