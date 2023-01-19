package com.example.win28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.onesignal.OneSignal
import kotlinx.android.synthetic.main.activity_game.*

class ActivityGame : AppCompatActivity() {
    private var currentPlayer: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        LoadImage.load(game_layout, this)
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId("714b9f14-381d-4fc4-a93c-28d480557381")
        onClickTv()
        button_next.setOnClickListener {
            tvEnable()
        }
    }

    private fun onClickTv(){
        textView_1.setOnClickListener {
            currentMark(it as TextView)
            it.isEnabled = false
        }
        textView_2.setOnClickListener {
            currentMark(it as TextView)
            it.isEnabled = false
        }
        textView_3.setOnClickListener {
            currentMark(it as TextView)
            it.isEnabled = false
        }
        textView_4.setOnClickListener {
            currentMark(it as TextView)
            it.isEnabled = false
        }
        textView_5.setOnClickListener {
            currentMark(it as TextView)
            it.isEnabled = false
        }
        textView_6.setOnClickListener {
            currentMark(it as TextView)
            it.isEnabled = false
        }
        textView_7.setOnClickListener {
            currentMark(it as TextView)
            it.isEnabled = false
        }
        textView_8.setOnClickListener {
            currentMark(it as TextView)
            it.isEnabled = false
        }
        textView_9.setOnClickListener {
            currentMark(it as TextView)
            it.isEnabled = false
        }
    }

    private fun currentMark(textView: TextView){
        if (currentPlayer==0){
            textView.text = "X"
            checkWin("X")
            currentPlayer+=1
        } else {
            textView.text = "O"
            checkWin("O")
            currentPlayer-=1
        }
    }

    private fun tvDisable(){
        textView_1.isEnabled = false
        textView_2.isEnabled = false
        textView_3.isEnabled = false
        textView_4.isEnabled = false
        textView_5.isEnabled = false
        textView_6.isEnabled = false
        textView_7.isEnabled = false
        textView_8.isEnabled = false
        textView_9.isEnabled = false
    }

    private fun tvEnable(){
        textView_1.isEnabled = true
        textView_2.isEnabled = true
        textView_3.isEnabled = true
        textView_4.isEnabled = true
        textView_5.isEnabled = true
        textView_6.isEnabled = true
        textView_7.isEnabled = true
        textView_8.isEnabled = true
        textView_9.isEnabled = true
        textView_1.text = null
        textView_2.text = null
        textView_3.text = null
        textView_4.text = null
        textView_5.text = null
        textView_6.text = null
        textView_7.text = null
        textView_8.text = null
        textView_9.text = null
        textView_1.background = null
        textView_2.background = null
        textView_3.background = null
        textView_4.background = null
        textView_5.background = null
        textView_6.background = null
        textView_7.background = null
        textView_8.background = null
        textView_9.background = null
        currentPlayer = 0
    }

    private fun checkWin(currentPlayer: String){
        if (textView_1.text == currentPlayer&&textView_2.text==currentPlayer&&textView_3.text==currentPlayer){
            textView_1.background = ContextCompat.getDrawable(this, R.drawable.horisontal_line)
            textView_2.background = ContextCompat.getDrawable(this, R.drawable.horisontal_line)
            textView_3.background = ContextCompat.getDrawable(this, R.drawable.horisontal_line)
            tvDisable()
        } else if (textView_4.text == currentPlayer&&textView_5.text==currentPlayer&&textView_6.text==currentPlayer){
            textView_4.background = ContextCompat.getDrawable(this, R.drawable.horisontal_line)
            textView_5.background = ContextCompat.getDrawable(this, R.drawable.horisontal_line)
            textView_6.background = ContextCompat.getDrawable(this, R.drawable.horisontal_line)
            tvDisable()
        } else if(textView_7.text == currentPlayer&&textView_8.text==currentPlayer&&textView_9.text==currentPlayer){
            textView_7.background = ContextCompat.getDrawable(this, R.drawable.horisontal_line)
            textView_8.background = ContextCompat.getDrawable(this, R.drawable.horisontal_line)
            textView_9.background = ContextCompat.getDrawable(this, R.drawable.horisontal_line)
            tvDisable()
        } else if(textView_1.text == currentPlayer&&textView_5.text==currentPlayer&&textView_9.text==currentPlayer){
            textView_1.background = ContextCompat.getDrawable(this, R.drawable.left_diagonal_line)
            textView_5.background = ContextCompat.getDrawable(this, R.drawable.left_diagonal_line)
            textView_9.background = ContextCompat.getDrawable(this, R.drawable.left_diagonal_line)
            tvDisable()
        } else if(textView_3.text == currentPlayer&&textView_5.text==currentPlayer&&textView_7.text==currentPlayer){
            textView_3.background = ContextCompat.getDrawable(this, R.drawable.right_diagonal_line)
            textView_5.background = ContextCompat.getDrawable(this, R.drawable.right_diagonal_line)
            textView_7.background = ContextCompat.getDrawable(this, R.drawable.right_diagonal_line)
            tvDisable()
        } else if (textView_1.text == currentPlayer&&textView_4.text==currentPlayer&&textView_7.text==currentPlayer){
            textView_1.background = ContextCompat.getDrawable(this, R.drawable.vertical_line)
            textView_4.background = ContextCompat.getDrawable(this, R.drawable.vertical_line)
            textView_7.background = ContextCompat.getDrawable(this, R.drawable.vertical_line)
            tvDisable()
        } else if (textView_2.text == currentPlayer&&textView_5.text==currentPlayer&&textView_8.text==currentPlayer){
            textView_2.background = ContextCompat.getDrawable(this, R.drawable.vertical_line)
            textView_5.background = ContextCompat.getDrawable(this, R.drawable.vertical_line)
            textView_8.background = ContextCompat.getDrawable(this, R.drawable.vertical_line)
            tvDisable()
        } else if (textView_3.text == currentPlayer&&textView_6.text==currentPlayer&&textView_9.text==currentPlayer){
            textView_3.background = ContextCompat.getDrawable(this, R.drawable.vertical_line)
            textView_6.background = ContextCompat.getDrawable(this, R.drawable.vertical_line)
            textView_9.background = ContextCompat.getDrawable(this, R.drawable.vertical_line)
            tvDisable()
        }
    }
}