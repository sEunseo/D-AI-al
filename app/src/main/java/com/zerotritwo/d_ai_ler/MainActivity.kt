package com.zerotritwo.d_ai_ler

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.telecom.TelecomManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // registerForActivityResult를 사용하여 결과 처리를 위한 콜백 등록
    private val defaultDialerResultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        checkSetDefaultDialerResult(result.resultCode)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("not problem")
        setContentView(R.layout.activity_main)
        checkDefaultDialer()
    }

    private fun checkDefaultDialer() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return
        println("Enter Function of permission")
        val telecomManager = getSystemService(TELECOM_SERVICE) as TelecomManager
        val isAlreadyDefaultDialer = packageName == telecomManager.defaultDialerPackage
        if (isAlreadyDefaultDialer) return
        val intent = Intent(TelecomManager.ACTION_CHANGE_DEFAULT_DIALER)
            .putExtra(TelecomManager.EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME, packageName)
        println("Permission Checked")
        // startActivityForResult 대신 registerForActivityResult를 사용한 콜백 실행
        defaultDialerResultLauncher.launch(intent)
    }

    private fun checkSetDefaultDialerResult(resultCode: Int) {
        val message = when (resultCode) {
            RESULT_OK -> "전화 앱 기본 설정 성공!"
            RESULT_CANCELED -> "전화 기본 앱 설정이 거부되었습니다."
            else -> "오류가 발생했습니다. | 오류 코드: $resultCode"
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
