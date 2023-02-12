package adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.NewsTagItemBinding

class HomeTagAdapter(private val list: List<String>, val clicker: Clicker): RecyclerView.Adapter<HomeTagAdapter.NewsTagsHolder>() {
    class NewsTagsHolder(view: View): RecyclerView.ViewHolder(view) {
        private val binding = NewsTagItemBinding.bind(view)
        fun bind(word: String, clicker: Clicker){
            binding.item.text = word
            binding.cardView.setOnClickListener {
                clicker.changeFragment(adapterPosition)
                it.setBackgroundResource(R.drawable.button)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsTagsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_tag_item, parent, false)
        return NewsTagsHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: NewsTagsHolder, position: Int) {
        holder.bind(list[position], clicker)
    }
}

interface Clicker{
    fun changeFragment(position: Int)
}