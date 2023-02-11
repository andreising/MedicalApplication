package fragments_auth

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentEnterCodeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class EnterCodeFragment : Fragment() {
    private lateinit var binding: FragmentEnterCodeBinding
    private lateinit var timer: CountDownTimer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEnterCodeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        timer = object : CountDownTimer(59000,1000) {

            override fun onTick(p0: Long) {
                val text = "0:"+(p0/1000).toString()
                binding.timerTV.text = text
            }

            override fun onFinish() {
                binding.timerTV.text = resources.getString(R.string.resend_code)
            }

        }.start()
        binding.buttonLogUp.setOnClickListener {
            startActivity(Intent(activity, MainActivity::class.java))
        }
    }


        fun newInstance() =
            EnterCodeFragment()
}
