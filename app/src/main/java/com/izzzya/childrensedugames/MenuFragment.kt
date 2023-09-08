package com.izzzya.childrensedugames

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController


class MenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val reading = view.findViewById<ConstraintLayout>(R.id.reading_cl)
        val drawing = view.findViewById<ConstraintLayout>(R.id.drawing_cl)

        reading.setOnClickListener {
            findNavController().navigate(R.id.action_global_readingGameFragment)
        }

        drawing.setOnClickListener {
            findNavController().navigate(R.id.action_global_drawingFragment)
        }
    }

    companion object {

    }
}