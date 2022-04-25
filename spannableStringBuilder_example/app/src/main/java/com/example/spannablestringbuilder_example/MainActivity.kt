package com.example.spannablestringbuilder_example

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.*
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val tv : TextView by lazy {
        findViewById(R.id.my_tv)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ssb = SpannableStringBuilder("RED BLUE NORMAL BOLD UNDERLINE SIZE CYAN GREEN")
        ssb.apply {
            setSpan(ForegroundColorSpan(Color.RED), 0, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) // 글자색 빨간색으로 변경
            setSpan(ForegroundColorSpan(Color.BLUE), 4, 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) // 글자색 파란색으로 변경
            setSpan(StyleSpan(Typeface.BOLD),16,20,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) // 글자 굵게 처리
            setSpan(UnderlineSpan(),21,30,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) // 글자 밑줄 처리
            setSpan(RelativeSizeSpan(1.5f),31,35,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) // 글자 크기 50% 증가
            setSpan(BackgroundColorSpan(Color.CYAN),36,40,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) // 배경색 CYAN(맑은 청록색)으로 변경
            setSpan(ForegroundColorSpan(Color.GREEN),41,46,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) // 글자색 초록색으로 변경
        }



        tv.text = ssb

    }
}