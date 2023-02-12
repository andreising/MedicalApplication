package fragments_main

import android.os.Bundle
import android.os.Message
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMainPageBinding
import fragments_main_page.HomeFragment
import fragments_main_page.MessageFragment
import fragments_main_page.SearchFragment
import helpers.setFragment
import home.InnovationFragment


class PageMainFragment : Fragment() {
    lateinit var binding: FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView3.text = "done"
        bottomNavigation()
        binding.imageViewToolbar.setOnClickListener {
            binding.textView3.text = "ff"
        }

    }
    private fun bottomNavigation() {
        binding.bnv.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home -> {
                    setFragment(HomeFragment(), R.id.fragmentContainerViewMain)
                }
                R.id.messages -> {
                    setFragment(MessageFragment(), R.id.fragmentContainerViewMain)
                }
                R.id.search -> {
                    setFragment(SearchFragment(), R.id.fragmentContainerViewMain)
                }
                else ->{

                }
            }
            true
        }
    }

        fun newInstance() = PageMainFragment()

}