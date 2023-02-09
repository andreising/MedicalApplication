package fragments_auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentLogUpBinding

class LogUpFragment : Fragment() {
    private lateinit var binding: FragmentLogUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLogUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = findNavController()
        binding.checkBox.setOnClickListener {
            if (binding.checkBox.isChecked) controller.navigate(R.id.chooseReasonFragment)
        }
    }

        fun newInstance() = LogUpFragment()
}
