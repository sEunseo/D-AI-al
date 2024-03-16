package com.zerotritwo.d_ai_ler
import android.telecom.Call
import android.telecom.InCallService
//ADD

class CallService : InCallService() {

    //ADD

    override fun onCallAdded(call: Call) {
        super.onCallAdded(call)
        call.registerCallback(callCallback)
    }

    override fun onCallRemoved(call: Call) {
        super.onCallRemoved(call)
        call.unregisterCallback(callCallback)
    }

    private val callCallback = object : Call.Callback() {
        override fun onStateChanged(call: Call, state: Int) {
            super.onStateChanged(call, state)
        }
    }
}