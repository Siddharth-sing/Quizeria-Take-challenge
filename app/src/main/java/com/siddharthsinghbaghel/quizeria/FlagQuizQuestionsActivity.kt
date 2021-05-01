package com.siddharthsinghbaghel.quizeria

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_flag_quiz_questions.*
import kotlin.random.Random

class FlagQuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

     private var mCurrentPosition: Int = 1
     private var mQuestionList: ArrayList<MyQuestions>? = null
     private var mSelectedOptionPosition: Int = 0
     private var mCorrectAnswer: Int = 0
     private var mUserName: String? = null
     private var progressBarNumber: Int = 1

     private var s = mutableSetOf<Int>()
     private var index = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "  Flag"
        setContentView(R.layout.activity_flag_quiz_questions)

        mUserName = intent.getStringExtra(Constants.USER_NAME)
        mQuestionList = Constants.getFlagQuestions()

        while (s.size < 10)
        {
            s.add((1..10).random())
        }
        val randomList = s.toList()

        println(randomList)

        setQuestion()

        tv_option_one.setOnClickListener(this)   /* onClick() method is implemented below */
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)

    }

    private fun setQuestion()
    {

        val randomList = s.toList()
        val ran = randomList[index]
        index++;

        println(ran)

        mCurrentPosition = ran
        val currentQuestion : MyQuestions = mQuestionList!![mCurrentPosition - 1]

        defaultOptionView()

        btn_submit.text = "SUBMIT"


        progressBar.progress = progressBarNumber
        tv_progress.text = "$progressBarNumber" + "/" +progressBar.max
        tv_question.text = currentQuestion!!.question
        img_flag.setImageResource(currentQuestion.image)
        tv_option_one.text = currentQuestion.optionOne
        tv_option_two.text = currentQuestion.optionTwo
        tv_option_three.text = currentQuestion.optionThree
        tv_option_four.text = currentQuestion.optionFour
    }


    private fun defaultOptionView(){

        val options = ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        for(option in options){

             option.setTextColor(Color.parseColor("#7A8089"))
             option.typeface = Typeface.DEFAULT
             option.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_background)
        }

    }

    override fun onClick(v: View?) {

              when(v?.id){
                  R.id.tv_option_one ->{
                      selectedOptionView(tv_option_one,1)
                  }
                  R.id.tv_option_two ->{
                      selectedOptionView(tv_option_two,2)
                  }
                  R.id.tv_option_three ->{
                      selectedOptionView(tv_option_three,3)
                  }
                  R.id.tv_option_four ->{
                      selectedOptionView(tv_option_four,4)
                  }
                  R.id.btn_submit ->{

                      if(mSelectedOptionPosition == 0) {
                             progressBarNumber++
                             when {
                                 progressBarNumber <= mQuestionList!!.size -> {
                                     setQuestion()
                                     tv_option_one.isClickable = true
                                     tv_option_two.isClickable = true
                                     tv_option_three.isClickable = true
                                     tv_option_four.isClickable = true
                                 }
                                 else -> {
                                     Toast.makeText(this, "Quiz Completed", Toast.LENGTH_SHORT)
                                         .show()
                                     val intent = Intent(this,ResultActivity::class.java)
                                     intent.putExtra(Constants.USER_NAME,mUserName)
                                     intent.putExtra(Constants.CORRECT_ANSWER,mCorrectAnswer)
                                     intent.putExtra(Constants.TOTAL_QUESTION, mQuestionList!!.size)
                                     startActivity(intent)
                                     finish()
                                 }
                             }
                         }else{

                             tv_option_one.isClickable = false
                             tv_option_two.isClickable = false
                             tv_option_three.isClickable = false
                             tv_option_four.isClickable = false

                             val question = mQuestionList?.get( mCurrentPosition -1 )
                              if(question!!.correctAnswer != mSelectedOptionPosition)
                              {
                                  answerView(mSelectedOptionPosition,R.drawable.wrong_option_background)
                              }else{
                                  mCorrectAnswer++
                              }
                             answerView(question!!.correctAnswer,R.drawable.correct_option_background)

                             if(progressBarNumber == mQuestionList!!.size){
                             btn_submit.text = "FINISH"
                             }
                             else{
                                 btn_submit.text = "GO TO NEXT QUESTION"
                             }
                             mSelectedOptionPosition = 0
                         }

                  }
              }

    }
    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1->{
                tv_option_one.setTextColor(Color.parseColor("#363A43"))
                tv_option_one.setTypeface(tv_option_one.typeface,Typeface.BOLD)
                tv_option_one.background = ContextCompat.getDrawable(this,drawableView)
            }
            2->{
                tv_option_two.setTextColor(Color.parseColor("#363A43"))
                tv_option_two.setTypeface(tv_option_two.typeface,Typeface.BOLD)
                tv_option_two.background = ContextCompat.getDrawable(this,drawableView)
            }
            3->{
                tv_option_three.setTextColor(Color.parseColor("#363A43"))
                tv_option_three.setTypeface(tv_option_three.typeface,Typeface.BOLD)
                tv_option_three.background = ContextCompat.getDrawable(this,drawableView)
            }
            4->{
                tv_option_four.setTextColor(Color.parseColor("#363A43"))
                tv_option_four.setTypeface(tv_option_four.typeface,Typeface.BOLD)
                tv_option_four.background = ContextCompat.getDrawable(this,drawableView)
            }
        }
    }

    private fun selectedOptionView(txtView : TextView,selectedOptionNum : Int){

             defaultOptionView()
             mSelectedOptionPosition = selectedOptionNum

        txtView.setTextColor(Color.parseColor("#363A43"))
        txtView.setTypeface(txtView.typeface,Typeface.BOLD)
        txtView.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border_background)

    }
}

