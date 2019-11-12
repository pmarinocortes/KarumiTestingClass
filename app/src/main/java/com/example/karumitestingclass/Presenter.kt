package com.example.karumitestingclass

import kotlinx.coroutines.runBlocking

class Presenter (
    val logIn: LogIn,
    val logOut: LogOut,
    val view: ViewTranslator
) {
    fun onLogInButtonClick(user: String, pass: String) {
        runBlocking {
            if (logIn.logIn(user, pass)) {
                view.hideLogInForm()
                view.showLogOutForm()
            } else {
                view.showError("Oops, credenciales incorrectas")
            }
        }

    }

    fun onLogOutButtonClick() {
        runBlocking {
            if (logOut.logOut()) {
                view.hideLogOutForm()
                view.showLogInForm()
            } else {
                view.showError("Oops, log out error")
            }
        }

    }
}

interface ViewTranslator{
    fun hideLogInForm()
    fun hideLogOutForm()
    fun showLogInForm()
    fun showLogOutForm()
    fun showError(message: String)
}