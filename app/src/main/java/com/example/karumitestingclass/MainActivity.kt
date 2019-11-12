package com.example.karumitestingclass

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ViewTranslator {
    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    private val presenter = Presenter(LogIn(), LogOut(SystemClock()), this)
    override fun hideLogInForm() {
        userName.visibility = View.GONE
        userNameEditText.visibility = View.GONE
        pass.visibility = View.GONE
        passEditText.visibility = View.GONE
        logInButton.visibility = View.GONE
    }

    override fun hideLogOutForm() {
        logOutButton.visibility = View.GONE
    }

    override fun showLogInForm() {
        userName.visibility = View.VISIBLE
        userNameEditText.visibility = View.VISIBLE
        pass.visibility = View.VISIBLE
        passEditText.visibility = View.VISIBLE
        logInButton.visibility = View.VISIBLE
    }

    override fun showLogOutForm() {
        logOutButton.visibility = View.VISIBLE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        logInButton.setOnClickListener {
            val username = userNameEditText.text.toString()
            val password = passEditText.text.toString()
            presenter.onLogInButtonClick(username, password)
        }

        logOutButton.setOnClickListener {
            presenter.onLogOutButtonClick()
        }

    }
}
