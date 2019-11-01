package com.lanou.AdapterPattern;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 9:29 2019/11/1
 * @Modified By:
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name: " + fileName);
    }
}
