package com.mdp.movierate

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.json.JSONArray

class RatingsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val movies = JSONArray(arguments!!.getString("movies"))
        println("================================")
        println(movies.length())
        println("================================")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_ratings, container, false)

    companion object {
        fun newInstance(movies: String): RatingsFragment {
            val args = Bundle()
            args.putString("movies", movies)
            val fragment = RatingsFragment()
            fragment.arguments = args

            return fragment
        }
    }
}