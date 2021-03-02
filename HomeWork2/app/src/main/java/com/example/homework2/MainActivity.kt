package com.example.homework2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    @SuppressLint("TimberArgCount")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val res: TextView = findViewById(R.id.textView)
        res.text = "Version: " + BuildConfig.VERSION_NAME + "\nType: " + BuildConfig.VERSION_TYPE
        val imageView: ImageView = findViewById(R.id.imageView)
        Glide.with(this).load("https://st.depositphotos.com/2290789/4224/i/600/depositphotos_42242043-stock-photo-wolf-head.jpg").into(imageView)
        Timber.e("Hello")
        try {
            val barcodeEncoder = BarcodeEncoder()
            val bitmap = barcodeEncoder.encodeBitmap("content", BarcodeFormat.QR_CODE, 400, 400)
            val imageViewQrCode = findViewById<View>(R.id.qrCode) as ImageView
            imageViewQrCode.setImageBitmap(bitmap)
        } catch (e: Exception) {
        }
    }
}