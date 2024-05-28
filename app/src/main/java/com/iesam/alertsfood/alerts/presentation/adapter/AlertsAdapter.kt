package com.iesam.alertsfood.alerts.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iesam.alertsfood.R
import com.iesam.alertsfood.alerts.domain.Alert

class AlertsAdapter(private val data: List<Alert>): Adapter<AlertsViewHolder> {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_alert, parent, false)
        return AlertsViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: AlertsViewHolder, position: Int) {
        holder.itemView = data[position]
    }
}