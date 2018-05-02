package com.xfvoice.mytts;

import com.iflytek.cloud.speech.SpeechError;
import com.iflytek.cloud.speech.SynthesizerListener;

/**
 * SynthesizerListener
 合成监听器
 通过实现此接口，获取当前合成的状态和结果
 */
public class Synthesizer implements SynthesizerListener {
    //会话结束回调接口，没有错误时，error为null
    public void onCompleted(SpeechError error) {
    }

    //事件;通过此接口函数，获取对应的事件。
    public void onEvent(int i, int i1, int i2, int i3, Object o, Object o1) {
    }

    //缓冲进度回调
    //percent为缓冲进度0~100，beginPos为缓冲音频在文本中开始位置，endPos表示缓冲音频在文本中结束位置，info为附加信息。
    public void onBufferProgress(int percent, int beginPos, int endPos, String info) {
    }

    //开始播放
    public void onSpeakBegin() {
    }

    //暂停播放
    public void onSpeakPaused() {
    }

    //播放进度回调
    //percent为播放进度0~100,beginPos为播放音频在文本中开始位置，endPos表示播放音频在文本中结束位置.
    public void onSpeakProgress(int percent, int beginPos, int endPos) {
    }

    //恢复播放回调接口
    public void onSpeakResumed() {
    }
}