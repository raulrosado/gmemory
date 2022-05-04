package com.serproteam.gmemory.data.model.services

import androidx.fragment.app.Fragment
import com.serproteam.gmemory.ui.fragment.slider.Levels
import com.serproteam.gmemory.ui.fragment.slider.Personajes
import java.util.logging.Level

class GetSliderList {
    fun getSliderList():ArrayList<Fragment>{
        val fragmentList = ArrayList<Fragment>()

        fragmentList.add(Levels())
        fragmentList.add(Personajes())

        return fragmentList
    }
}