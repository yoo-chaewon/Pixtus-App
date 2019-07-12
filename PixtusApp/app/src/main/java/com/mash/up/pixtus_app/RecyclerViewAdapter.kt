package com.mash.up.pixtus_app

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mash.up.pixtus_app.core.Excercises
import com.mash.up.pixtus_app.ui.view.WorkoutDetailActivity

class RecyclerViewAdapter(val list: List<Excercises>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(excercises: Excercises) {
            //view.findViewById<ImageView>(R.id.img_workoutlist).setImageResource(WorkOut.image)
            view.findViewById<TextView>(R.id.tv_workout_name).text = excercises.name
            view.findViewById<TextView>(R.id.tv_workout_kcal).text = excercises.kcal.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_workout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(list[position] as Excercises)
        holder.view.setOnClickListener {

            val nextIntent = Intent(holder.view.context, WorkoutDetailActivity::class.java)
            nextIntent.putExtra("workout_id", list.get(position).exerciseId)
            holder.view.context.startActivity(nextIntent)
        }
    }
}