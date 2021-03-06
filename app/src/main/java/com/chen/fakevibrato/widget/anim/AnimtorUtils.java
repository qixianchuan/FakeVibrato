package com.chen.fakevibrato.widget.anim;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/**
 * @author Created by CHEN on 2019/7/22
 * @email 188669@163.com
 * 常用动画类
 */
public class AnimtorUtils {

    public static ObjectAnimator alpha(View view, float from, float to, long time, long delayTime) {
        ObjectAnimator alpha = ObjectAnimator.ofFloat(view
                , "alpha"
                , from, to);
        alpha.setInterpolator(new LinearInterpolator());
        alpha.setStartDelay(delayTime);
        alpha.setDuration(time);
        return alpha;
    }

    public static ObjectAnimator translation(View view, float from, float to, long time, long delayTime)  {
        ObjectAnimator translation = ObjectAnimator.ofFloat(view, "translationY", 0f, 1000f);
        translation.setInterpolator(new LinearInterpolator());
        translation.setStartDelay(delayTime);
        translation.setDuration(time);
        return translation;
    }
}
