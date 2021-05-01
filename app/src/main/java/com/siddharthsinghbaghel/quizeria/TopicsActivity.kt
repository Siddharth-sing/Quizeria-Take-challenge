package com.siddharthsinghbaghel.quizeria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_topics.*

class TopicsActivity : AppCompatActivity(), View.OnClickListener {

    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topics)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        crdv_India.setOnClickListener(this)
        crdv_Earth.setOnClickListener(this)
        crdv_Covid.setOnClickListener(this)
        crdv_Cricket.setOnClickListener(this)
        crdv_Flags.setOnClickListener(this)
        crdv_Tech.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

         when(v?.id){
             R.id.crdv_India->{
                 val intent = Intent(this,IndiaQuizQuestionsActivity::class.java)
                 intent.putExtra(Constants.USER_NAME,mUserName)
                 startActivity(intent)
                 finish()
             }
             R.id.crdv_Flags ->{
                 val intent = Intent(this,FlagQuizQuestionsActivity::class.java)
                 intent.putExtra(Constants.USER_NAME,mUserName)
                 startActivity(intent)
                 finish()
             }
             R.id.crdv_Earth ->{
                 val intent = Intent(this,GreenEarthQuizQuestionsActivity::class.java)
                 intent.putExtra(Constants.USER_NAME,mUserName)
                 startActivity(intent)
                 finish()
             }

         }
    }
}