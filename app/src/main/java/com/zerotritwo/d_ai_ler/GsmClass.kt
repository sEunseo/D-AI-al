package com.zerotritwo.d_ai_ler

data class GsmCall(val status: GsmCall.Status, val displayName: String?) {

    enum class Status {
        CONNECTING,
        DIALING,
        RINGING,
        ACTIVE,
        DISCONNECTED,
        UNKNOWN
    }
}