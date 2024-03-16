package com.zerotritwo.d_ai_ler

import android.telecom.Call
import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject

object CallManager2 {

    private val subject = BehaviorSubject.create<GsmCall>()

    private var currentCall: Call? = null

    fun updates(): Observable<GsmCall> = subject

    fun updateCall(call: Call?) {
        currentCall = call
        call?.let {
            subject.onNext(it.toGsmCall())
        }
    }

    fun cancelCall() {
        currentCall?.let {
            when (it.state) {
                Call.STATE_RINGING -> rejectCall()
                else               -> disconnectCall()
            }
        }
    }

    fun acceptCall() {
        currentCall?.let {
            it.answer(it.details.videoState)
        }
    }

    private fun rejectCall() {
        currentCall?.reject(false, "")
    }

    private fun disconnectCall() {
        currentCall?.disconnect()
    }
}