package com.izzzya.childrensedugames

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


class DrawingFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drawing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dv = view.findViewById<DrawingView>(R.id.drawing_view)


        view.findViewById<ImageButton>(R.id.blueBtn).setOnClickListener{
            dv.color = resources.getColor(R.color.blue)

        }
        view.findViewById<ImageButton>(R.id.yellowBtn).setOnClickListener{
            dv.color = resources.getColor(R.color.yellow)
        }
        view.findViewById<ImageButton>(R.id.greenBtn).setOnClickListener{
            dv.color = resources.getColor(R.color.green)
        }

        view.findViewById<ImageButton>(R.id.blackBtn).setOnClickListener{
            dv.color = resources.getColor(R.color.black)
        }

        view.findViewById<ImageButton>(R.id.whiteBtn).setOnClickListener{
            dv.color = resources.getColor(R.color.white)
        }
    }

    companion object {

    }
}