package com.adapter;
/***
 * 步骤 1 为媒体播放器和更高级的媒体播放器创建接口。
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
