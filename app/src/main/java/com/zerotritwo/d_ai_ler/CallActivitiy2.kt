package com.zerotritwo.d_ai_ler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.disposables.Disposables

class CallActivity : AppCompatActivity() {
    //ADD

    private var updatesDisposable = Disposables.empty()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        buttonHangup.setOnClickListener { CallManager2.cancelCall() }
        buttonAnswer.setOnClickListener { CallManager2.acceptCall() }
    }
}