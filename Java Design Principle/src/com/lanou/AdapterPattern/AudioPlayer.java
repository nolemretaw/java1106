package com.lanou.AdapterPattern;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 9:57 2019/11/1
 * @Modified By:
 */
public class AudioPlayer implements MediaPlayer {
    //适配器
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //可播放本身就支持的MP3格式
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName );
        }
        //通过适配器播放其他文件格式
        else if (audioType.equalsIgnoreCase("mp4")
            || audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
    }
}
