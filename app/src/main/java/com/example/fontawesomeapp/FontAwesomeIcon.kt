package com.example.fontawesomeapp

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.res.ResourcesCompat

class FontAwesomeIcon @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = android.R.attr.textViewStyle
) : AppCompatTextView(context, attrs, defStyle) {

    init {
        typeface = ResourcesCompat.getFont(context, R.font.fa_brands)
    }

}