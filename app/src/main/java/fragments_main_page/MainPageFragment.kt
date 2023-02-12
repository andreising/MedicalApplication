package fragments_main_page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R

import com.example.myapplication.databinding.FragmentMainPageBinding
import helpers.setFragment

class MainPageFragment : Fragment() {
        lateinit var binding: FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFragment(HomeFragment(), R.id.fragmentContainerViewMain)
        bottomNavigation()
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

        fun newInstance() = MainPageFragment()
}