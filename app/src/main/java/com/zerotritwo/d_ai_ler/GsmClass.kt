package com.zerotritwo.d_ai_ler

data class GsmCall(val status: GsmCall.Status, val displayName: String?) {

    //ADD

    enum class Status {
        CONNECTING,
        DIALING,
        RINGING,
        ACTIVE,
        DISCONNECTED,
        UNKNOWN
    }
}