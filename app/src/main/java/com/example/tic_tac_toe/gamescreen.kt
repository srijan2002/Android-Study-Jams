package com.example.tic_tac_toe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_gamescreen.*
import kotlinx.android.synthetic.main.fragment_gamescreen.view.*


class gamescreen : Fragment() {
    var a =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_gamescreen, container, false)
         var game = true;

        val x = this.arguments?.getString("name")
        if(game){
            if(a%2==0)
                view.name.setText("${x}'s Turn")
            else
                view.name.setText("Opponent's Turn")
        }
         else  view.name.setText("Game Over")

        view.one.setOnClickListener {
            if(game)
            {
                if(view.one.text.toString()==""){
                    if(a%2==0)
                        view.one.setText("O")
                    else view.one.setText("X")
                    a++;
                    game = victory()
                    println(game)
                    if(game){
                        if(a%2==0)
                            view.name.setText("${x}'s Turn")
                        else
                            view.name.setText("Opponent's Turn")
                    }
                    else{
                        view.name.setText("Game Over")
                        if(a>=9)
                            result.setText("Draw")
                        else{

                            if(a%2==0) result.setText("Opponent Won")
                            else result.setText("You Won")
                        }
                    }
                }
            }

        }
        view.two.setOnClickListener {
            if(game)
            {
                if(view.two.text.toString()==""){
                    if(a%2==0)
                        view.two.setText("O")
                    else view.two.setText("X")
                    a++;
                    game = victory()
                    println(game)
                    if(game){
                        if(a%2==0)
                            view.name.setText("${x}'s Turn")
                        else
                            view.name.setText("Opponent's Turn")
                    }
                    else{
                        view.name.setText("Game Over")
                        if(a>=9)
                            result.setText("Draw")
                        else{

                            if(a%2==0) result.setText("Opponent Won")
                            else result.setText("You Won")
                        }
                    }
                }
            }
        }
        view.three.setOnClickListener {
            if(game)
            {
                if(view.three.text.toString()==""){
                    if(a%2==0)
                        view.three.setText("O")
                    else view.three.setText("X")
                    a++;
                    game = victory()
                    println(game)
                    if(game){
                        if(a%2==0)
                            view.name.setText("${x}'s Turn")
                        else
                            view.name.setText("Opponent's Turn")
                    }
                    else{
                        view.name.setText("Game Over")
                        if(a>=9)
                            result.setText("Draw")
                        else{

                            if(a%2==0) result.setText("Opponent Won")
                            else result.setText("You Won")
                        }
                    }
                }
            }
        }
        view.four.setOnClickListener {
            if(game)
            {
                if(view.four.text.toString()==""){
                    if(a%2==0)
                        view.four.setText("O")
                    else view.four.setText("X")
                    a++;
                    game = victory()
                    println(game)
                    if(game){
                        if(a%2==0)
                            view.name.setText("${x}'s Turn")
                        else
                            view.name.setText("Opponent's Turn")
                    }
                    else{
                        view.name.setText("Game Over")
                        if(a>=9)
                            result.setText("Draw")
                        else{

                            if(a%2==0) result.setText("Opponent Won")
                            else result.setText("You Won")
                        }
                    }
                }
            }
        }
        view.five.setOnClickListener {
            if(game)
            {
                if(view.five.text.toString()==""){
                    if(a%2==0)
                        view.five.setText("O")
                    else view.five.setText("X")
                    a++;
                    game = victory()
                    println(game)
                    if(game){
                        if(a%2==0)
                            view.name.setText("${x}'s Turn")
                        else
                            view.name.setText("Opponent's Turn")
                    }
                    else{
                        view.name.setText("Game Over")
                        if(a>=9)
                            result.setText("Draw")
                        else{

                            if(a%2==0) result.setText("Opponent Won")
                            else result.setText("You Won")
                        }
                    }
                }
            }
        }
        view.six.setOnClickListener {
            if(game)
            {
                if(view.six.text.toString()==""){
                    if(a%2==0)
                        view.six.setText("O")
                    else view.six.setText("X")
                    a++;
                    game = victory()
                    println(game)
                    if(game){
                        if(a%2==0)
                            view.name.setText("${x}'s Turn")
                        else
                            view.name.setText("Opponent's Turn")
                    }
                    else{
                        view.name.setText("Game Over")
                        if(a>=9)
                            result.setText("Draw")
                        else{

                            if(a%2==0) result.setText("Opponent Won")
                            else result.setText("You Won")
                        }
                    }
                }
            }
        }
        view.seven.setOnClickListener {
            if(game)
            {
                if(view.seven.text.toString()==""){
                    if(a%2==0)
                        view.seven.setText("O")
                    else view.seven.setText("X")
                    a++;
                    game = victory()
                    println(game)
                    if(game){
                        if(a%2==0)
                            view.name.setText("${x}'s Turn")
                        else
                            view.name.setText("Opponent's Turn")
                    }
                    else{
                        view.name.setText("Game Over")
                        if(a>=9)
                            result.setText("Draw")
                        else{

                            if(a%2==0) result.setText("Opponent Won")
                            else result.setText("You Won")
                        }
                    }
                }
            }
        }
        view.eight.setOnClickListener {
            if(game)
            {
                if(view.eight.text.toString()==""){
                    if(a%2==0)
                        view.eight.setText("O")
                    else view.eight.setText("X")
                    a++;
                    game = victory()
                    println(game)
                    if(game){
                        if(a%2==0)
                            view.name.setText("${x}'s Turn")
                        else
                            view.name.setText("Opponent's Turn")
                    }
                    else{
                        view.name.setText("Game Over")
                        if(a>=9)
                            result.setText("Draw")
                        else{

                            if(a%2==0) result.setText("Opponent Won")
                            else result.setText("You Won")
                        }
                    }
                }
            }
        }
        view.nine.setOnClickListener {
            if(game)
            {
                if(view.nine.text.toString()==""){
                    if(a%2==0)
                        view.nine.setText("O")
                    else view.nine.setText("X")
                    a++;
                    game = victory()
                    println(game)
                    if(game){
                        if(a%2==0)
                            view.name.setText("${x}'s Turn")
                        else
                            view.name.setText("Opponent's Turn")
                    }else{
                        view.name.setText("Game Over")
                        if(a>=9)
                            result.setText("Draw")
                        else{

                            if(a%2==0) result.setText("Opponent Won")
                            else result.setText("You Won")
                        }
                    }

                }
            }
        }

         view.back.setOnClickListener {
             Navigation.findNavController(view).navigate(R.id.play_again)
         }

        return view
    }
    fun victory():Boolean{
        if(one.text.toString()==two.text.toString()&& one.text.toString()==three.text.toString() && one.text.toString()!="" )
            return false
        if(one.text.toString()==five.text.toString()&& one.text.toString()==nine.text.toString()&& one.text.toString()!="")
            return false
        if(four.text.toString()==five.text.toString()&& four.text.toString()==six.text.toString()&& four.text.toString()!="")
            return false
        if(seven.text.toString()==eight.text.toString()&& seven.text.toString()==nine.text.toString()&& nine.text.toString()!="")
            return false
        if(one.text.toString()==four.text.toString()&& one.text.toString()==seven.text.toString()&& one.text.toString()!="")
            return false
        if(two.text.toString()==five.text.toString()&& two.text.toString()==eight.text.toString()&& two.text.toString()!="")
            return false
        if(three.text.toString()==six.text.toString()&& three.text.toString()==nine.text.toString()&& three.text.toString()!="")
            return false
        if(three.text.toString()==five.text.toString()&& three.text.toString()==seven.text.toString()&& three.text.toString()!="")
            return false
        if(a>=9)
            return false

        return true
    }


}