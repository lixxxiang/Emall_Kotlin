package com.emall.android.mall.ui.activity

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.blankj.utilcode.util.ScreenUtils
import com.blankj.utilcode.util.SizeUtils
import com.emall.android.emall_kotlin.R
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        var mHeight = 100
        relativeLayout {
            button {
                onClick {
                    println(ScreenUtils.getScreenHeight().toFloat())
                    mHeight = (SizeUtils.px2dp(ScreenUtils.getScreenHeight().toFloat()) - 72 - 92 - 250) * 0.4.toInt()

                }
            }

            relativeLayout {
                backgroundColor = Color.parseColor("#99000000")
            }.lparams(height = mHeight.toInt(), width = matchParent)

        }

//        topRl = RelativeLayout(activity)
//        topRl!!.id = 1
//        val topRlHeight = (DimenUtil().px2dip(context, DimenUtil().getScreenHeight().toFloat()) - 72 - 92 - 250) * 0.4
//        val topRlParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, DimenUtil().dip2px(context, topRlHeight.toFloat()))
//        topRlParams.addRule(RelativeLayout.BELOW, R.id.program_toolbar)
//        topRl!!.setBackgroundColor(Color.parseColor("#99000000"))
//        topRl!!.layoutParams = topRlParams
//        program_root_rl.addView(topRl, topRlParams)
    }

//    @SuppressLint("SetTextI18n")
//    fun sayHello(v: View) {
//        val string = "Hello, " + editText.text.toString() + "!"
//        textView.text = string
//        toast(string)
//    }
}
