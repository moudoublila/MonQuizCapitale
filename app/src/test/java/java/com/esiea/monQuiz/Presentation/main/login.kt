package com.esiea.monquiz
import android.R
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.esiea.monquiz.R.layout.activity_login)
    }

    fun login(v: View?) {
        val email = findViewById<View>(R.id.email) as EditText
        val password = findViewById<View>(R.id.password) as EditText
        if (email.text.toString() == "lila" && password.text.toString() == "lila") {
            Toast.makeText(this, "Identification avec succés", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Login ou password incorrect", Toast.LENGTH_LONG).show()
        }
    }
}