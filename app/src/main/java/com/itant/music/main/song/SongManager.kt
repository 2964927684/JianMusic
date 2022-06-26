package com.itant.music.main.song

import java.util.concurrent.CopyOnWriteArrayList

/**
 * @date 2021-8-1 17:37
 * @author 詹子聪
 */
object SongManager {
    /**
     * 本机所有歌曲
     */
    val allSongList = CopyOnWriteArrayList<SongBean>()
}