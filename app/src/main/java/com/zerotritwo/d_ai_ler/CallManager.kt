package com.zerotritwo.d_ai_ler

import io.reactivex.Observable
import android.telecom.Call
import io.reactivex.subjects.BehaviorSubject

object CallManager {

    private val subject = BehaviorSubject.create<GsmCall>()

    fun updates(): Observable<GsmCall> = subject

    fun updateCall(call: Call?) {
        call?.let {
            subject.onNext(it.toGsmCall())
        }
    }

}