package com.marty.behaviortracker.ui.behavior

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.mvrx.Async
import com.airbnb.mvrx.BaseMvRxFragment
import com.airbnb.mvrx.MvRxState
import com.airbnb.mvrx.Uninitialized
import com.marty.behaviortracker.R
import com.marty.behaviortracker.data.Behavior
import kotlinx.android.synthetic.main.fragment_behavior_count.*

data class BehaviorState(val behavior: Async<Behavior> = Uninitialized) : MvRxState

class BehaviorFragment : Fragment() {

    private var behaviorCount = 0
    //test
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_behavior_count, null)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        behavior_count_text.text = behaviorCount.toString()
        view?.setOnClickListener {
            behaviorCount++
            behavior_count_text.text = behaviorCount.toString()
        }
    }
}
