package mchehab.com.fragmentorientation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.parceler.Parcels

class MainActivity : AppCompatActivity() {

    val personFragment = PersonFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            val bundle = Bundle()
            val person = Person("first name", "last name", 20)
            bundle.putParcelable("person", Parcels.wrap(person))
            personFragment.arguments = bundle
            fragmentManager.beginTransaction().add(R.id.frameLayout, personFragment).commit()
        }
    }
}