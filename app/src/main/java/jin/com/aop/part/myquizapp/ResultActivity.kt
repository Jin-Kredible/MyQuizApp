package jin.com.aop.part.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val tvName : TextView = findViewById(R.id.tv_name)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val btnFinish : Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore.text = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        val totalQuestion : Int = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers : Int = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        tvScore.text = "Your score is $correctAnswers out of $totalQuestion"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}