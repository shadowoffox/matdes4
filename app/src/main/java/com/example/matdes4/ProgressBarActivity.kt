package com.example.matdes4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)

        on.setOnClickListener { v ->
            pbar.isVisible=true
        }

        off.setOnClickListener { v->
            pbar.isVisible=false
        }
    }
}
