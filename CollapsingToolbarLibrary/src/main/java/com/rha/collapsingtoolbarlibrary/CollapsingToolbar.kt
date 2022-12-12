package com.rha.collapsingtoolbarlibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.appcompat.widget.Toolbar

class CollapsingToolbar: FrameLayout {

    private var mContext: Context

    constructor(context: Context) : super(context) {
        mContext = context
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        mContext = context
        initialize(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        mContext = context
        initialize(context, attrs)
    }

    private fun initialize(context: Context, attrs: AttributeSet) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.collapsing_toolbar_layout, this, true)

        context.theme.obtainStyledAttributes(
            attrs, R.styleable.CollapsingToolbar, 0, 0).apply {
            try {
                val title = getString(R.styleable.CollapsingToolbar_title)
                title?.let {
                    val toolbar = findViewById<Toolbar>(R.id.toolbar)
                    toolbar.title = it
                }
            } finally {
                recycle()
            }
        }
    }
}