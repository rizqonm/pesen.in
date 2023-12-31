package com.example.pesenin.data.repository

import android.util.Log
import com.example.pesenin.data.model.User
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

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

    fun GetUserLogin(uid: String, callback: (User) -> Unit) {
        database = FirebaseDatabase.getInstance().getReference("Users")

        // Get a reference to the user node in the database
        val userRef = database.child(uid)

        // Read data from the database
        userRef.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val userData = snapshot.getValue(User::class.java)
                callback(userData!!)
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle error
                Log.e("UserRepository", "Error reading from database: ${error.message}")
            }
        })
    }

}