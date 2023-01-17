package com.example.win28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_game.*

class ActivityGame : AppCompatActivity() {
    private var currentPlayer: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        LoadImage.load(game_layout, this)
        onClickTv()
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
        }
    }
}