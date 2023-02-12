package fragments_main_page

import adapters.Clicker
import adapters.HomeTagAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentHomeBinding
import helpers.setFragment
import home.*


class HomeFragment : Fragment(), Clicker {
    private val fragmentList = listOf<Fragment>(
        InnovationFragment.newInstance(),
        NewsFragment.newInstance(),
        ShopFragment.newInstance(),
        GroupsFragment.newInstance(),
        FundFragment.newInstance(),
        ReviewFragment.newInstance()
        )
    lateinit var binding: FragmentHomeBinding
    lateinit var adapter: HomeTagAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterInit()
        parentFragment
        setFragment(InnovationFragment(), R.id.fragmentHomeHolder)
    }
        private fun adapterInit() {
            val list = resources.getStringArray(R.array.news).toList()
            adapter = HomeTagAdapter(list, this)
            binding.newsRecycler.layoutManager = LinearLayoutManager(activity as AppCompatActivity, LinearLayoutManager.HORIZONTAL,false)
            binding.newsRecycler.adapter = adapter
        }
        fun newInstance() =
            HomeFragment()

    override fun changeFragment(position: Int) {
        this.setFragment(fragmentList[position], R.id.fragmentHomeHolder)
    }



}

