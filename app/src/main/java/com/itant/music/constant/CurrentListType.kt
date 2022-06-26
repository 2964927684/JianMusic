package com.itant.music.constant

/**
 * 当前播放的歌曲所在列表是什么类型的
 * @date 2021-8-1 20:43
 * @author 詹子聪
 */
object CurrentListType {
    /**
     * 主列表，所有歌曲
     */
    const val MAIN = 1

    /**
     * 播放某个歌手下的歌曲
     */
    const val ARTIST = 2
    /**
     * 播放我的收藏
     */
    const val STAR = 3
}