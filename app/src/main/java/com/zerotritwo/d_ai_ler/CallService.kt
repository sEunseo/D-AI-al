package com.zerotritwo.d_ai_ler
<<<<<<< HEAD
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
=======
import android.telecom.InCallService
//ADD

class CallService : InCallService()
>>>>>>> 25d04f2bece22402239238a9e4842dcd5dfe0cf4
