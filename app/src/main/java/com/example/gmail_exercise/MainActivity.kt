package com.example.gmail_exercise

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val emails = listOf(
            Email("Edurila.com", "Discount", "Are you looking to learn?", "12:34 PM"),
            Email("Chris Abad", "Campaign Monitor", "Let us know your thoughts!", "11:22 AM"),
            Email("Tuto.com", "Free Course", "Learn Photoshop, SEO, and more!", "11:04 AM"),
            Email("Support", "Account Update", "Your account has been updated.", "10:26 AM"),
            Email("Matt from Ionic", "New Features", "Check out the new Creator features!", "10:00 AM"),
            Email("Newsletter", "Weekly Updates", "Don't miss this week's news!", "9:45 AM"),
            Email("John Doe", "Meeting Reminder", "Don't forget our meeting at 3 PM.", "9:30 AM"),
            Email("Jane Smith", "Project Details", "Here are the details for the new project.", "9:15 AM"),
            Email("GitHub", "New Repository", "A new repo has been created.", "8:55 AM"),
            Email("LinkedIn", "Connection Request", "You have a new connection request.", "8:30 AM"),
            Email("Amazon", "Order Confirmation", "Your order has been shipped.", "8:00 AM")
        )
            // Add more items...

        val adapter = EmailAdapter(emails)
        recyclerView.adapter = adapter
    }
}