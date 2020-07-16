package com.mitchelletakuro.takurogbemisola.view.ui.car_owners

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mitchelletakuro.takurogbemisola.R
import com.mitchelletakuro.takurogbemisola.data.models.CarOwner
import com.mitchelletakuro.takurogbemisola.data.models.FilterModel
import com.mitchelletakuro.takurogbemisola.view.ui.car_owners.adapters.CarOwnerAdapter

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class CarOwnerDetailsFragment : Fragment() {

    lateinit var carOwnersList: ArrayList<CarOwner>

    lateinit var ownersRecyclerView: RecyclerView


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.car_owners_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        ownersRecyclerView = view.findViewById(R.id.car_owner_details)
        ownersRecyclerView.setHasFixedSize(true)
        ownersRecyclerView.layoutManager = LinearLayoutManager(activity)

    }
}