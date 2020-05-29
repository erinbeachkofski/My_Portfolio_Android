package com.example.my_portfolio

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.lottie.LottieAnimationView

class HomeFragment : Fragment() {

    lateinit var mView : View
    lateinit var mRightArrow : LottieAnimationView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Initialize class members
        mView = inflater.inflate(R.layout.fragment_home, container, false)
        mRightArrow = mView.findViewById(R.id.right_arrow)

        // Do what needs to be done when view appears
        playRightArrowAnimation()

        return mView
    }


    /**
     * Uses timer to play right arrow animation after 2 seconds.
     */
    fun playRightArrowAnimation(){
        val handler = Handler()
        handler.postDelayed({ // Do something after 5s = 5000ms
            mRightArrow.repeatCount = 0
            mRightArrow.speed = 0.5f
            mRightArrow.playAnimation()
        }, 1000)
    }

}