package com.lanou.AdapterPattern;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 9:29 2019/11/1
 * @Modified By:
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
