package com.izzzya.childrensedugames

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class OnboardingFragment : Fragment() {
    var pages = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val img = view.findViewById<ImageView>(R.id.imageView)
        val header = view.findViewById<TextView>(R.id.headerTV)
        val content = view.findViewById<TextView>(R.id.contentTV)

        header.text = getString(R.string.onb_header_1)
        content.text = getString(R.string.onb_content_1)
        view.findViewById<Button>(R.id.nextBtn).setOnClickListener {
            pages++
            if (pages==3){
                SharedPrefs.setOnb(true)
                findNavController().navigate(R.id.action_global_menuFragment)
            }else when(pages){
                1-> {
                    img.setImageResource(R.drawable.crayons)
                    header.text = getString(R.string.onb_header_2)
                    content.text = getString(R.string.onb_content_2)
                }
                2->{
                    img.setImageResource(R.drawable.book)
                    header.text = getString(R.string.onb_header_3)
                    content.text = getString(R.string.onb_content_3)
                }
            }
        }
    }

    companion object {

    }
}