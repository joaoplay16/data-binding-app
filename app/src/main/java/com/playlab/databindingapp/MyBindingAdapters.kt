package com.playlab.databindingapp

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load

//a ordem dos parametros é importante!
@BindingAdapter("loadImageFromUrl", "displayTitle", requireAll = false)
fun ImageView.loadImageFromUrl(profilePhoto: String, title: String){
    this.load(profilePhoto)
    Log.d("Title", title)
}

@BindingAdapter("setVisibility")
fun View.setMyViewVisibility(points: Int){
    if(points > 10){
        this.visibility = View.INVISIBLE
    }
    when(this){
        is ImageView -> {

        }
        is TextView -> {

        }
    }
}


