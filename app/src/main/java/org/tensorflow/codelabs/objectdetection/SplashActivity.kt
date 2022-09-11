package org.tensorflow.codelabs.objectdetection

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.Animation
import android.widget.TextView
import android.speech.tts.TextToSpeech
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import java.util.*

class SplashActivity : AppCompatActivity() {
    private lateinit var textAnim: Animation
    private lateinit var imageAnim: Animation
    private lateinit var textView: TextView
    private lateinit var faceRecgnitionImageView: ImageView
    private lateinit var cThis: Context
    private lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        cThis = this
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        textView = findViewById(R.id.infoText)
        faceRecgnitionImageView = findViewById(R.id.imageView)
        textAnim = AnimationUtils.loadAnimation(this, R.anim.anim_splash_textview)
        imageAnim = AnimationUtils.loadAnimation(this, R.anim.anim_splash_imageview)
        faceRecgnitionImageView.startAnimation(imageAnim)
        textView.startAnimation(textAnim)

        // 음성 출력 생성, 리스너 초기화
        tts = TextToSpeech(cThis) { status ->
            if (status != TextToSpeech.ERROR) {
                tts.language = Locale.KOREAN
            }
        }
        imageAnim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}
            override fun onAnimationEnd(animation: Animation) {
                Handler().postDelayed({
                    FuncVoiceOut("카메라가 실행되었습니다. 물건을 스캔해주세요.")
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    overridePendingTransition(
                        R.anim.anim_slide_out_left,
                        R.anim.anim_slide_in_right
                    )
                }, (1000 * 2).toLong()) // 2초 정도 딜레이를 준 후 시작
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })
    }

    //음성 메세지 출력용
    private fun FuncVoiceOut(OutMsg: String) {
        if (OutMsg.length < 1) return
        tts.setPitch(1.0f) //목소리 톤1.0
        tts.setSpeechRate(1.0f) //목소리 속도
        tts.speak(OutMsg, TextToSpeech.QUEUE_FLUSH, null)

        //어플이 종료할때는 완전히 제거
    }
}