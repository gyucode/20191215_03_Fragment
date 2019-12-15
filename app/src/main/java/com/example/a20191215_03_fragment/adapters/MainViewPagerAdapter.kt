package com.example.a20191215_03_fragment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.a20191215_03_fragment.fragments.FirstFragment
import com.example.a20191215_03_fragment.fragments.SecondFragment

class MainViewPagerAdapter (fm:FragmentManager):FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
//        자바문법
//        if(position == 0){
//            return FirstFragment()
//        }
//        else{
//            return SecondFragment()
//        }
        return when(position){
            0 -> { FirstFragment() }
            else -> { SecondFragment() }
        }
    }

    override fun getCount(): Int {
        return 2
    }

}