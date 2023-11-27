package com.example.pesenin.data.repository

import android.util.Log
import com.example.pesenin.data.model.User
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UserRepository {
    private lateinit var database:DatabaseReference

fun CreateUser(email:String,nim:String, phone:String, profil:String, password:String, Uid:String, callback: (Boolean)->Unit){
        database = FirebaseDatabase.getInstance().getReference("Users")

        val User = User(email, nim, phone,profil, password)

        database.child(Uid).setValue(User).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // Operasi penulisan berhasil
                callback(true)
            } else {
                // Operasi penulisan gagal
                callback(false)
                // Dapatkan pesan kesalahan dari task.getException() dan tampilkan atau log sesuai kebutuhan
                val error = task.exception?.message
                Log.e("UserRepository", "Error writing to database: $error")
            }
        }
    }

}