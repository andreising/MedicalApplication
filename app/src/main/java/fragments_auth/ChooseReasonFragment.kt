package fragments_auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentChooseReasonBinding

class ChooseReasonFragment : Fragment() {
    private lateinit var binding: FragmentChooseReasonBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChooseReasonBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = findNavController()
        binding.apply {
            cureMe.setOnClickListener {
                controller.navigate(ChooseReasonFragmentDirections.actionChooseReasonFragmentToLogUpFragment(
                    PATIENT))
            }
            lookFor.setOnClickListener {
                controller.navigate(R.id.patientPhoneFragment)
            }
            elseTV.setOnClickListener {
                controller.navigate(ChooseReasonFragmentDirections.actionChooseReasonFragmentToLogUpFragment(
                    OTHER))
            }
        }
    }
        fun newInstance() = ChooseReasonFragment()
}


const val PATIENT = "patient"
const val OTHER = "other"