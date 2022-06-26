@file:JvmName("SystemUtils")
package com.itant.music.utils

import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.annotation.ColorInt

/**
 * 设置状态栏颜色
 * @date 2021-7-24 11:48
 * @author 詹子聪
 */
fun setStatusColor(window: Window, @ColorInt color: Int) {
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    window.statusBarColor = color
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
}