package com.example.fontawesomeapp

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.res.ResourcesCompat


class FontAwesomeIconV5 @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = android.R.attr.textViewStyle
) : AppCompatTextView(context, attrs, defStyle) {

    init {
        val arr = context.obtainStyledAttributes(
            attrs, R.styleable.FontAwesomeIconV5,
            0, 0
        )

        val isSolid = arr.getBoolean(R.styleable.FontAwesomeIconV5_solid_icon, false)
        val isBrand = arr.getBoolean(R.styleable.FontAwesomeIconV5_brand_icon, false)

        arr.recycle() // release the TypedArray so that it can be reused.

        typeface = when {
            isBrand -> ResourcesCompat.getFont(context, R.font.fa_brands)
            isSolid -> ResourcesCompat.getFont(context, R.font.fa_solid)
            else -> ResourcesCompat.getFont(context, R.font.fa_regular)
        }
    }

}