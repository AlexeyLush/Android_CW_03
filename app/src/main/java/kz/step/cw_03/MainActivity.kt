package kz.step.cw_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var textViewStudents: TextView? = null
    var buttonSortByName: Button? = null
    var buttonSortRandom: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)
        initializeViews()
        initializeListeners()
    }

    fun initializeViews(){
        textViewStudents = findViewById<TextView>(R.id.textview_students_table)
        buttonSortByName = findViewById<Button>(R.id.button_sort_by_name)
        buttonSortRandom = findViewById<Button>(R.id.button_sort_random)
    }

    fun initializeListeners(){
        buttonSortByName?.setOnClickListener{
            var listStudents: SortStudentsByName = SortStudentsByName()
            listStudents.sortByName()
            var resultString: String = listStudents.stringForTable()
            textViewStudents?.text = resultString
        }

        buttonSortRandom?.setOnClickListener{
            var listStudents: SortStudentsByName = SortStudentsByName()
            listStudents.sortRandom()
            var resultString: String = listStudents.stringForTable()
            textViewStudents?.text = resultString
        }
    }
}