package adapters

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.SearchHistoryItemBinding

class SearchHistoryAdapter(private val searchHistory: List<Any>): RecyclerView.Adapter<SearchHistoryAdapter.SearchHistoryHolder>() {
    class SearchHistoryHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = SearchHistoryItemBinding.bind(view)
        fun bind(item: Any) {

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHistoryHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_tag_item, parent,false)
        return SearchHistoryHolder(view)
    }

    override fun getItemCount(): Int {
        return searchHistory.size
    }

    override fun onBindViewHolder(holder: SearchHistoryHolder, position: Int) {
        holder.bind(searchHistory[position])
    }
}