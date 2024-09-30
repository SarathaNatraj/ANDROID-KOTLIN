package com.example.newsapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.service.NewsApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsFragment : Fragment() {
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var category: String


    //called first
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

        // Initialize RecyclerView and Adapter
        newsAdapter = NewsAdapter(listOf())
        recyclerView.adapter = newsAdapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Get category from arguments
        category = arguments?.getString("category") ?: "general"

        // Fetch news articles based on the category
        fetchNews()

        return view
    }

    private fun fetchNews() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://newsapi.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(NewsApiService::class.java)

        //Runs in Background thread
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getTopHeadlines(category)
            withContext(Dispatchers.Main) {
                newsAdapter.updateArticles(response.articles)
            }
        }
    }

    companion object {
        fun newInstance(category: String): NewsFragment {
            val fragment = NewsFragment()
            val args = Bundle()
            args.putString("category", category)
            fragment.arguments = args
            return fragment
        }
    }
}
