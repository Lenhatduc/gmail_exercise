package com.example.gmail_exercise

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.TextView
import android.view.View

class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.bind(email)
    }

    override fun getItemCount(): Int = emails.size

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val icon: TextView = itemView.findViewById(R.id.icon)
        private val sender: TextView = itemView.findViewById(R.id.sender)
        private val subject: TextView = itemView.findViewById(R.id.subject)
        private val preview: TextView = itemView.findViewById(R.id.preview)
        private val time: TextView = itemView.findViewById(R.id.time)

        fun bind(email: Email) {
            icon.text = email.sender.first().toString()
            sender.text = email.sender
            subject.text = email.subject
            preview.text = email.preview
            time.text = email.time
        }
    }
}