package com.example.dts_tugas1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.dts_tugas1.fragment.FragmentOne
import com.example.dts_tugas1.fragment.FragmentThree
import com.example.dts_tugas1.fragment.FragmentTwo

class Adapter (fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager){
    private val pages = listOf(FragmentOne(),FragmentTwo(),FragmentThree())
    override fun getItem(position: Int): Fragment {
       return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Third Tab"
        }
    }

}