package com.ubaya.projectuts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ubaya.projectuts.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGame.setOnClickListener{
            val action = MainFragmentDirections.actionGameFragmen()
            Navigation.findNavController(it).navigate(action)
        }
        binding.btnProfile.setOnClickListener{
            val action = MainFragmentDirections.actionProfileFragmen()
            Navigation.findNavController(it).navigate(action)
        }
        binding.btnSchedule.setOnClickListener{
            val action = MainFragmentDirections.actionScheduleFragmen()
            Navigation.findNavController(it).navigate(action)
        }
    }

}