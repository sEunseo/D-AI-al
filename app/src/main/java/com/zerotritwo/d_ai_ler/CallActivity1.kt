package com.zerotritwo.d_ai_ler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.disposables.Disposables

class CallActivity1 : AppCompatActivity() {

    //ADD

    private var updatesDisposable = Disposables.empty()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)
    }

    override fun onResume() {
        super.onResume()
        updatesDisposable = CallManager.updates()
            .subscribe { updateView(it) }
    }

    override fun onPause() {
        super.onPause()
        updatesDisposable.dispose()
    }

    private fun updateView(gsmCall: GsmCall) {
        // Update the views here
    }

}