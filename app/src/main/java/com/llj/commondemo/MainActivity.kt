package com.llj.commondemo

import android.annotation.SuppressLint
import com.llj.commondemo.base.BaseActivity
import com.llj.commondemo.base.startNewActivity
import com.llj.commondemo.databinding.ActivityMainBinding
import com.llj.commondemo.bubble.BubbleActivity

@SuppressLint("ClickableViewAccessibility")
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun buildBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate() {
        binding.bubbleActivity.setOnClickListener {
            startNewActivity(BubbleActivity::class.java)
        }
    }

}