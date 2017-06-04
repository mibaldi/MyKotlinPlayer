package com.mibaldi.mykotlinplayer

import android.app.Activity
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso


fun Context.toast(message: String,duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,message,duration).show()
}

fun RecyclerView.ViewHolder.toast(message: String,duration: Int = Toast.LENGTH_SHORT){
    itemView.context.toast(message, duration)
}
fun ViewGroup.inflate(layout: Int) : View {
   return LayoutInflater.from(this.context).inflate(layout,this,false)
}
fun ImageView.loadUrl(url: String) {
    Picasso.with(this.context).load(url).placeholder(R.mipmap.ic_launcher_round).into(this)
}
inline fun <reified T: View> View.find(idRes: Int): T {
    return this.findViewById(idRes) as T
}
inline fun <reified T: View> RecyclerView.ViewHolder.find(idRes: Int): T {
    return itemView.find(idRes)
}