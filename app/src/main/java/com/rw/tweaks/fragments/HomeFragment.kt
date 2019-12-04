package com.rw.tweaks.fragments

import androidx.fragment.app.Fragment
import com.rw.tweaks.R
import com.rw.tweaks.util.updateTitle

class HomeFragment : Fragment(R.layout.home) {
    override fun onResume() {
        super.onResume()

        updateTitle(R.string.home)
    }
}