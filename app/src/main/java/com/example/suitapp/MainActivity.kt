package com.example.suitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        restart_btn.setOnClickListener {
            clear_score()
        }

        scissors_btn.setOnClickListener {

            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.gunting));

            val computer_move = (1..4).random()
            if (computer_move == 1) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.batu));
                winner_tv.text = "komputer menang"

            } else if (computer_move == 2) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.kertas));
                winner_tv.text = "pemain menang"

            } else {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.gunting));
                winner_tv.text = "Draw"
            }
        }

        paper_btn.setOnClickListener {

            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.kertas));

            val computer_move = (1..4).random()

            if (computer_move == 1) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.batu));
                winner_tv.text = "pemain menang"
            }
            else if (computer_move == 2) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.kertas));
                winner_tv.text = "Draw"
            } else {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.gunting));
                winner_tv.text = "komputer menang"
            }
        }

        rock_btn.setOnClickListener {

            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.batu));

            val computer_move = (1..4).random()

            if (computer_move == 1) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.batu));
                winner_tv.text = "Draw"

            } else if (computer_move == 2) {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.kertas));
                winner_tv.text = "komputer menang"

            } else {

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.gunting));
                winner_tv.text = "pemain menang"

            }
        }
    }
    private fun clear_score() {

        winner_tv.text = "VS"

        user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.tanda_tanya));
        computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.tanda_tanya));

    }
}