package com.elyeproj.horizontaltextarragement

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_wrap_space.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_animate.setOnClickListener {
            if (txt_worst.visibility == View.VISIBLE) {
                txt_worst.visibility = View.GONE
                tab_filter_space.visibility = View.GONE
                txt_ok.setText(R.string.text_normal)
            } else {
                txt_worst.visibility = View.VISIBLE
                tab_filter_space.visibility = View.VISIBLE
                txt_ok.setText(R.string.text_ok)
            }
        }
    }
}
