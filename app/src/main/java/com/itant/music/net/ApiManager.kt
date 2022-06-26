package com.itant.music.net

import com.miekir.task.net.RetrofitHelper

/**
 * @date 2021-8-7 11:32
 * @author 詹子聪
 */
object ApiManager {
    const val BASE_URL = "http://geci.me/api/lyric/"

    /**
     * 默认的网络请求
     */
    val default: ApiService by lazy {
        RetrofitHelper.getDefault().createApiService(ApiService::class.java)
    }

    /**
     * 获取真正歌词的请求端
     */
    fun getLyric(lyricUrl: String): ApiService {
        val baseUrl = if (lyricUrl.endsWith("/")) lyricUrl else "${lyricUrl}/"
        return RetrofitHelper.newInstance().setBaseUrl(baseUrl).createApiService(ApiService::class.java)
    }
}