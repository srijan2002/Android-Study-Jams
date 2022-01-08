package com.example.tic_tac_toe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_blank2.*
import kotlinx.android.synthetic.main.fragment_blank2.view.*


class BlankFragment2 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_blank2, container, false)
        view.ent.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name",view.p1.text.toString());
            Navigation.findNavController(view).navigate(R.id.play,bundle)
        }
        view.ent2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.back_home)
        }
        return view
    }


}