package com.example.test2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val users = mutableListOf<User>()
    private lateinit var adapter : UserRecyclerAdapter
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()

        adapter = UserRecyclerAdapter(this,users)
        binding.recyclerView.adapter = adapter

        adapter.notifyDataSetChanged()

        binding.btnAddUser.setOnClickListener{
            users.add(generateRandomUsers())
            adapter.notifyDataSetChanged()
        }



    }

    private fun generateRandomUsers(): User{
        val fullNames = listOf<String>("MichaelTank","ErlingProgrammer", "LionelMessi","NikaComputer","LukaMarketer")
        val firstNames = listOf<String>("Michael","Erling", "Lionel","Nika","Luka")
        val lastNames = listOf<String>("Rose","Tank", "Messi","Something","Computer")
        val emails = listOf<String>("ragaca1@gmail.com","ragaca2@gmail.com","ragaca3@gmail.com","ragaca4@gmail.com",)

        val firstName = firstNames.random()
        val lastName = lastNames.random()
        val email = emails.random()
        val fullName = fullNames.random()

        return User(fullName,firstName,lastName,email)
    }

    private fun setUp(){
        setEquipmentData()
        setUpEquipmentRecycler()

    }

    private fun  setUpEquipmentRecycler(){
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = UserRecyclerAdapter(this,users)
    }



    private fun setEquipmentData(){
        adapter = UserRecyclerAdapter(this,users)
        users.also {
            it.add(
                User(

                    "SabaDogonadze",
                    "saba",
                    "Dogonadze",
                    "saba@Gmail.com"
                )
            )

            it.add(
                User(
                    "JackSnow",
                    "Jack",
                    "Snow",
                    "JackSnow1230@gmail.com"
                )
            )

            it.add(
                User(
                    "SamKashia",
                    "Sam",
                    "Kashia",
                    "SamKashiaCode@gmail.com"
                )
            )

            it.add(
                User(
                    "AndroidDevelopment",
                    "Android",
                    "Development",
                    "StartPrograming@gmail.com"
                )
            )
            it.add(
                User(
                    "AndroidDevelopment",
                    "Android",
                    "Development",
                    "StartPrograming@gmail.com"
                )
            )
            it.add(
                User(
                    "AndroidDevelopment",
                    "Android",
                    "Development",
                    "StartPrograming@gmail.com"
                )
            )
            it.add(
                User(
                    "AndroidDevelopment",
                    "Android",
                    "Development",
                    "StartPrograming@gmail.com"
                )
            )
            it.add(
                User(
                    "AndroidDevelopment",
                    "Android",
                    "Development",
                    "StartPrograming@gmail.com"
                )
            )
            it.add(
                User(
                    "AndroidDevelopment",
                    "Android",
                    "Development",
                    "StartPrograming@gmail.com"
                )
            )
            it.add(
                User(
                    "AndroidDevelopment",
                    "Android",
                    "Development",
                    "StartPrograming@gmail.com"
                )
            )


        }
    }
}