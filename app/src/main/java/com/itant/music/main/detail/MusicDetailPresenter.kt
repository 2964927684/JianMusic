package com.itant.music.main.detail

import com.itant.music.net.ApiManager
import com.miekir.common.widget.loading.LoadingType
import com.miekir.mvp.presenter.BasePresenter
import com.miekir.task.extension.launchTask

/**
 * 音乐详情耗时任务
 * @date 2021-8-7 11:31
 * @author 詹子聪
 */
class MusicDetailPresenter: BasePresenter<MusicDetailActivity>() {
    /**
     * 获取歌词列表
     */
    fun getLyricList(songId: String, songName: String) {
        launchTask(
            {
                ApiManager.default.getLyricList(ApiManager.BASE_URL + songName).result
            }, onSuccess = {
                view?.getLyricListSuccess(songId, it)
            }, loadingType = LoadingType.VISIBLE
        )
    }

    /**
     * 获取具体歌词
     */
    fun getLyric(songId:String, lyricUrl: String) {
        launchTask(
            {
                ApiManager.getLyric(lyricUrl).getLyric()
            }, onSuccess = {
                view?.getLyricSuccess(songId, it)
            }, loadingType = LoadingType.VISIBLE
        )
    }
}