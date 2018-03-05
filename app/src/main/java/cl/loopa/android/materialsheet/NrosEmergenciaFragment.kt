package cl.loopa.android.materialsheet

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [NrosEmergenciaFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [NrosEmergenciaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NrosEmergenciaFragment : DialogFragment() {

    // http://www.androidbegin.com/tutorial/android-dialogfragment-tutorial/
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_nros_emergencia, container,
                false)
        dialog.setTitle("DialogFragment Tutorial")
        // Do something else
        return rootView
    }

}// Required empty public constructor
