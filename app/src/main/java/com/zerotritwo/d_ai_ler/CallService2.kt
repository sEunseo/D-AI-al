package com.zerotritwo.d_ai_ler

import android.telecom.Call
import android.telecom.InCallService

class CallService2 : InCallService() {

    //ADD

    override fun onCallAdded(call: Call) {
        super.onCallAdded(call)
        call.registerCallback(callCallback)
        // We can start here our call Activity
        CallManager.updateCall(call)
    }

    override fun onCallRemoved(call: Call) {
        super.onCallRemoved(call)
        call.unregisterCallback(callCallback)
        CallManager.updateCall(null)
    }

    private val callCallback = object : Call.Callback() {
        override fun onStateChanged(call: Call, state: Int) {
            CallManager.updateCall(call)
        }
    }

}