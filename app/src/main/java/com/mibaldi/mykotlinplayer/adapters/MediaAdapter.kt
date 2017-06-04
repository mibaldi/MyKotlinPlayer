package com.mibaldi.mykotlinplayer.adapters

import android.media.Image
import android.net.Uri
import android.opengl.Visibility
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.mibaldi.mykotlinplayer.*
import com.mibaldi.mykotlinplayer.data.MediaItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_media_item.view.*
import org.w3c.dom.Text


class MediaAdapter(val items: List<MediaItem>): RecyclerView.Adapter<MediaAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //val inflate = LayoutInflater.from(parent.context).inflate(R.layout.view_media_item, parent, false)
        val inflate = parent.inflate(R.layout.view_media_item)
        return ViewHolder(inflate)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        /*val mediaThumb = find<ImageView>(R.id.media_thumb)
        val mediaTitle = find<TextView>(R.id.media_title)
        val mediaVideoIndicator = find<ImageView>(R.id.media_video_indicator)*/
        val mediaThumb = view.media_thumb
        val mediaTitle = view.media_title
        val mediaVideoIndicator = view.media_video_indicator


        fun bind(item: MediaItem)= with(item){
            mediaTitle.text = title
            mediaVideoIndicator.visibility = when (type) {
                MediaItem.Type.PHOTO ->  View.GONE
                MediaItem.Type.VIDEO ->  View.VISIBLE
            }

            mediaThumb.loadUrl(url)
            toast(title)
        }
    }
}