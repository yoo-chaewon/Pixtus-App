package com.mash.up.pixtus_app.ui

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.google.gson.annotations.SerializedName
import com.mash.up.pixtus_app.R
import com.mash.up.pixtus_app.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }


    fun initUI(){
        var dateFormat = SimpleDateFormat("MM.dd / EEE")
        tv_date.text = dateFormat.format(Date()).toString()
    }
}