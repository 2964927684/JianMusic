package com.itant.music.base

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.itant.music.R
import com.itant.music.utils.setStatusColor
import com.miekir.mvp.view.BindingActivity

/**
 * @date 2021-7-24 13:31
 * @author 詹子聪
 */
abstract class MusicActivity<VB : ViewBinding> : BindingActivity<VB>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setStatusColor(window, getColor(R.color.black_status_bar))
        super.onCreate(savedInstanceState)
    }
}