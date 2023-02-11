package fragments_auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentLogInBinding

class LogInFragment : Fragment() {
    private lateinit var binding: FragmentLogInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLogInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = findNavController()
        binding.apply {
            textViewForgotPassword.setOnClickListener {
                controller.navigate(R.id.passwordRecoveryFragment2)
            }
            tvLogUp.setOnClickListener {
                controller.navigate(R.id.chooseReasonFragment)
            }
            buttonEnter.setOnClickListener {
                startActivity(Intent(activity, MainActivity::class.java))
            }
        }


    }

    fun newInstance() = LogInFragment()
}