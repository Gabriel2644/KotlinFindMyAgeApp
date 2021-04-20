 package gm.projects.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
     fun findAge(view:View){
         val DOB:Int = DOB.text.toString().toInt()
         val currentYear = Calendar.getInstance().get(Calendar.YEAR)
         val myAge:Int = currentYear-DOB
         if (DOB > currentYear){
             age.text="Invalid Age"
         }else {
             age.text = "Your age is $myAge Years"
         }
     }
}
