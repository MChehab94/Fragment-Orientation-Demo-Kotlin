package mchehab.com.fragmentorientation

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_person.*
import org.parceler.Parcels

class PersonFragment : Fragment() {

    var person: Person? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_person, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(savedInstanceState != null){
            person = Parcels.unwrap(savedInstanceState.getParcelable("person"))
        }else{
            getArgument()
        }

        editTextFirstName.setText(person?.firstName)
        editTextLastName.setText(person?.lastName)
        editTextAge.setText(" ${person?.age}")
    }

    private fun getArgument(){
        val bundle = arguments
        person = Parcels.unwrap(bundle.getParcelable("person"))
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable("person", Parcels.wrap(person))
    }

}// Required empty public constructoruired empty public constructor