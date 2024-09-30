package com.example.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class NewsPagerAdapter(
    activity: AppCompatActivity, private val categories: List<String>
) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = categories.size

    override fun createFragment(position: Int): Fragment {
        //3 fragments are created
        return NewsFragment.newInstance(categories[position])
    }
}
