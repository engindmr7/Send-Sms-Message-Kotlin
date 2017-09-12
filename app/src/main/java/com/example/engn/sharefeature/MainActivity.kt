package com.example.engn.sharefeature

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonpaylas.setOnClickListener {
            val mesaj = textView.text

            SMS(mesaj)
        }
    }

    private fun  SMS(mesaj: CharSequence?) {


        val Intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:05055556699"))
        Intent.putExtra("sms_body",mesaj)
        startActivity(Intent)
    }

}
