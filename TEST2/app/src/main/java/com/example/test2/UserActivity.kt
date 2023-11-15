package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test2.databinding.ActivityMainBinding
import com.example.test2.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = intent.extras?.getString("name")
        var lastName =intent.extras?.getString("lastname")
        var mail = intent.extras?.getString("mail")

        binding.edName.hint = name
        binding.edLastName.hint = lastName
        binding.edMail.hint = mail

        var newname = binding.edName.text.toString()
        var newlast = binding.edLastName.text.toString()
        var newmail = binding.edMail.text.toString()

        binding.btnBack.setOnClickListener{

            intent.putExtra("newname", newname)
            intent.putExtra("last", newlast)
            intent.putExtra("mail", newmail)
            finish()

        }
    }
}