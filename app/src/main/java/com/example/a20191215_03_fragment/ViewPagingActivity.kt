package com.example.a20191215_03_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20191215_03_fragment.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_view_paging.*

class ViewPagingActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_paging)
        setupEvents()
        setValue()
    }

    override fun setupEvents() {

    }

    override fun setValue() {
        mainViewPager.adapter = MainViewPagerAdapter(supportFragmentManager)
    }

}
