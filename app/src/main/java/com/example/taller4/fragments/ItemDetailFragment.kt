package com.example.taller4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.taller4.R

class ItemDetailFragment : Fragment() {

    companion object {
        private const val ARG_ITEM = "item"

        fun newInstance(item: String) = ItemDetailFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_ITEM, item)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_detail, container, false)
        val item = arguments?.getString(ARG_ITEM)
        val textView: TextView = view.findViewById(R.id.item_detail)
        textView.text = item
        return view
    }
}