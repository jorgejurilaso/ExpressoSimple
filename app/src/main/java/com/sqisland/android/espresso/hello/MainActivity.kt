package com.sqisland.android.espresso.hello

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
  private lateinit var greetButton: View
  private lateinit var greetingView: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    AppCenter.start(application, "a3887cf8-1d74-48c2-9d6e-063ffbb858ab",
            Analytics::class.java, Crashes::class.java)
    setContentView(R.layout.activity_main)
    greetButton = findViewById(R.id.greet_button)
    greetingView = findViewById(R.id.greeting)
  }

  fun greet(v: View) {
    greetButton.isEnabled = false
    greetingView.setText(R.string.hello)
  }
}