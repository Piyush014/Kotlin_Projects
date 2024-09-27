package com.piyush.a18_fragment_lifecycle

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val toast = Toast.makeText(context, "onCreate() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
        val toast = Toast.makeText(context, "onCreateView() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(context, "onDestroy() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(context, "onStart() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val toast = Toast.makeText(context, "onAttach() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        val toast = Toast.makeText(context, "onDestroyView() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onDetach() {
        super.onDetach()
        val toast = Toast.makeText(context, "onDetach() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(context, "onPause() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(context, "onStop() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(context, "onResume() Called From Fragment2", Toast.LENGTH_LONG).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toast = Toast.makeText(context, "onViewCreated() Called From Fragment2", Toast.LENGTH_LONG).show()
    }
}