package com.example.test2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test2.databinding.ItemRecyclerviewBinding

class UserRecyclerAdapter (private val context: Context, private val users: MutableList<User>):RecyclerView.Adapter<UserRecyclerAdapter.UserViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
       return UserViewHolder(ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return users.size
    }


    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val equipment = users[position]
        holder.binding.etFullName.text = equipment.fullName
        holder.binding.etName.text = "Name:${equipment.name} "
        holder.binding.etLastName.text = "LastName: ${equipment.lastName}"
        holder.binding.etMail.text = "email: ${equipment.mail}"

       // var a =  holder.binding.etName.text.toString()  Test!!!
        // var  b =  holder.binding.etLastName.text.toString() Test!!!
        //   var c =  holder.binding.etMail.text.toString()  Test!!!

        holder.binding.btnDelete.setOnClickListener{
                removeItem(holder.adapterPosition)
        }

        holder.binding.btnChange.setOnClickListener{

            val intent = Intent(context, UserActivity::class.java)
             intent.putExtra("name",equipment.name)
             intent.putExtra("lastname",equipment.lastName)
             intent.putExtra("mail",equipment.mail)

            context.startActivity(intent)

        }


    }


    private fun removeItem(position: Int) {
        users.removeAt(position)
        notifyItemRemoved(position)
    }

    inner class UserViewHolder(val binding:ItemRecyclerviewBinding):RecyclerView.ViewHolder(binding.root){

    }

}