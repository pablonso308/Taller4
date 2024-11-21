package com.example.taller4.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.taller4.R

class DetailFragment : Fragment() {

    private lateinit var detailTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        detailTextView = view.findViewById(R.id.detailTextView)
        return view
    }

    fun updateDetail(item: String) {
        detailTextView.text = item
    }
}