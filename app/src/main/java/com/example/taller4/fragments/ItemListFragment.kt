package com.example.taller4.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.taller4.R

class ItemListFragment : androidx.fragment.app.Fragment() {

    private var listener: OnItemSelectedListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnItemSelectedListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnItemSelectedListener")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_list, container, false)
        val listView: ListView = view.findViewById(R.id.item_list)
        val items = listOf("Item 1", "Item 2", "Item 3")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            listener?.onItemSelected(items[position])
        }

        return view
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnItemSelectedListener {
        fun onItemSelected(item: String)
    }
}