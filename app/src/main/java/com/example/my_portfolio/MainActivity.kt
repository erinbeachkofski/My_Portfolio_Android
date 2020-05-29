package com.example.my_portfolio

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import com.airbnb.lottie.LottieAnimationView
import java.time.LocalDate


class MainActivity : FragmentActivity() {

    lateinit var mFragment: Fragment
    lateinit var animation_my_name_is : LottieAnimationView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        // ------- BIRTHDAY EASTER EGG -------
        // If it's my birthday, show cake video on launch screen
        // If not, go straight to home screen.

        var birthday : String = LocalDate.of(1111, 6,2).toString()
        var today : String = LocalDate.now().toString()

        birthday = birthday.substring(5)
        today = today.substring(5)

        if (today.equals(birthday)) {
            Log.d("GO TO BIRTHDAY FRAGMENT", birthday)
//            val fragment = BirthdayFragment()
//            fragmentTransaction.replace(R.id.home_container, fragment)
        } else {
            val fragment = HomeFragment()
            fragmentTransaction.replace(R.id.home_container, fragment)
        }
        fragmentTransaction.commit()
    }
}
