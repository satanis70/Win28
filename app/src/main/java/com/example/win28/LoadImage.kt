package com.example.win28

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

object LoadImage {
    fun load(constraintLayout: ConstraintLayout, context: Context) {
        Glide.with(context)
            .asDrawable()
            .load("http://49.12.202.175/win28/backimage.jpg")
            .into(object : CustomTarget<Drawable>() {
                override fun onResourceReady(
                    resource: Drawable,
                    transition: Transition<in Drawable>?
                ) {
                    constraintLayout.background = resource
                }
                override fun onLoadCleared(placeholder: Drawable?) {}
            })
    }
}