package fragments_auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.core.content.ContextCompat

import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentLogUpBinding

class LogUpFragment : Fragment() {
    private lateinit var binding: FragmentLogUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLogUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = findNavController()
        val args: LogUpFragmentArgs by navArgs()
        val status = args.MyArgs
        if(status== PATIENT) {
            binding.apply {
                linSecond.visibility = View.GONE
                linThird.visibility = View.GONE
            }
        }

        binding.buttonContinueSecond.setOnClickListener {
            controller.navigate(R.id.enterCodeFragment)
        }
        if (!binding.checkBox.isChecked) binding.buttonContinueSecond.isClickable = false
        binding.checkBox.setOnClickListener {
            if (binding.checkBox.isChecked) {
                binding.buttonContinueSecond.apply {
                    background = ContextCompat.getDrawable(requireActivity().applicationContext, R.drawable.button)
                    isClickable = true
                }
            } else {
                binding.buttonContinueSecond.apply {
                    background = ContextCompat.getDrawable(requireActivity().applicationContext, R.drawable.unactive_button)
                    isClickable = false
                }
            }
        }
    }

        fun newInstance() = LogUpFragment()
}
