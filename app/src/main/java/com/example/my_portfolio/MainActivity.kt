package com.example.my_portfolio

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import com.airbnb.lottie.LottieAnimationView


class MainActivity : FragmentActivity() {

    lateinit var mFragment: Fragment
    lateinit var animation_my_name_is : LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = HomeFragment()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()

    }
}
