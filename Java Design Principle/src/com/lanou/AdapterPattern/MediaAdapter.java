package com.lanou.AdapterPattern;

/**
 * @Author: HuTingrong
 * @Description:适配器类
 * @Date: Created in 9:36 2019/11/1
 * @Modified By:
 */
public class MediaAdapter implements MediaPlayer {
    //vlc和mp4都可以播放的高级播放器
    AdvancedMediaPlayer advancedMediaPlayer;

    //适配器进行适配
    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    //适配器的播放器
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
