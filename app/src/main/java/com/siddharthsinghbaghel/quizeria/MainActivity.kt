package com.siddharthsinghbaghel.quizeria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {

            if(et_name.text.toString().isEmpty())
            {
                Toast.makeText(this,"Name can't be empty",Toast.LENGTH_SHORT).show()
            }
            else
            {
                val intent = Intent(this,TopicsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent)

            }
        }

         creators_info.setOnClickListener {
             val intent = Intent(this,InfoActivity::class.java)
             startActivity(intent)

         }
    }
}