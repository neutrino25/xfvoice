package com.xfvoice.mytts;

import com.iflytek.cloud.speech.SpeechConstant;
import com.iflytek.cloud.speech.SpeechSynthesizer;
import com.iflytek.cloud.speech.SpeechUtility;

/**
 * 语音合成，又称文语转换（Text to Speech，TTS）技术
 * 解决的主要问题是如何将文字信息转化为可听的声音信息（即音频数据）
 */
public class Speaking {
    private static final String APPID ="5ae2e879";
    public static void main(String[] args){
        //在程序入口处-----创建用户语音配置对象
        SpeechUtility.createUtility("appid=" + APPID);
        //1.创建SpeechSynthesizer对象
        SpeechSynthesizer mTts= SpeechSynthesizer.createSynthesizer();
        //2.合成参数设置，详见《MSC Reference Manual》SpeechSynthesizer 类
        mTts.setParameter(SpeechConstant.VOICE_NAME, "xiaoyan");    //设置发音人
        mTts.setParameter(SpeechConstant.SPEED, "50");              //设置语速  范围0~100
        mTts.setParameter(SpeechConstant.VOLUME, "80");             //设置音量，范围0~100
        //设置合成音频保存位置（可自定义保存位置），保存在“./tts_test.pcm”
        //如果不需要保存合成音频，注释该行代码
        mTts.setParameter(SpeechConstant.TTS_AUDIO_PATH, "./tts_test.pcm");
        //3.开始合成
        Synthesizer synthesizer = new Synthesizer();
        mTts.startSpeaking("我是语音合成发出的声音！", synthesizer);
    }
}