package com.lutas.navigationdemo

import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {
    abstract fun onBackPress()
}