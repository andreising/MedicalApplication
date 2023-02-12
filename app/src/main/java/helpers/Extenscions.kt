package helpers

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer

fun Fragment.setFragment(fragment: Fragment, container: Int) {
    (activity as AppCompatActivity).supportFragmentManager
        .beginTransaction()
        .replace(container, fragment)
        .commit()
}
fun AppCompatActivity.setFragment(fragment: Fragment, container: Int) {
    this.supportFragmentManager
        .beginTransaction()
        .replace(container, fragment)
        .commit()
}